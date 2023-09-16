package com.example.codehabits

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codehabits.model.Habit
import com.example.codehabits.model.HabitsRepository
import com.example.codehabits.ui.theme.CodeHabitsTheme


@Composable
fun HabitsScreen(
    modifier: Modifier = Modifier, contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = contentPadding,
    ) {
        items(HabitsRepository.habits) { habit ->
            HabitCard(
                habit = habit,
                modifier = Modifier.padding(
                    start = dimensionResource(R.dimen.medium_padding),
                    end = dimensionResource(R.dimen.medium_padding),
                    bottom = dimensionResource(R.dimen.medium_padding),
                )
            )
        }
    }
}

@Composable
fun HabitCard(habit: Habit, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier, colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        )
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.medium_padding))
        ) {
            Text(
                text = "Day ${habit.day}", modifier = Modifier.padding(
                    bottom = dimensionResource(R.dimen.small_padding)
                )
            )
            Text(
                text = stringResource(habit.titleRes), modifier = Modifier.padding(
                    bottom = dimensionResource(R.dimen.medium_padding)
                )
            )
            Image(
                painter = painterResource(habit.imageRes),
                contentDescription = stringResource(habit.titleRes)
            )
            Text(
                text = stringResource(habit.descriptionRes), modifier = Modifier.padding(
                    top = dimensionResource(R.dimen.medium_padding)
                )
            )
        }
    }
}

@Preview
@Composable
fun HabitCardPreview() {
    CodeHabitsTheme {
        HabitCard(
            Habit(
                day = 1,
                titleRes = R.string.day1_title,
                imageRes = R.drawable.day1,
                descriptionRes = R.string.day1_description
            )
        )
    }
}

