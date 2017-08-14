package Application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/8/14.
 */
@SpringBootApplication
@MapperScan("mapper")
public class Application {

    public static void main(String[] args) {
//        String[] paths = { "META-INF/spring/appContext.xml", "META-INF/spring/mybatisContext.xml"};
//        ApplicationContext appContext = new ClassPathXmlApplicationContext(paths);
//        System.out.println("Step in.1");
//        SpringApplication.run(Application.Application.class, args);
//        System.out.println("Step in.2");

        SpringApplication.run(Application.class, args);
    }
}

