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


        fun countVowels(text:String):Int {
            var result: Int = 0
            var flag: Int = 0
            var charToCheck: Char
            while (flag < text.length) {
                charToCheck = text.get(flag)
                flag += 1
                if ((charToCheck == 'a') || (charToCheck == 'e') || (charToCheck == 'i') || (charToCheck == 'o') || (charToCheck == 'u')
                    || (charToCheck == 'A') || (charToCheck == 'E') || (charToCheck == 'I') || (charToCheck == 'O') || (charToCheck == 'U')
                )
                    result += 1
            }
                return result

        }

        fun countCharacters(text:String):Int{
            var result: Int = 0
            var flag: Int = 0
            var charToCheck: Char
            while (flag < text.length) {
                charToCheck = text.get(flag)
                flag += 1
                if ((charToCheck != ' ') && (charToCheck != '.') && (charToCheck != ','))
                    result += 1
            }
            return result
        }

        button.setOnClickListener {


            output.text = "The number of vowels are " + countVowels(input.text.toString()).toString() + "\n And the number of consonants is " + (countCharacters(input.text.toString()) - countVowels(input.text.toString())).toString()
        }

    }
}