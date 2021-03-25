package com.kangyasin.starter.kotlin.mvvm.domain;

import com.kangyasin.starter.kotlin.mvvm.model.Comment;

import io.reactivex.Completable;

/**
 * Responsible for syncing a comment with remote repository.
 */
public class SyncCommentUseCase {
    private final RemoteCommentRepository remoteCommentRepository;

    public SyncCommentUseCase(RemoteCommentRepository remoteCommentRepository) {
        this.remoteCommentRepository = remoteCommentRepository;
    }

    public Completable syncComment(Comment comment) {
        return remoteCommentRepository.sync(comment);
    }
}
