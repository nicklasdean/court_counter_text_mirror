package com.example.courtcounter_textmirror

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextMirror(){
    //State
    var username: String by remember{ mutableStateOf("") };

    //User interface
    Column{
        Text(
            text = "Mirror: ${username}",
            modifier = Modifier.padding(bottom = 30.dp)
        )

        OutlinedTextField(
            value = username,
            onValueChange = { value -> username = value }
        )
    }
}