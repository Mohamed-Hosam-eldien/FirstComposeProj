package com.codingtester.myfirstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                PrintText(name = myText.value)
                TxtField()
                OutLineTxtField()
                MyButton()
            }

        }
    }
}

@Composable
fun PrintText(name: String) {
    Text(
        text = name,
        color = Color.Red,
        fontSize = 24.sp
    )
}

@Composable
fun TxtField() {

    val txtValue = remember {
        mutableStateOf("mohamed")
    }

    TextField(
        value = txtValue.value,
        onValueChange = { text ->
            txtValue.value = text
        },
        label = {
            Text(text = "write here!")
        }
    )
}

@Composable
fun OutLineTxtField() {

    val txtValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = txtValue.value,
        onValueChange = { text ->
            txtValue.value = text
        },
        label = {
            Text(text = "write here!")
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedLabelColor = colorResource(id = R.color.purple_500),
            focusedBorderColor = colorResource(id = R.color.purple_500)
        )
    )
}

val myText = mutableStateOf("")

@Composable
fun MyButton() {

    Button(
        onClick = {
            myText.value = "Hello World!"
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.purple_200)
        )
        ) {
        Text(text = "Click Here")
    }

}



