package com.atomikak.unitcalculator.adapters

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.atomikak.unitcalculator.R
import com.atomikak.unitcalculator.activities.CalculateActivity
import com.atomikak.unitcalculator.supportClasses.Category
import org.w3c.dom.Text

class CategoryAdapter(val categoryList:ArrayList<Category>,val context:Context) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHOlder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHOlder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_category_card,parent,false)
        return CategoryViewHOlder(view)
    }

    override fun getItemCount(): Int {
        return  categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHOlder, position: Int) {
        holder.image.setImageResource(categoryList[position].image)
        holder.name.setText(categoryList[position].name.toString())
        holder.my_catagory.setOnClickListener{
            val intent = Intent(context, CalculateActivity::class.java)
            intent.putExtra("units",categoryList[position].units)
            intent.putExtra("category",categoryList[position].name)
            intent.setFlags(FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }


    class CategoryViewHOlder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.c_image)
        val name : TextView = itemView.findViewById(R.id.c_name)
        val my_catagory:CardView = itemView.findViewById(R.id.my_catagory)
    }
}