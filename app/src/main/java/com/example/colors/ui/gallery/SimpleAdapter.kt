package com.example.colors.ui.gallery


import MySimpleViewHolder
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter(
    private val itemViewFile:Int,
    private val data:ArrayList<ColorModel>,
    val onItemClick:(Int, ColorModel)->Unit) : RecyclerView.Adapter<MySimpleViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MySimpleViewHolder
    {
        val itemView  = LayoutInflater.from(parent.context).inflate(itemViewFile,parent,false)
        return MySimpleViewHolder(itemView)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MySimpleViewHolder, position: Int) {
            holder.cardView.setCardBackgroundColor(Color.parseColor(data[position].hex));
    //        holder.cardView.setBackgroundColor(Color.parseColor("#FF1"))
            holder.itemView.setOnClickListener {
                onItemClick(position,data[position])
            }
    }
}