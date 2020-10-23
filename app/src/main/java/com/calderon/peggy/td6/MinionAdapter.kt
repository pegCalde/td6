package com.calderon.peggy.td6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

class MinionAdapter(val items: Array<Minions>) : RecyclerView.Adapter<MinionAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindMinions(minions: Minions) {
            with(minions) {
                itemView.minionName.text = "$name"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val lineView = LayoutInflater.from(parent.context).inflate(R.layout.item_and_minions, parent, false)
//        return ViewHolder(lineView)
        return ViewHolder(parent.inflate(R.layout.item_and_minions))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindMinions(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View{
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

}