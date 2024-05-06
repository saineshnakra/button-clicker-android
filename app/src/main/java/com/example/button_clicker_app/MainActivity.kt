package com.example.button_clicker_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.button_clicker_app.ui.theme.ButtonclickerappTheme

class MainActivity : ComponentActivity() {
    private var userInput : EditText? = null
    private var button : Button? = null
    private var textView : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.editTextTextMultiLine)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

    }
}