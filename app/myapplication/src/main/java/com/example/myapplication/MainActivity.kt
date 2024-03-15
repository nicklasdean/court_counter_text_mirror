package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.CourtCounter_TextMirrorTheme

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
                    CourtCounter();
                }
            }
        }
    }
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CourtCounter_TextMirrorTheme {
        Greeting("Android")
    }
}