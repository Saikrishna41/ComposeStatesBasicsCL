package com.techfortyone.composestatescl

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember {
        mutableIntStateOf(0)
    }
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "You have had $$count glasses of water",
        )
        Row(modifier = Modifier.padding(top = 8.dp)) {
            Button(onClick = { count++ }, Modifier.padding(8.dp), enabled = count < 10) {
                Text(text = "Add one")
            }
            Button(onClick = { count = 0}, modifier = Modifier.padding(8.dp)) {
                Text(text = "Clear Water Count")
            }
        }

    }
}