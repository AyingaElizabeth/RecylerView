package com.kotlinliza.brianrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //step one getting recyclerview
        val recyclerView:RecyclerView=findViewById(R.id.recycleView)

        //step 2 create vertical
        recyclerView.layoutManager=LinearLayoutManager(this)

        //create arraylist of itemView model
        val data= arrayListOf<ItemsViewModel>()

        // this loop will create 20 views containing the image with the count of views
        for (i in 1..20){
            data.add(ItemsViewModel(R.drawable.baseline_folder_24, "item"+1))

            //this will pass the array list to our adapter
            val adapter=Adapter(data)

            //step 6 setting the adapterwith recycler view
            recyclerView.adapter=adapter
        }


    }

}