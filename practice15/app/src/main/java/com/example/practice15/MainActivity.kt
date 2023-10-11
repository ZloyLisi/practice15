package com.example.practice15

import android.content.Intent
import android.icu.text.IDNA.Info
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {
        val breedText : TextView = findViewById(R.id.breed)
        val yearText : TextView = findViewById(R.id.year)
        val monthText : TextView = findViewById(R.id.month)

        var breed : String = ""
        var year : Int = 0
        var month : Int = 0


        if (breedText.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast1, Toast.LENGTH_SHORT)
            toast.show()
            breedText.requestFocus()
        }
        else if (yearText.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast2, Toast.LENGTH_SHORT)
            toast.show()
            yearText.requestFocus()
        }
        else if (monthText.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast3, Toast.LENGTH_SHORT)
            toast.show()
            monthText.requestFocus()
        }
        else {
            breed = breedText.text.toString()
            year = yearText.text.toString().toInt()
            month = monthText.text.toString().toInt()

            val animal: Animal = Animal(breed,year,month)

            val intent: Intent = Intent(this@MainActivity,InfoActivity::class.java)
            intent.putExtra(animal.javaClass.simpleName,animal)
            startActivity(intent)}


        }
}