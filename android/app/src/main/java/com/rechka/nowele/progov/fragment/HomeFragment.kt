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
import com.rechka.nowele.progov.model.TestData
import com.rechka.nowele.progov.recyclerView.DefaultRecyclerViewAdapter

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var recyclerView: RecyclerView

    private lateinit var viewModel: HomeViewModel
    private var testUpdateObserver = Observer<ArrayList<TestData>> {
        setupRecyclerView(it)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.home_fragment, container, false)
        recyclerView = layout.findViewById(R.id.recycler_view_list)
        return layout
    }

    private fun setupRecyclerView(arrayList: ArrayList<TestData>) {
        recyclerView.apply {
            layoutManager = LinearLayoutManager(view?.context)
            adapter = DefaultRecyclerViewAdapter(arrayList)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.getLiveTestData().observe(viewLifecycleOwner, testUpdateObserver)
    }

}