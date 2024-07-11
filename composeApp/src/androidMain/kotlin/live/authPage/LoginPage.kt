package live.authPage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import live.WindowBottomMargin
import live.WindowSideMargin

@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    Box(
        modifier
            .fillMaxWidth()
            .padding(start = WindowSideMargin, end = WindowSideMargin, bottom = WindowBottomMargin)
    ) {
        Column {
            Text(text = "Login Page")
            Text(text = "Welcome")
            TextField(value = "Email", onValueChange = {})
            TextField(value = "Password", onValueChange = {})
            Text(text = "Forgot Password?")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Login")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Sign Up")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Google Sign In")
            }
        }

    }
}