import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean1.getMessage());

        Cat catBean1 = applicationContext.getBean(Cat.class);
        Cat catBean2 = applicationContext.getBean(Cat.class);
        System.out.println("Равны ли ссылки HelloWorld? : " + bean1.equals(bean2));
        System.out.println("Равны ли ссылки Cat? : " + catBean1.equals(catBean2));
    }
}