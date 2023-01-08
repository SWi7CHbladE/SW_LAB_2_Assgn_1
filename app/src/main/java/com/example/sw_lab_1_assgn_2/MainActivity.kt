package com.example.sw_lab_1_assgn_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.Process)
        var output = findViewById<TextView>(R.id.Output)
        var input = findViewById<EditText>(R.id.Message)


        button.setOnClickListener {


            output.text = "Number of Vowels = 5"
        }

    }
}