package com.example.pr_11kolpackovyaroslav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonsa: Button
    private lateinit var chkb_1:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonsa = findViewById(R.id.secondActivityBtn)
        chkb_1 = findViewById(R.id.chkb_1)
        chkb_1.setOnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                Toast.makeText(applicationContext,
                    "Вы согласились с условиями политики конфидециальности" , Toast.LENGTH_LONG).show()
                buttonsa.setOnClickListener{
                    val intent = Intent(this,SecondACT::class.java)
                    startActivity(intent)
                }
            }else{
                Toast.makeText(applicationContext,
                    "Вы отказались от условий политики конфидециальности" , Toast.LENGTH_LONG).show()
                buttonsa.setOnClickListener{
                    val intent = 0
            }
        }
    }}}