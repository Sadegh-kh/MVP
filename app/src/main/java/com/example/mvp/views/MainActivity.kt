package com.example.mvp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mvp.MainContract
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.model.Student
import com.example.mvp.presenter.MainPresenter

class MainActivity : AppCompatActivity(),MainContract.View {
    lateinit var binding: ActivityMainBinding
    private val mainPresenter :MainContract.Presenter = MainPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        mainPresenter.onAttach(this)
    }

    override fun showStudentUsers(users: ArrayList<Student>) {
        Log.v("testStudentUser",users.toString())
    }

    override fun onDestroy() {
        mainPresenter.onDetach()
        super.onDestroy()
    }
}