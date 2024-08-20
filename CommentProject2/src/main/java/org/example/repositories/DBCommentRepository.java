package org.example.repositories;

import org.example.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment){
     System.out.println("storing comment :"+comment.getText());
    }
}
