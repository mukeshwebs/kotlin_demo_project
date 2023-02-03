package com.mukesh.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mukesh.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //it means we will assign the value of var later
    //here var is used means it can be reinitialised later
//    private lateinit var ImageView: ImageView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

       //val is the final variable means we have to initialise it right away
//        val btn = findViewById<Button>(R.id.rollBtn);
//        ImageView = findViewById(R.id.dice)


//        btn.setOnClickListener { rollDice() }
        binding.rollBtn.setOnClickListener{rollDice()}
    }
//    The (1..6) syntax creates an integer range from 1 to 6.
//    The random() function is called on this range to generate a random number within that range.
    //creating the rollDice method
    private fun rollDice(){
        val randomNumb = (1..6).random()

    //when statement - similar to switch statement
    val drawableImage = when(randomNumb){
        1->R.drawable.dice_1
        2->R.drawable.dice_2
        3->R.drawable.dice_3
        4->R.drawable.dice_4
        5->R.drawable.dice_5
        else->R.drawable.dice_6
    }
//    ImageView.setImageResource(drawableImage);
    binding.dice.setImageResource(drawableImage);

    //syntax
    //binding.id.xyx

    }
}