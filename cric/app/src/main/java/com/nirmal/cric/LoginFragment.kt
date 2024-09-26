package com.nirmal.cric

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.nirmal.cric.databinding.FragmentLoginBinding
import com.nirmal.cric.util.SharedPrefUtil
import com.nirmal.cric.util.Validate
import com.nirmal.cric.util.ValidateException

class LoginFragment:Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvSignup.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
        binding.btnLogin.setOnClickListener {
            try {
                Validate(binding.edtEmail).isEmptyWithTrim("Please enter email")
                    .checkEmail("Please enter valid email")
                Validate(binding.edtPassword).isEmpty("Please enter Password")
                SharedPrefUtil().init(requireContext()).flagLoggedIn()
                activity?.startActivity(Intent(context,HomeActivity::class.java)
                    .setFlags(FLAG_ACTIVITY_CLEAR_TOP))

            }catch (ex:ValidateException){
                Snackbar.make(view,ex.localizedMessage,Snackbar.LENGTH_LONG).show()
            }
        }
        }
    }





