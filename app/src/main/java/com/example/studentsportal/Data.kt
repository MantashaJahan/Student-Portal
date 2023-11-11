package com.example.studentsportal

import java.sql.Timestamp

data class Data(
    var id:String? = null,
    var studentid:String? = null,
    val name:String? = null,
    val email:String? = null,
    val subject:String? = null,
    val birthdate:String? = null,
    val timestamp: Timestamp?= null
)
