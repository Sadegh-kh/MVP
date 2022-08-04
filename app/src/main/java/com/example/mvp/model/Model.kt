package com.example.mvp.model

class Model {

    fun getUsers():ArrayList<Student>{
        val studentUser= arrayListOf(
            Student("Sadegh","Khoshbayan"),
            Student("Abas","Khoshbayan"),
            Student("Ali","Mehdizade"),
            Student("Mohamad","Sinayi"),
            Student("Hasan","Shamaizhade"),
        )
        return studentUser
    }
}