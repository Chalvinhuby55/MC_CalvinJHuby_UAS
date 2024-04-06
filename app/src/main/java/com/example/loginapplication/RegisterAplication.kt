package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.loginapplication.databinding.ActivityMainBinding
import com.example.loginapplication.databinding.ActivityRegisterAplicationBinding

class RegisterAplication : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterAplicationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_aplication)


        binding = ActivityRegisterAplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.log.setOnClickListener {
            val intenlog = Intent(this, MainActivity::class.java)
            startActivity(intenlog)
        }

        }
    }
