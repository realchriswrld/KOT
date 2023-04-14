package com.example.chris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Relativelayout : AppCompatActivity() {

    private lateinit var email:EditText
    private lateinit var  password:EditText
    private lateinit var loginBtn:Button
    private lateinit var  regBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relativelayout)
        email = findViewById(R.id.edtregemail)
        password = findViewById(R.id.edtregpassword)
        loginBtn = findViewById(R.id.edtloginbtn)
        regBtn = findViewById(R.id.edtregbtn)

        loginBtn.setOnClickListener {
            Toast.makeText(this, "Try to login", Toast.LENGTH_SHORT).show()
        }

    }
}