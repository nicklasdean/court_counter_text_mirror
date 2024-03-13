package com.example.courtcounter_textmirror

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.courtcounter_textmirror.ui.theme.CourtCounter_TextMirrorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourtCounter_TextMirrorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextMirror();
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

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

@Composable
fun TextMirror(){
    //State
    var username: String by remember{ mutableStateOf("") };

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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CourtCounter_TextMirrorTheme {
        Greeting("Android")
    }
}