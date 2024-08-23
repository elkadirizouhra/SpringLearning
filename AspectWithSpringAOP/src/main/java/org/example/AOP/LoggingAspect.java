package org.example.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.model.Comment;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    Logger logger= Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* org.example.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName() ;
        Object [] arguments = joinPoint.getArgs();

        logger.info("method"+methodName+"method will be excuted"+"with parametres"+ Arrays.asList(arguments) +"will be exuceteds");
        Comment comment=new Comment();
        comment.setText("anotherText");
        Object [] newArguments={comment};
         Object returnedvalue=joinPoint.proceed(newArguments);
         logger.info("excution finiched with this retured value"+returnedvalue);
         return "False";
    }
}
