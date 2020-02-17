package com.tasche.springbootlearning.spring.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Aspect声明是一个切面
 * @After,
 * @Before,
 * @Around定义建言(advice)，可直接将拦截规则（切点）作为参数
 * @Pointcut定义拦截规则，然后在建言(advice)中使用
 * 符合条件的每一个拦截处为连接点(JoinPoint)
 * @Component让此切面成为Spring容器管理的Bean
 */
@Aspect
@Component
public class LogAspect {
    /**
     * 通过@Pointcut注解声明切点
     */
    @Pointcut("@annotation(com.tasche.springbootlearning.spring.aspectj.Action)")
    public void annotationPointCut(){};

    /**
     * 声明一个建言，并使用@Pointcut定义的切点
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        /**
         * 通过反射可获得注解上的属性
         */
        System.out.println("注解式拦截 " + action.name());
    }

    /**
     * 声明一个建言，直接使用拦截规则
     */
    @Before("execution(* com.tasche.springbootlearning.spring.aspectj.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature =
                (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截 - " + method.getDeclaringClass() + " > " + method.getName());
    }
}
