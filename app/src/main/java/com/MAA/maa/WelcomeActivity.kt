package com.MAA.maa

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    private lateinit var txt_credMobileNumber : TextView
    private lateinit var txt_credPassword : TextView
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        setContentView(R.layout.activity_welcome)

        txt_credMobileNumber = findViewById(R.id.txt_credMobileNumber)
        txt_credPassword = findViewById(R.id.txt_credPassword)

        txt_credMobileNumber.text = sharedPreferences.getString("mobileNumber", "1234567889")
        txt_credPassword.text = sharedPreferences.getString("password", "helloAndHi")
    }
}