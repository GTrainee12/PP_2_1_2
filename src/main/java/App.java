import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);
        Cat Cat = (Cat) applicationContext.getBean(Cat.class);
        Cat cat = (Cat) applicationContext.getBean(Cat.class);

        System.out.println("HelloWorld beans are same instance: " + (bean1 == bean2));
        System.out.println("Cat beans are same instance: " + (Cat == cat));
    }
}
