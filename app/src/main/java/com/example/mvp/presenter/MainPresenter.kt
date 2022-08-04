package com.example.mvp.presenter

import android.view.View
import com.example.mvp.MainContract
import com.example.mvp.model.Model
import com.example.mvp.views.MainActivity

class MainPresenter:MainContract.Presenter {
    private var mainView:MainContract.View? = null
    override fun onAttach(view: MainContract.View) {
        mainView=view
        mainView!!.showStudentUsers(Model().getUsers())

    }

    override fun onDetach() {
        mainView=null
    }
}