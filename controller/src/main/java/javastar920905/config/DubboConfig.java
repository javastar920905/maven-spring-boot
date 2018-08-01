package javastar920905.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ouzhx on 2018/8/1.
 */
@Configuration
@DubboComponentScan(basePackages = "javastar920905.api")
public class DubboConfig {
    @Bean
    public ApplicationConfig applicationConfig(@Value("${spring.dubbo.application.name}") String appName) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(appName);
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
    }

    @Bean
    public RegistryConfig registryConfig(@Value("${spring.dubbo.registry.address}") String address) {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(address);
        registryConfig.setClient("zkclient");
        return registryConfig;
    }
}
