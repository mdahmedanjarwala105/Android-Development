package com.MAA.maa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotActivity : AppCompatActivity() {

    lateinit var et_mobile_number3 : EditText
    lateinit var et_email2 : EditText
    lateinit var btn_register1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        et_mobile_number3 = findViewById(R.id.et_mobile_number3)
        et_email2 = findViewById(R.id.et_email2)
        btn_register1 = findViewById(R.id.btn_register1)

        btn_register1.setOnClickListener() {

            val intent = Intent(this@ForgotActivity, ForgotWelcomeActivity::class.java)
            intent.putExtra("mobileNum1", et_mobile_number3.text.toString())
            intent.putExtra("email2", et_email2.text.toString())
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}