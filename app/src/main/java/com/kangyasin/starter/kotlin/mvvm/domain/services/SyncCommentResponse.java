package com.kangyasin.starter.kotlin.mvvm.domain.services;

import com.kangyasin.starter.kotlin.mvvm.model.Comment;

public class SyncCommentResponse {
    public final SyncResponseEventType eventType;
    public final Comment comment;

    public SyncCommentResponse(SyncResponseEventType eventType, Comment comment) {
        this.eventType = eventType;
        this.comment = comment;
    }
}
