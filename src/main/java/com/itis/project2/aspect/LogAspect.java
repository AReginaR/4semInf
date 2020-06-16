package com.itis.project2.aspect;

import com.itis.project2.models.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger("logger");

    @Pointcut("execution(* com.itis.project2.servise.RegistrationService.registration(..))")
    public void saveLogUser() { }

    @Before("saveLogUser()")
    public void beforeCall(JoinPoint joinPoint){
        System.out.println("User is registered");
    }

    @Around("saveLogUser()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = pjp.proceed();
        long endtime = System.currentTimeMillis();
        System.out.println("User register start Time: " + startTime + " end time: "+ endtime);
        return object;
    }
}
