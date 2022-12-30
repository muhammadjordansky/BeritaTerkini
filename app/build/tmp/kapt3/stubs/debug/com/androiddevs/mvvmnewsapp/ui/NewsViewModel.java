package com.androiddevs.mvvmnewsapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010\u000b\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0019J\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0201J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n05H\u0002J\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n05H\u0002J\b\u00107\u001a\u000208H\u0002J\u0019\u00109\u001a\u00020:2\u0006\u0010/\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0019\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u000e\u0010>\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010#\u001a\u00020,2\u0006\u0010=\u001a\u00020\u0019R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012R\u001c\u0010(\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lcom/androiddevs/mvvmnewsapp/ui/NewsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "newsRepository", "Lcom/androiddevs/mvvmnewsapp/repository/NewsRepository;", "(Landroid/app/Application;Lcom/androiddevs/mvvmnewsapp/repository/NewsRepository;)V", "breakingNews", "Landroidx/lifecycle/MutableLiveData;", "Lcom/androiddevs/mvvmnewsapp/util/Resource;", "Lcom/androiddevs/mvvmnewsapp/models/NewsResponse;", "getBreakingNews", "()Landroidx/lifecycle/MutableLiveData;", "breakingNewsPage", "", "getBreakingNewsPage", "()I", "setBreakingNewsPage", "(I)V", "breakingNewsResponse", "getBreakingNewsResponse", "()Lcom/androiddevs/mvvmnewsapp/models/NewsResponse;", "setBreakingNewsResponse", "(Lcom/androiddevs/mvvmnewsapp/models/NewsResponse;)V", "newSearchQuery", "", "getNewSearchQuery", "()Ljava/lang/String;", "setNewSearchQuery", "(Ljava/lang/String;)V", "getNewsRepository", "()Lcom/androiddevs/mvvmnewsapp/repository/NewsRepository;", "oldSearchQuery", "getOldSearchQuery", "setOldSearchQuery", "searchNews", "getSearchNews", "searchNewsPage", "getSearchNewsPage", "setSearchNewsPage", "searchNewsResponse", "getSearchNewsResponse", "setSearchNewsResponse", "deleteArticle", "Lkotlinx/coroutines/Job;", "article", "Lcom/androiddevs/mvvmnewsapp/models/Article;", "countryCode", "getSavedNews", "Landroidx/lifecycle/LiveData;", "", "handleBreakingNewsResponse", "response", "Lretrofit2/Response;", "handleSearchNewsResponse", "hasInternetConnection", "", "safeBreakingNewsCall", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeSearchNewsCall", "searchQuery", "saveArticle", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.util.Resource<com.androiddevs.mvvmnewsapp.models.NewsResponse>> breakingNews = null;
    private int breakingNewsPage = 1;
    @org.jetbrains.annotations.Nullable()
    private com.androiddevs.mvvmnewsapp.models.NewsResponse breakingNewsResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.util.Resource<com.androiddevs.mvvmnewsapp.models.NewsResponse>> searchNews = null;
    private int searchNewsPage = 1;
    @org.jetbrains.annotations.Nullable()
    private com.androiddevs.mvvmnewsapp.models.NewsResponse searchNewsResponse;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String newSearchQuery;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String oldSearchQuery;
    @org.jetbrains.annotations.NotNull()
    private final com.androiddevs.mvvmnewsapp.repository.NewsRepository newsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.util.Resource<com.androiddevs.mvvmnewsapp.models.NewsResponse>> getBreakingNews() {
        return null;
    }
    
    public final int getBreakingNewsPage() {
        return 0;
    }
    
    public final void setBreakingNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.androiddevs.mvvmnewsapp.models.NewsResponse getBreakingNewsResponse() {
        return null;
    }
    
    public final void setBreakingNewsResponse(@org.jetbrains.annotations.Nullable()
    com.androiddevs.mvvmnewsapp.models.NewsResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.androiddevs.mvvmnewsapp.util.Resource<com.androiddevs.mvvmnewsapp.models.NewsResponse>> getSearchNews() {
        return null;
    }
    
    public final int getSearchNewsPage() {
        return 0;
    }
    
    public final void setSearchNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.androiddevs.mvvmnewsapp.models.NewsResponse getSearchNewsResponse() {
        return null;
    }
    
    public final void setSearchNewsResponse(@org.jetbrains.annotations.Nullable()
    com.androiddevs.mvvmnewsapp.models.NewsResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNewSearchQuery() {
        return null;
    }
    
    public final void setNewSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOldSearchQuery() {
        return null;
    }
    
    public final void setOldSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
    
    private final com.androiddevs.mvvmnewsapp.util.Resource<com.androiddevs.mvvmnewsapp.models.NewsResponse> handleBreakingNewsResponse(retrofit2.Response<com.androiddevs.mvvmnewsapp.models.NewsResponse> response) {
        return null;
    }
    
    private final com.androiddevs.mvvmnewsapp.util.Resource<com.androiddevs.mvvmnewsapp.models.NewsResponse> handleSearchNewsResponse(retrofit2.Response<com.androiddevs.mvvmnewsapp.models.NewsResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveArticle(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.models.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.mvvmnewsapp.models.Article>> getSavedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteArticle(@org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.models.Article article) {
        return null;
    }
    
    private final boolean hasInternetConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androiddevs.mvvmnewsapp.repository.NewsRepository getNewsRepository() {
        return null;
    }
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.androiddevs.mvvmnewsapp.repository.NewsRepository newsRepository) {
        super(null);
    }
}