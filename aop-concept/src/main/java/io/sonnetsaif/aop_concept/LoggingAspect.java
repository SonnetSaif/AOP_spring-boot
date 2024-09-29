package io.sonnetsaif.aop_concept;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* io.sonnetsaif.aop_concept.PaymentServiceImpl.makeDebitPayment(..))")
    public void BeforeDebitLogger(){
        System.out.println("Before Debit Logger");
    }

    @After("execution(* io.sonnetsaif.aop_concept.PaymentServiceImpl.makeDebitPayment(..))")
    public void AfterDebitLogger(){
        System.out.println("After Debit Logger");
    }

    @Before("execution(* io.sonnetsaif.aop_concept.PaymentServiceImpl.makeCreditPayment())")
    public void CreditLogger(){
        System.out.println("Before Credit Logger");
    }

    @After("execution(* io.sonnetsaif.aop_concept.PaymentServiceImpl.makeCreditPayment())")
    public void AfterCreditLogger(){
        System.out.println("After Debit Logger");
    }
}
