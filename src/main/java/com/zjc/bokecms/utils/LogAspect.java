package com.zjc.bokecms.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

/**
 * @program: bokecms
 * @description: 这是一个AOP面向切面的工具类
 * @author: zjc
 * @create: 2020-06-09 19:32
 **/
@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.zjc.bokecms.service.*.*(..))")
    public void pc1() {
        System.out.println("这是一个主体内容部分！");
    }

    @Before(value = "pc1()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        String declaringTypeName = jp.getSignature().getDeclaringTypeName();

        System.out.println(name + "方法开始执行..."+declaringTypeName);
    }

    @After(value = "pc1()")
    public void after(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法执行结束....");
    }

    @AfterReturning(value = "pc1()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法的返回值为" + result);
    }

    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法抛出了异常,异常是:" + e.getMessage());
    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        return pjp.proceed();
    }

}
