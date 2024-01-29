package com.MAA.maa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgotWelcomeActivity : AppCompatActivity() {

    lateinit var txt_mobileNumber4 : TextView
    lateinit var txt_email3 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_welcome)

        txt_mobileNumber4 = findViewById(R.id.txt_mobileNumber4)
        txt_email3 = findViewById(R.id.txt_email3)

        if (intent != null) {
            txt_mobileNumber4.text = intent.getStringExtra("mobileNum1")
            txt_email3.text = intent.getStringExtra("email2")
        }

        title = "Your Credentials"
    }
}