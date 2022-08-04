package com.example.mvp.views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvp.MainContract
import com.example.mvp.model.Student
import com.example.mvp.presenter.MainPresenter

class FragmentTest:Fragment(),MainContract.View {
    private val mainPresenter:MainContract.Presenter=MainPresenter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        mainPresenter.onAttach(this)
        super.onStart()
    }

    override fun showStudentUsers(users: ArrayList<Student>) {
        Log.v("FragmentTest",users.toString())
    }

    override fun onStop() {
        mainPresenter.onDetach()
        super.onStop()
    }
}