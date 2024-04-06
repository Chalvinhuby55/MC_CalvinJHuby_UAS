package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.loginapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lgBtn.setOnClickListener {
            val intenhome = Intent(this, Home::class.java)
            startActivity(intenhome)
        }
        binding.daftar.setOnClickListener {
            val intenreg = Intent(this, RegisterAplication::class.java)
            startActivity(intenreg)
        }

        binding.forget.setOnClickListener {
            val intenforgot = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intenforgot)
        }


    }
}

