package com.kotlinliza.brianrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val mylist: ArrayList<ItemsViewModel>):RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflate the cardview design that is used to hold list items
        val view= LayoutInflater.from(parent.context).inflate(R.layout.cardview_design,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mylist.size


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsView=mylist[position]
        //sets the image to the image view from our itemHolder class

        holder.imageView.setImageResource(itemsView.image)

        //sets text to textview from itemHolder class(vieHolder class
        holder.textView.text=itemsView.text
    }
}
    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){

        val imageView: ImageView =itemView.findViewById(R.id.imageView)
        val textView: TextView =itemView.findViewById(R.id.textView)
    }

