package com.kangyasin.starter.kotlin.mvvm.di;

import android.content.Context;

import com.kangyasin.starter.kotlin.mvvm.App;
import com.kangyasin.starter.kotlin.mvvm.data.CommentDao;
import com.kangyasin.starter.kotlin.mvvm.data.CommentDatabase;
import com.kangyasin.starter.kotlin.mvvm.data.LocalCommentDataStore;
import com.kangyasin.starter.kotlin.mvvm.data.RemoteCommentDataStore;
import com.kangyasin.starter.kotlin.mvvm.domain.LocalCommentRepository;
import com.kangyasin.starter.kotlin.mvvm.domain.RemoteCommentRepository;
import com.kangyasin.starter.kotlin.mvvm.domain.services.jobs.GcmJobService;
import com.kangyasin.starter.kotlin.mvvm.domain.services.jobs.SchedulerJobService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This is where you will inject application-wide dependencies.
 */
@Module
public class AppModule {

    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    SchedulerJobService provideSchedulerJobService() {
        return new SchedulerJobService();
    }

    @Singleton
    @Provides
    GcmJobService provideGcmJobService() {
        return new GcmJobService();
    }

    @Singleton
    @Provides
    CommentDao provideCommentDao(Context context) {
        return CommentDatabase.getInstance(context).commentDao();
    }

    @Singleton
    @Provides
    LocalCommentRepository provideLocalCommentRepository(CommentDao commentDao) {
        return new LocalCommentDataStore(commentDao);
    }

    @Singleton
    @Provides
    RemoteCommentRepository provideRemoteCommentRepository() {
        return new RemoteCommentDataStore();
    }
}
