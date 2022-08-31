package com.example.workoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //val myButton : Button = findViewById(R.id.button)
        activityMainBinding.button.setOnClickListener{changeButton()}

    }
    private fun changeButton() {
        val textViewJust : TextView = findViewById(R.id.textViewJust)
        //textViewJust.text = "NEXT"
        activityMainBinding.textViewJust.setText("NEXT")
    }
}