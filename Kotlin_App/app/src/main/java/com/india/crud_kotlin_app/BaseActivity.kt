package com.india.crud_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    protected fun showToast(msg:String)
    {
        Toast.makeText(applicationContext,msg,Toast.LENGTH_LONG).show()
    }
}
