package org.example.repositories;

import org.example.model.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
