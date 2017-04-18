package beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by minorius on 28.03.2017.
 */
@Aspect
@Component
public class CarAspectAnnotation {


    @Before("execution(void beans.Car.getMark())")
    public void logBeforeWithReturn(JoinPoint joinPoint){
        System.out.println("Aspect 1 - "+joinPoint.getSignature());
    }

    @Before("execution(String beans.Car.getMark(String))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Aspect 2 - "+joinPoint.getSignature());
    }

    @AfterReturning(
            pointcut = "execution(* beans.Car.getCar(..))",
            returning = "car"
    )
    public void afterReturning(Car car){
        System.out.print("Aspect 3 - ");
        car.getMark();

    }

}
