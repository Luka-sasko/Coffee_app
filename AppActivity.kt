package com.example.coffe_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppActivity : AppCompatActivity(),Comunicator,Feedback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        val fm=supportFragmentManager

        fm.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }
        findViewById<Button>(R.id.btn_drinks).setOnClickListener {
            fm.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()
            }
        }
        findViewById<Button>(R.id.btn_home).setOnClickListener {
            fm.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()
            }
        }
        findViewById<Button>(R.id.btn_feedback).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
    override fun passData(Name: String, Description: String) {
        val bundle = Bundle()
        bundle.putString("name",Name)
        bundle.putString("desc",Description)


        val transaction=this.supportFragmentManager.beginTransaction()
        val coffeFragment = CoffeFragment()

        coffeFragment.arguments = bundle

        transaction.replace(R.id.flFragment,coffeFragment)
        transaction.commit()

    }


    override fun passFeedback(Comment: String, Grade: Number, ServiceQuality: Number) {
        val transaction=this.supportFragmentManager.beginTransaction()
        val feedbackFragment=FeedbackFragment()
        transaction.replace(R.id.flFragment,feedbackFragment)
        transaction.commit()
    }





}