package com.mukesh.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //it means we will assign the value of var later
    //here var is used means it can be reinitialised later
    private lateinit var tv:TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       //val is the final variable means we have to initialise it right away
        val btn = findViewById<Button>(R.id.rollBtn);
        tv = findViewById(R.id.tv);

        btn.setOnClickListener { rollDice() }
    }
    //creating the rollDice method
    private fun rollDice(){
        val randomNumb = (1..6).random();
        tv.text = randomNumb.toString();
    }
}