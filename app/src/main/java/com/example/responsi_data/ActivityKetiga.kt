package com.example.responsi_data

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.out_data.*

class ActivityKetiga: AppCompatActivity(){
    private lateinit var namdat: TextView
    private lateinit var almdat: TextView
    private lateinit var emdat: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.out_data)

        namdat =findViewById(R.id.nama)
        almdat = findViewById(R.id.almt)
        emdat = findViewById(R.id.eml)

        if (intent.extras != null) {
            namdat.setText(intent.getStringExtra("GetNama"))
            almdat.setText(intent.getStringExtra("GetAlamat"))
            emdat.setText(intent.getStringExtra("GetEmail"))
        }

        back.setOnClickListener {
            val movetoback = Intent(this, MainActivity::class.java)
            startActivity(movetoback)
        }

    }
}
