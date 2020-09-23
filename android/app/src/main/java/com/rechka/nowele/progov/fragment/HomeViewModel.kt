package com.rechka.nowele.progov.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rechka.nowele.progov.model.TestData

class HomeViewModel : ViewModel() {

    private var liveTestData: MutableLiveData<ArrayList<TestData>> = MutableLiveData(arrayListOf(TestData("Test Title")))

    fun getLiveTestData(): MutableLiveData<ArrayList<TestData>> {
        return liveTestData
    }

}