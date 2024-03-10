package com.MAA.maa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterWelcomeActivity : AppCompatActivity() {

    private lateinit var txt_name:TextView
    private lateinit var txt_email:TextView
    private lateinit var txt_mobileNumber3:TextView
    private lateinit var txt__delivery:TextView
    private lateinit var txt_password3:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_welcome)

        txt_name = findViewById(R.id.txt_name)
        txt_email = findViewById(R.id.txt_email)
        txt_mobileNumber3 = findViewById(R.id.txt_mobileNumber3)
        txt__delivery = findViewById(R.id.txt_delivery)
        txt_password3 = findViewById(R.id.txt_password3)

        if (intent != null) {
            txt_name.text = intent.getStringExtra("name")
            txt_email.text = intent.getStringExtra("email")
            txt_mobileNumber3.text = intent.getStringExtra("mobileNum")
            txt__delivery.text = intent.getStringExtra("delivery")
            txt_password3.text = intent.getStringExtra("password1")
        }

        title = "Your Credentials"
    }
}