package com.example.affirmations.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import java.text.FieldPosition

class ItemAdapter(private val context:Context,private val dataset:List<Affirmation>)

    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()  {


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewGroup: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return dataset.size
        TODO("Not yet implemented")
    }
}

