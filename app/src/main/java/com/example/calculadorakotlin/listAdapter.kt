package com.example.calculadorakotlin

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class listAdapter(private var lista:List<listOperaciones>,
                  private var layout: LayoutInflater,
                  private var context:Context) : RecyclerView.Adapter<listAdapter.ViewHolder>(),
    Parcelable {
    class ViewHolder : RecyclerView.ViewHolder( ) {

    }

    constructor(parcel: Parcel) : this(TODO("null")) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<listAdapter> {
        override fun createFromParcel(parcel: Parcel): listAdapter {
            return listAdapter(parcel)
        }

        override fun newArray(size: Int): Array<listAdapter?> {
            return arrayOfNulls(size)
        }
    }
}