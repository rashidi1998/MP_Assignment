package com.example.dinner

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    var list = ArrayList<String>();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add("Hamburger")
        list.add("Pizza")
        list.add("American")
        list.add("Chinese")
        list.add("Mexican")

    }

    fun decide(view: View){
        val result = findViewById<TextView>(R.id.result)


        var rand = Random()
        var selection = rand.nextInt(list.size)


        result.text ="${list[selection]}"


    }

    fun addFood(view: View){

        val addedFood = findViewById<EditText>(R.id.food)

        list.add(addedFood.text.toString())

        addedFood.text.clear()

    }

}

