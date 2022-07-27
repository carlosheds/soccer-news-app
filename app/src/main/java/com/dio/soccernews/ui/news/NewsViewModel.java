package com.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.dio.soccernews.R;
import com.dio.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque importante","the reliable sonic shower proudly contacts the particle. "));
        news.add(new News("Ferrinha joga no sábado","girls die from endurances like golden anchors. "));
        news.add(new News("Copa do mundo feminina está terminando","mineral studies when you feel with vision. "));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}