package com.example.loginapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Type

class wisataAdapter  (private val namaList: ArrayList<ItemData>):RecyclerView.Adapter<wisataAdapter.MyViewHolder>(){

    private lateinit var mListener: onItemClickListener

    interface  onItemClickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    class MyViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){
        val gambar:ImageView = itemView.findViewById(R.id.dataimg)
        val judul:TextView = itemView.findViewById(R.id.tmpt)


        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  itemView = LayoutInflater.from(parent.context).inflate(R.layout.data_data,parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder:  MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.judul.text = currentItem.judul
    }

    override fun getItemCount(): Int {
        return namaList.size
    }


}