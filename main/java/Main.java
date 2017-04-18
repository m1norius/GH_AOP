import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by minorius on 28.03.2017.
 */
@ComponentScan("beans")
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        Car car = applicationContext.getBean(Car.class);

        car.getMark();
        System.out.println("--------");

        String name = car.getMark("bmw");
        System.out.println(name);
        System.out.println("--------");

        car.getCar();

        Car car1 = new Car();

    }
}
