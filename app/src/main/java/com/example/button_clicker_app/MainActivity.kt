package com.example.button_clicker_app

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
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
    private var textView : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);
        val userInput: EditText = findViewById(R.id.editTextTextMultiLine)
        val button: Button = findViewById(R.id.button)
        textView?.text = ""
        userInput.text.clear()
        textView = findViewById(R.id.textView)
        textView?.movementMethod = ScrollingMovementMethod()
        button.setOnClickListener {
            textView?.append(userInput.text)
            textView?.append("\n")
            userInput.text.clear()
        }
    }
}