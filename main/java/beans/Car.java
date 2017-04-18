package beans;

import org.springframework.stereotype.Component;

/**
 * Created by minorius on 28.03.2017.
 */

@Component
public class Car {

    public Car(){
    }

    public void getMark(){
        System.out.println("bmw");
    }

    public String getMark(String name){
        return name;
    }

    public Car getCar(){
        Car car = new Car();
        return car;
    }

}
