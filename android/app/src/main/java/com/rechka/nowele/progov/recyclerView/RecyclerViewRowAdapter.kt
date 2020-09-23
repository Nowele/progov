package com.rechka.nowele.progov.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rechka.nowele.progov.R

/**
 * RecyclerView horizontal row Adapter.
 * Row of recycler_view_item.
 */
class RecyclerViewRowAdapter(private var arrayList: ArrayList<Any>) : RecyclerView.Adapter<RecyclerViewRowHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewRowHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return RecyclerViewRowHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: RecyclerViewRowHolder,
        position: Int
    ) {
        holder.itemView.apply {
            //@TODO - handle arrayList type
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}
