package com.example.chatterkotlinfrontend

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
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
    val posts =
        listOf(
            Post("001", "article 1", "TESTING", "", null, null, false, null, ""),
            Post("002", "article 2", "TESTING", "", null, null, false, null, ""),
            Post("003", "article 3", "TESTING", "", null, null, false, null, "")
        );

    LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            items(posts) { post ->
                PostCard(post.title)
            }
        }


}