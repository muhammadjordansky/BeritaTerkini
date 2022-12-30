package com.androiddevs.mvvmnewsapp.util
//Ini adalah bagian untuk mengambil URL dari newsapi.org dan apikey
class Constants {
    companion object {
        const val API_KEY = "9fcad0f53dfa4a04b7ea95ed2656fb92"
        const val BASE_URL = "https://newsapi.org/v2/top-headlines"
        const val SEARCH_NEWS_TIME_DELAY = 500L
        const val QUERY_PAGE_SIZE = 20
    }
}