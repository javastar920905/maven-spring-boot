package javastar920905.config;

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
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://120.78.162.189:3306/paydb");
        dataSource.setUsername("root");
        dataSource.setPassword("1qaz2wsx");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
}
