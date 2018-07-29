package javastar920905.impl;

import com.alibaba.dubbo.config.annotation.Service;
import javastar920905.api.UserService;
import javastar920905.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ouzhx  on ${date}
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
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
