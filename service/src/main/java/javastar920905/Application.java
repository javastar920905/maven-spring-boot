package javastar920905;


import javastar920905.dao.UserMapper;
import javastar920905.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private UserMapper userMapper;

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(UserServiceImpl.class).web(false).run(args);
        //ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
//        UserMapper userMapper = ctx.getBean(UserMapper.class);
//        System.out.println(userMapper.findList().size());
    }

    public void run(String... args) throws Exception {
        System.out.println(this.userMapper.findList().size());

    }
}
