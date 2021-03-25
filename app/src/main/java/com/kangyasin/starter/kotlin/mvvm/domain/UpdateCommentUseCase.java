package com.kangyasin.starter.kotlin.mvvm.domain;

import com.kangyasin.starter.kotlin.mvvm.model.Comment;

import io.reactivex.Completable;

public class UpdateCommentUseCase {
    private final LocalCommentRepository localCommentRepository;

    public UpdateCommentUseCase(LocalCommentRepository localCommentRepository) {
        this.localCommentRepository = localCommentRepository;
    }

    public Completable updateComment(Comment comment) {
        return localCommentRepository.update(comment);
    }
}
