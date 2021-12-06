package com.example.guessinggame_task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import java.util.*
import kotlin.random.Random.Default.nextInt
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val randNumber = Random.nextInt(0 , 1000)
        val guessMsg = findViewById<TextView>(R.id.AnswerText)

        findViewById<TextView>(R.id.GuessButton).setOnClickListener {
            val guessInput = findViewById<TextInputLayout>(R.id.InputNumber)
            val guessNumber = guessInput.editText?.text?.toString()?.toInt()
            when {
                guessNumber == 0 -> {
                    guessMsg.text = "Enter A Valid Number"
                }
                randNumber > guessNumber!! -> {
                    guessMsg.text = "no :) My Number Is Bigger"
                }
                randNumber < guessNumber!! -> {
                    guessMsg.text = "no :) My Number Is Smaller"
                }
                randNumber == guessNumber!! -> {
                    guessMsg.text = "You Are Right !"
                }
            }
        }

    }

}