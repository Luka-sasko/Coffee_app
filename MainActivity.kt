package com.example.coffe_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coffe_app.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder


class MainActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val db=FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.feedbackRecyclerView.layoutManager=LinearLayoutManager(this)


        fetchData()

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, AppActivity::class.java))
            finish()
        }
    }

    private fun fetchData() {
        db.collection("Revisions")
            .get()
            .addOnSuccessListener {

                val adapter=GroupAdapter<ViewHolder>()

                for (document in it){

                    val feedback=it.toObjects(Feedbacks::class.java)
                    adapter.add(FeedbackAdapter(feedback))
                }
                binding.feedbackRecyclerView.adapter=adapter

            }
    }
}




