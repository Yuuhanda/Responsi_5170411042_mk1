package com.example.responsi_data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            username =findViewById(R.id.user)
            password = findViewById(R.id.password)

            register.setOnClickListener {
                val movetoregister = Intent(this, ActivityKedua::class.java)
                startActivity(movetoregister)
            }

            login.setOnClickListener {
                val movetologin = Intent(this, ActivityKetiga::class.java)

                startActivity(movetologin)
            }

        }
}
