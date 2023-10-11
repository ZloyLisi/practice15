package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val textInfo: TextView = findViewById(R.id.textView)

        var animal:Animal= Animal()

        val arguments:Bundle? = intent.extras
        if (arguments != null){
            animal = arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal

            textInfo.text = "month: ${animal.getMonth()} \nyear: ${animal.getYear()} \nbreed: ${animal.getBreed()} "
        }


    }
}