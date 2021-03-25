package com.kangyasin.starter.kotlin.mvvm.data;

import com.kangyasin.starter.kotlin.mvvm.domain.RemoteCommentRepository;
import com.kangyasin.starter.kotlin.mvvm.domain.services.jobs.JobManagerFactory;
import com.kangyasin.starter.kotlin.mvvm.domain.services.jobs.SyncCommentJob;
import com.kangyasin.starter.kotlin.mvvm.model.Comment;

import io.reactivex.Completable;

public class RemoteCommentDataStore implements RemoteCommentRepository {

    @Override
    public Completable sync(Comment comment) {
        return Completable.fromAction(() ->
                JobManagerFactory.getJobManager().addJobInBackground(new SyncCommentJob(comment)));
    }
}
