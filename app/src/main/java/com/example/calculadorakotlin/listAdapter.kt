package com.example.calculadorakotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class listAdapter(lista:MutableList<listOperaciones>, context: Context) : RecyclerView.Adapter<viewHolder>() {
    var lista:MutableList<listOperaciones> = ArrayList();
    lateinit var context: Context;

    fun listAdapter(lista:MutableList<listOperaciones>, context: Context){
        this.lista = lista
        this.context = context
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return viewHolder(inflate.inflate(R.layout.layout, null))
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val item = lista.get(position)
        holder.bind(item)
    }

}
