package com.example.coffe_app

data class Feedbacks (var Comment:String,var Grade: Int,var ServiceQuality:Int){
    constructor() : this("",0,0)
}
