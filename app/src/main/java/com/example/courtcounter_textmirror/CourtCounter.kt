package com.example.courtcounter_textmirror

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CourtCounter(modifier: Modifier = Modifier){
    var count: Int by remember{ mutableIntStateOf(0) }

    Column {
        Row {
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.6f)
                    .fillMaxWidth(0.5f)
                    .border(2.dp, color = Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    fontSize = 50.sp,
                    text = count.toString()
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.6f)
                    .fillMaxWidth()
                    .border(2.dp, color = Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    fontSize = 50.sp,
                    text = count.toString()
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {
            Button(modifier = Modifier.width(100.dp),
                onClick = {
                    count ++;

                }) {
                Text("+1");
            }
        }

    }
}