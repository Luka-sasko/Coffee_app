package com.example.coffe_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore


class FeedbackFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_feedback,container,false)

        val submit_btn=view.findViewById<Button>(R.id.submit)
        submit_btn.setOnClickListener {

            val Comment=view.findViewById<EditText>(R.id.comment).text.toString()
            val ServiceQuality=view.findViewById<EditText>(R.id.service_quality).text.toString().toInt()
            val Grade=view.findViewById<EditText>(R.id.grade).text.toString().toInt()
            val db=FirebaseFirestore.getInstance()

            val feedback:MutableMap<String,Any> = HashMap()
            feedback["Comment"]=Comment
            feedback["ServiceQuality"]=ServiceQuality
            feedback["Grade"]=Grade
            db.collection("Revisions").add(feedback)
            Toast.makeText(context,"Your feedback successfully sent! \n Your comment: ${Comment} \n Service: ${ServiceQuality} \n App grade: ${Grade}",Toast.LENGTH_SHORT).show()



        }


        return view


    }
}