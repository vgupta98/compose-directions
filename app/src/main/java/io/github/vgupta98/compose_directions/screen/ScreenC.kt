package io.github.vgupta98.compose_directions.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.vgupta98.compose_directions.presentation.hiltViewModel
import io.github.vgupta98.compose_directions.viewModel.ScreenCViewModel

@Composable
fun ScreenC() {
    val viewModel: ScreenCViewModel = hiltViewModel()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = viewModel.text)
        Spacer(modifier = Modifier.size(64.dp))
        Button(onClick = { viewModel.navigateToD() }) {
            Text(text = "Navigate to D")
        }
    }
}