package com.rechka.nowele.progov.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rechka.nowele.progov.R
import com.rechka.nowele.progov.model.RecyclerViewRow
import com.rechka.nowele.progov.recyclerView.RecyclerViewListAdapter

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var recyclerViewList: RecyclerView

    private lateinit var viewModel: HomeViewModel
    private var recyclerViewRowsObserver = Observer<ArrayList<RecyclerViewRow>> {
        setupRecyclerViewList(it)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.home_fragment, container, false)
        recyclerViewList = layout.findViewById(R.id.recycler_view_list)
        return layout
    }

    private fun setupRecyclerViewList(arrayList: ArrayList<RecyclerViewRow>) {
        recyclerViewList.apply {
            layoutManager = LinearLayoutManager(view?.context)
            adapter = RecyclerViewListAdapter(arrayList)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.getLiveRecyclerViewRows().observe(viewLifecycleOwner, recyclerViewRowsObserver)
    }

}