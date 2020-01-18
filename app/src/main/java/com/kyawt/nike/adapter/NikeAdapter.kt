package com.kyawt.nike.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.nike.NikeModel
import com.kyawt.nike.R
import java.util.zip.Inflater

class NikeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    var item_name = itemView.findViewById<TextView>(R.id.item_name)
    var item_no = itemView.findViewById<TextView>(R.id.item_no)
    var item_img = itemView.findViewById<ImageView>(R.id.item_img)
    var item_price = itemView.findViewById<TextView>(R.id.item_price)
}

class NikeAdapter (var NikeList : ArrayList<NikeModel>) : RecyclerView.Adapter<NikeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NikeViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.nike_item,parent,false)
        return NikeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return NikeList.size
    }

    override fun onBindViewHolder(holder: NikeViewHolder, position: Int) {
        holder.item_name.text = NikeList[position].name
        holder.item_no.text = NikeList[position].number.toString()
        holder.item_img.setImageResource(NikeList[position].image)
        holder.item_price.text = NikeList[position].price.toString()
    }
}