package com.kangyasin.starter.kotlin.mvvm.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.kangyasin.starter.kotlin.mvvm.model.Comment;
import com.kangyasin.starter.kotlin.mvvm.model.ModelConstants;

@Database(entities = {Comment.class}, version = 1, exportSchema = false)
public abstract class CommentDatabase extends RoomDatabase {
    private static CommentDatabase instance;

    public static synchronized CommentDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room
                    .databaseBuilder(context.getApplicationContext(), CommentDatabase.class, ModelConstants.DB_NAME)
                    .build();
        }
        return instance;
    }

    public abstract CommentDao commentDao();
}
