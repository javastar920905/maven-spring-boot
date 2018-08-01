package javastar920905.impl;

import com.alibaba.dubbo.config.annotation.Service;
import javastar920905.api.UserService;
import javastar920905.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ouzhx  on ${date}
 */
/*@Service(
        version = "${demo.service.version}",
        application = "${spring.dubbo.application.id}",
        protocol = "${spring.dubbo.protocol.id}",
        registry = "${spring.dubbo.registry.id}"
)*/

@Service
public class UserServiceImpl implements UserService {
    public List<User> findList() {
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setId("1");
        user.setName("zyan");
        users.add(user);
        return users;
    }
}
