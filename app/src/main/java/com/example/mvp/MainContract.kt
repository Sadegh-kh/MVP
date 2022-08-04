package com.example.mvp

import com.example.mvp.model.Student

interface MainContract {

    interface View{
        fun showStudentUsers(users:ArrayList<Student>)
    }
    interface Presenter{
        fun onAttach(view: View)
        fun onDetach()

    }
}