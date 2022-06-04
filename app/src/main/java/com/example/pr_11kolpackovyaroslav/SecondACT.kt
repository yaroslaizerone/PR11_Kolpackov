package com.example.pr_11kolpackovyaroslav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondACT : AppCompatActivity() {
    private lateinit var buttonsa: Button
    private lateinit var buttonsa_2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        buttonsa = findViewById(R.id.butrti_1)
        buttonsa_2 = findViewById(R.id.butrti_2)
        buttonsa.setOnClickListener{
            val intent = Intent(this,tried::class.java)
            startActivity(intent)
        }
        buttonsa_2.setOnClickListener{
            val intent = Intent(this,tried::class.java)
            startActivity(intent)
        }
        val actionBar = supportActionBar
        actionBar!!.title = "Страница 2"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

}