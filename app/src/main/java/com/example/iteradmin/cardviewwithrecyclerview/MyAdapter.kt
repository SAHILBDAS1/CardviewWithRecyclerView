package com.example.iteradmin.cardviewwithrecyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class MyAdapter (Context): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private val mContext:Context
    init {
        this.mContext= Context
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {

}

    class MyViewHolder {

    }
}