package com.kangyasin.starter.kotlin.mvvm.domain;

import com.kangyasin.starter.kotlin.mvvm.model.Comment;

import io.reactivex.Completable;

public class DeleteCommentUseCase {
    private final LocalCommentRepository localCommentRepository;

    public DeleteCommentUseCase(LocalCommentRepository localCommentRepository) {
        this.localCommentRepository = localCommentRepository;
    }

    public Completable deleteComment(Comment comment) {
        return localCommentRepository.delete(comment);
    }
}
