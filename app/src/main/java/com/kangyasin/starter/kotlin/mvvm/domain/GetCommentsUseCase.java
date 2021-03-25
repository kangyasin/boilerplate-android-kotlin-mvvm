package com.kangyasin.starter.kotlin.mvvm.domain;

import com.kangyasin.starter.kotlin.mvvm.model.Comment;
import com.kangyasin.starter.kotlin.mvvm.model.ModelConstants;

import java.util.List;

import io.reactivex.Flowable;

public class GetCommentsUseCase {
    private final LocalCommentRepository localCommentRepository;

    public GetCommentsUseCase(LocalCommentRepository localCommentRepository) {
        this.localCommentRepository = localCommentRepository;
    }

    public Flowable<List<Comment>> getComments() {
        return localCommentRepository.getComments(ModelConstants.DUMMY_PHOTO_ID);
    }
}
