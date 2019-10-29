package com.example.responsi_data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.register.*

class ActivityKedua: AppCompatActivity() {
    private lateinit var namedata: EditText
    private lateinit var alamtdata: EditText
    private lateinit var emaildata: EditText
    private lateinit var btnGet: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        namedata =findViewById(R.id.namedat)
        alamtdata = findViewById(R.id.alamat)
        emaildata = findViewById(R.id.email)
        btnGet = findViewById(R.id.btn_tmbl)


        btn_tmbl.setOnClickListener {

            val getdata = Intent(this, ActivityKetiga::class.java)
            getdata.putExtra("GetNama", namedata.text.toString())
            getdata.putExtra("GetAlamat", alamtdata.text.toString())
            getdata.putExtra("GetEmail", emaildata.text.toString())
            startActivity(getdata)
        }
    }
}
