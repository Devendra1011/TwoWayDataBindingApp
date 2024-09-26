package com.example.databindingapp

import android.content.Context
import android.view.View
import android.widget.Toast

class VehicleClickHandler(var context:Context) {

    fun displayToastMessage(view: View){
        Toast.makeText(context,"YOu CLicked the Button", Toast.LENGTH_SHORT).show()
    }
}