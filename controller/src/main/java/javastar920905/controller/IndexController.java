package javastar920905.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import javastar920905.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouzhx  on ${date}
 */
@RestController
public class IndexController {
    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            registry = "dubbo://localhost:20880")
    private UserService userService;

    @GetMapping("/")
    public String sayHello() {
        return userService.findList().size()+" size  from javastar920905.controller.IndexController";
    }
}
