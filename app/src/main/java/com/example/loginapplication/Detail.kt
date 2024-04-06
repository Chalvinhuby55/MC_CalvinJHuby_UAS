package com.example.loginapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Wgambar : ImageView = findViewById(R.id.dimg)
        val Wjudul : TextView = findViewById(R.id.judul)

        val Wdetaill : TextView = findViewById(R.id.detail)


        val bundle: Bundle?= intent.extras
        val bJudul = bundle!!.getString("jdl")
        val bGambar = bundle.getInt("img")

        val bDetail = bundle.getString("dtl")



        Wgambar.setImageResource(bGambar)
        Wjudul.text = bJudul
        Wdetaill.text = bDetail
    }
}