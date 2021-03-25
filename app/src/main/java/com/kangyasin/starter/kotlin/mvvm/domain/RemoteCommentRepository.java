package com.kangyasin.starter.kotlin.mvvm.domain;

import com.kangyasin.starter.kotlin.mvvm.model.Comment;

import io.reactivex.Completable;

public interface RemoteCommentRepository {
    Completable sync(Comment comment);
}
