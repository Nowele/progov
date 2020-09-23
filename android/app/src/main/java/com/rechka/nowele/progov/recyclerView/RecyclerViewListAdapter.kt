package com.rechka.nowele.progov.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rechka.nowele.progov.R
import com.rechka.nowele.progov.model.RecyclerViewRow
import kotlinx.android.synthetic.main.recycler_view_row.view.*

/**
 * RecyclerView list of RecyclerView rows
 */
class RecyclerViewListAdapter(private var arrayList: ArrayList<RecyclerViewRow>) : RecyclerView.Adapter<RecyclerViewListHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewListHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycler_view_row, parent, false)
        return RecyclerViewListHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: RecyclerViewListHolder,
        position: Int
    ) {
        holder.itemView.apply {
            val row = arrayList[position]
            row_title.text = row.title
            //@TODO - setup recycler view row
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}
