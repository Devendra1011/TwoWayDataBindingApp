package com.example.databindingapp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Vehicle() : BaseObservable() {

    val modelYear: String = ""

    // @Bindable : used to mark properties for which the data binding
    // library should generate code to handle change notification
    // It triggers automatic updates in the UI that is bound to that
    // property

    @Bindable
    var name: String = ""
        set(value){
            field = value
            notifyPropertyChanged(BR.name)
        }

}
