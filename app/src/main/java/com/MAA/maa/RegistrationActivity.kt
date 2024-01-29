package com.MAA.maa

import android.app.StatusBarManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {

    lateinit var et_name:EditText
    lateinit var et_email1:EditText
    lateinit var et_mobile_number2:EditText
    lateinit var et_delivery:EditText
    lateinit var et_password1:EditText
    lateinit var et_password2:EditText
    lateinit var btn_register:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        title = "Register Yourself"

        et_name = findViewById(R.id.et_name)
        et_email1 = findViewById(R.id.et_email1)
        et_mobile_number2 = findViewById(R.id.et_mobile_number2)
        et_delivery = findViewById(R.id.et_delivery)
        et_password1 = findViewById(R.id.et_password1)
        et_password2 = findViewById(R.id.et_password2)
        btn_register = findViewById(R.id.btn_register)

        btn_register.setOnClickListener() {
            val password1 = et_password1.text.toString()
            val password2 = et_password2.text.toString()

            if (password1 == password2) {
                val intent = Intent(this@RegistrationActivity, RegisterWelcomeActivity::class.java)
                intent.putExtra("name", et_name.text.toString())
                intent.putExtra("email", et_email1.text.toString())
                intent.putExtra("mobileNum", et_mobile_number2.text.toString())
                intent.putExtra("delivery", et_delivery.text.toString())
                intent.putExtra("password1", password1)
                startActivity(intent)
            }
            else {
                Toast.makeText(this@RegistrationActivity, "Passwords doesn't match ", Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onPause() {
        super.onPause()
        finish()
    }
}