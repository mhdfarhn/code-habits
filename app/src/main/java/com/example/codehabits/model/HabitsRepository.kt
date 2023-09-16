package com.example.codehabits.model

import com.example.codehabits.R

object HabitsRepository {
    val habits = listOf(
        Habit(
            day = 1,
            titleRes = R.string.day1_title,
            imageRes = R.drawable.day1,
            descriptionRes = R.string.day1_description,
        ),
        Habit(
            day = 2,
            titleRes = R.string.day2_title,
            imageRes = R.drawable.day2,
            descriptionRes = R.string.day2_description,
        ),
        Habit(
            day = 3,
            titleRes = R.string.day3_title,
            imageRes = R.drawable.day3,
            descriptionRes = R.string.day3_description,
        ),
        Habit(
            day = 4,
            titleRes = R.string.day4_title,
            imageRes = R.drawable.day4,
            descriptionRes = R.string.day4_description,
        ),
        Habit(
            day = 5,
            titleRes = R.string.day5_title,
            imageRes = R.drawable.day5,
            descriptionRes = R.string.day5_description,
        ),
    )
}