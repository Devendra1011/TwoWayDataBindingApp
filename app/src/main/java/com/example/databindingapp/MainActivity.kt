package com.example.databindingapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*var textView:TextView = findViewById(R.id.text_view)
        textView.text = "Hello My Friends"*/

        // Use DataBindingUtil to set the content view with data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var v1 = Vehicle()
        v1.name = "Fortuner"
        // binding.textView.text = v1.name
        binding.myVehicle = v1


        /*binding.btnClickMe.setOnClickListener{
        Toast.makeText(this,"YOu CLicked the Button", Toast.LENGTH_SHORT).show()
        }*/


        // why this is done  ?????
        // Handling Click Events
        binding.clickHandler = VehicleClickHandler(this)

        // Two-way Data Binding


    }

}