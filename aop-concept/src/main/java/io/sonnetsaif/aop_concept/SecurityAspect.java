package io.sonnetsaif.aop_concept;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Pointcut("within(io.sonnetsaif.aop_concept.*)")
    public void authenticationPointCut(){
    }

    @Pointcut("within(io.sonnetsaif.aop_concept.*)")
    public void authorizationPointCut(){
    }

    @Before("authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }

    @Before("authorizationPointCut()")
    public void authorization(){
        System.out.println("Authorizing the Request");
    }
}
