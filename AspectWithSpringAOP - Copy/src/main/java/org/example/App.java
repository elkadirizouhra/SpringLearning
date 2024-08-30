package org.example;

import org.example.cofiguration.ConfigurationProject;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.example.services.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger=Logger.getLogger(App.class.getName());
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationProject.class);
        CommentService service= context.getBean(CommentService.class);
        Comment  comment=new Comment();
        comment.setAuthor("zahira");
        comment.setText("hello from zahira");
        String value= service.publishComment(comment);
        logger.info(value);




    }
}
