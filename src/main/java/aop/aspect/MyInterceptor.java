package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by eason on 2017/4/27.
 * 以注解方式切入
 */
@Aspect
@Component
public class MyInterceptor {
    @Pointcut("execution(* aop.service.impl.PersonServiceImpl.*(..))")
    private void anyMethod(){}//定义一个切入点

    @Pointcut("@annotation(aop.annotation.SecureValid)") //自定义注解切入
    public void secureValid() {}

    @Before("secureValid()")
    public void dosecureValid(){
        System.out.println("参数检验________________");
    }

//    @Before("anyMethod() && args(name)")
//    public void doAccessCheck(String name){
//        System.out.println(name);
//        System.out.println("前置通知");
//    }

    @AfterReturning("anyMethod()")
    public void doAfter(){
        System.out.println("后置通知");
    }

    @After("anyMethod()")
    public void after(){
        System.out.println("最终通知");
    }

    @AfterThrowing("anyMethod()")
    public void doAfterThrow(){
        System.out.println("例外通知");
    }

    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("进入环绕通知");
        Object object = pjp.proceed();//执行该方法
        System.out.println("退出方法");
        return object;
    }
}
