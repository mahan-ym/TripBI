import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import live.authPage.LoginPage
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {
        LoginPage()
    }
}