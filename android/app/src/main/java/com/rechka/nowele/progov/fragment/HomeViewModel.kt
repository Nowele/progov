package com.rechka.nowele.progov.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rechka.nowele.progov.model.RecyclerViewRow

class HomeViewModel : ViewModel() {

    private var liveRecyclerViewRows: MutableLiveData<ArrayList<RecyclerViewRow>> = setupRecyclerViewRows()

    private fun setupRecyclerViewRows(): MutableLiveData<ArrayList<RecyclerViewRow>> {
        return MutableLiveData(
            arrayListOf(
                RecyclerViewRow("Test Title", arrayListOf()),
                RecyclerViewRow("Test Title 2", arrayListOf())
            )
        )
    }

    fun getLiveRecyclerViewRows(): MutableLiveData<ArrayList<RecyclerViewRow>> {
        return liveRecyclerViewRows
    }

}