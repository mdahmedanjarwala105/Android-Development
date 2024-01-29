package com.MAA.maa

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var et_mobile_number1 : EditText
    lateinit var et_password : EditText
    lateinit var btn_login : Button
    lateinit var txt_forgotPass : TextView
    lateinit var txt_dont_have_account : TextView
    lateinit var sharedPreferences: SharedPreferences

    var validMobileNumber = "1234567890"
    var validPassword = "hellohi"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        setContentView(R.layout.activity_login)

        if(isLoggedIn) {
            val intent = Intent(this@LoginActivity, WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        et_mobile_number1 = findViewById(R.id.et_mobile_number1)
        et_password = findViewById(R.id.et_password)
        btn_login = findViewById(R.id.btn_login)
        txt_forgotPass = findViewById(R.id.txt_forgotPass)
        txt_dont_have_account = findViewById(R.id.txt_dont_have_account)

        btn_login.setOnClickListener{

            val mobileNumber = et_mobile_number1.text.toString()
            val password = et_password.text.toString()

            if (mobileNumber == validMobileNumber) {
                if (password == validPassword) {
                    sharedPreferences(mobileNumber, password)
                    val intent = Intent(this@LoginActivity, WelcomeActivity::class.java)
                    startActivity(intent)
                }
            }
            else {
                Toast.makeText(this@LoginActivity, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }
        }

        txt_forgotPass.setOnClickListener {
            val intent = Intent(this@LoginActivity, ForgotActivity::class.java)
            startActivity(intent)
        }

        txt_dont_have_account.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun sharedPreferences(mobileNumber: String, password: String) {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
        sharedPreferences.edit().putString("mobileNumber", mobileNumber).apply()
        sharedPreferences.edit().putString("password", password).apply()
    }
}