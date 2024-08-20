package org.example;

import org.example.configuration.ConfigurationApp;
import org.example.repositories.DBCommentRepository;
import org.example.model.Comment;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigurationApp.class);
        Comment comment=new Comment();
        comment.setAuthor("zahira Elkadiri");
        comment.setText("this task should be ubpadated ");
        CommentService commentService = applicationContext.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
