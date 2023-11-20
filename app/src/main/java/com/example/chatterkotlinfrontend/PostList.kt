package com.example.chatterkotlinfrontend

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PostCard(text: String){
    Card(Modifier.size(width = 300.dp, height = 300.dp).padding(16.dp)){
        Text(text = text,
            modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun PostList(){
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        PostCard("Card 0")
        PostCard("Card 1")
        PostCard("Card 2")
        PostCard("Card 3")
    }

}