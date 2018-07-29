package javastar920905;

import javastar920905.controller.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "javastar920905.controller")
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class,args);

    }
}
