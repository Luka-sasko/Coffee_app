package com.example.coffe_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

private lateinit var feedback: Feedback

class CoffeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_coffe,container,false)

        val twCoffeName=view.findViewById<TextView>(R.id.Coffe_name)
        val Description=view.findViewById<TextView>(R.id.Description)

        val btn_revision=view.findViewById<Button>(R.id.btn_revision)

        var Name: String? = ""
        var description: String? = ""


        Name=arguments?.getString("name")
        description=arguments?.getString("desc")


        twCoffeName.text=Name
        Description.text=description


        feedback=activity as Feedback

        btn_revision.setOnClickListener {
            feedback.passFeedback("comment",0,0)
        }


        return view
    }
}