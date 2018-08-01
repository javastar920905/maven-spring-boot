package javastar920905.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

/**
 * @author ouzhx  on ${date}
 */
@Configuration
public class MyBatisConfig {
    /*@Bean
    public DataSource druidDataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://120.78.162.189:3306/paydb");
        dataSource.setUsername("root");
        dataSource.setPassword("1qaz2wsx");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }*/

    @Bean
    public DataSource dataSource(@Value("${spring.datasource.druid.url}") String url, @Value("${spring.datasource.druid.username}") String uname,
                                 @Value("${spring.datasource.druid.password}") String pwd, @Value("${spring.datasource.druid.driver-class-name}") String driverName) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(uname);
        dataSource.setPassword(pwd);
        dataSource.setDriverClassName(driverName);
        return dataSource;
    }
}
