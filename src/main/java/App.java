import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat =  applicationContext.getBean(Cat.class);

        Cat cat2 = applicationContext.getBean(Cat.class);

        boolean comparisonHelloWorld = (bean == bean2);

        boolean comparisonCat = (cat == cat2);

        System.out.println("HelloWorld - " + comparisonHelloWorld);
        System.out.println("Cat - " + comparisonCat);
    }
}