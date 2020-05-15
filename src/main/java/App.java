import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        System.out.println(bean1 == bean2);

        Cat firstCat = applicationContext.getBean("getcat", Cat.class);
        Cat secondCat = applicationContext.getBean("getcat", Cat.class);

        System.out.println(firstCat == secondCat);

        System.out.println("Color of first cat: " + firstCat.getColor());
        System.out.println("Color of second cat: " + secondCat.getColor());

        firstCat.setColor("grey");

        System.out.println("Color of first cat: " + firstCat.getColor());
        System.out.println("Color of second cat: " + secondCat.getColor());
    }
}