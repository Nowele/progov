package com.rechka.nowele.progov.model

data class SenateRace (
    val incumbent: Candidate,
    val challenger: Candidate,
    val state: String
)