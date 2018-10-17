package com.example.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@EnableAspectJAutoProxy
@Aspect
@Component
public class AspectClass {

	
	@Before("execution(* com.example.spring.aop.Employee.getEmpName(..))")
    public void logBeforeGetEmployee(JoinPoint joinPoint)
    {
        System.out.println("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
    }
	
	@After("execution(* com.example.spring.aop.Employee.getEmpName(..))")
    public void logAfterGetEmployee(JoinPoint joinPoint)
    {
        System.out.println("****LoggingAspect.logAfterGetEmployee() : " + joinPoint.getSignature().getName());
    }
}
