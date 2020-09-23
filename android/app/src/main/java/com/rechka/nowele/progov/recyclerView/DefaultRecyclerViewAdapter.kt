package com.rechka.nowele.progov.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rechka.nowele.progov.R
import com.rechka.nowele.progov.model.TestData
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class DefaultRecyclerViewAdapter(private var arrayList: ArrayList<TestData>) : RecyclerView.Adapter<DefaultRecyclerViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DefaultRecyclerViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return DefaultRecyclerViewHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: DefaultRecyclerViewHolder,
        position: Int
    ) {
        holder.itemView.apply {
            recycler_view_item_title.text = arrayList[position].title
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}
