package com.noname.login.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.noname.login.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {


    private  val viewModel: LoginViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_login)
        val button = findViewById<Button>(R.id.login)

        button.setOnClickListener {
            viewModel.loginUser("mma","mma")
        }

        lifecycleScope.launch(Dispatchers.Main) {
            viewModel.loginFlow.collect{
                Log.d("response",it.toString())
            }
        }
    }

}