import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun main() = Window {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            Row {
                Button(onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }
            }
        }
    }

}
