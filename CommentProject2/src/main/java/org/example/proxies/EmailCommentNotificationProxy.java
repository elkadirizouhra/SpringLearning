package org.example.proxies;

import org.example.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements  CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment){
        System.out.println("sending notification for coment: "+ comment.getText());
    }
}
