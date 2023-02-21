package com.example.newsfresh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val items: Unit): RecyclerView.Adapter<NewsViewHolder>() {

     // This call will be as many times as the view is visible.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
         //Used to create a xml to view via LayoutInflater
         val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
         return NewsViewHolder(view)
    }
    //There will be a call once and it is told that how many items will remain inside it.
    override fun getItemCount(): Int {
        return items.size
    }
   // Binds the data inside the hold
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem = items[position]
       holder.titleViewHolder.text = currentItem
    }

}
class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleViewHolder: TextView = itemView.findViewById(R.id.title)

}
