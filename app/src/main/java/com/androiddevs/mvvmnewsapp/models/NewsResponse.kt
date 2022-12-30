package com.androiddevs.mvvmnewsapp.models

import com.androiddevs.mvvmnewsapp.models.Article
//Ini adalah bagian data class NewsResponse
data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)