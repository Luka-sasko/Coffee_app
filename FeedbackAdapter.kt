package com.example.coffe_app

import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder

class FeedbackAdapter( val feedbackList: List<Feedbacks>) : Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.feedback_show
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        val feedbacks = feedbackList[position]
        viewHolder.itemView.findViewById<TextView>(R.id.tvComment).text=feedbacks.Comment
        viewHolder.itemView.findViewById<TextView>(R.id.tvGrade).text=feedbacks.Grade.toString()
        viewHolder.itemView.findViewById<TextView>(R.id.tvServiceQuality).text=feedbacks.ServiceQuality.toString()


    }
}