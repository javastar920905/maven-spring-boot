package javastar920905.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import org.springframework.context.annotation.Bean;

/**
 * @author ouzhx  on ${date}
 */
public class DubboServiceConfig {
    @Bean
    public ServiceConfig serviceConfig() {
        ServiceConfig config = new ServiceConfig();
        config.setApplication(new ApplicationConfig("first-dubbo-provider"));
        return config;

    }
}
