package com.laioffer.tinnews.tin;

import com.laioffer.tinnews.mvp.MvpContract;
import com.laioffer.tinnews.retrofit.response.News;

import java.util.List;

public interface TinContract {

    interface View extends MvpContract.View<Presenter> {
        //5.6 add showNewsCard
        void showNewsCard(List<News> newsList);
        void onError(); //Toast
        void onSavedSuccess();
    }

    interface Presenter extends MvpContract.Presenter<View, Model> {
        //5.6 add showNewsCard
        void showNewsCard(List<News> newsList);
        void saveFavoriteNews(News news);
        void onError();
        void onSavedSuccess();
    }

    interface Model extends MvpContract.Model<Presenter> {
        //add fetchData here
        void fetchData();
        void saveFavoriteNews(News news);
    }
}

