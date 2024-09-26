package com.nirmal.cric.pojo

import com.google.gson.annotations.SerializedName

data class Cricket(

	@field:SerializedName("score1")
	val score1: Int? = null,

	@field:SerializedName("team1")
	val team1: String? = null,

	@field:SerializedName("score2")
	val score2: Int? = null,

	@field:SerializedName("team2")
	val team2: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)
