package com.gzy.service;

import com.gzy.model.UserForm;
import org.springframework.stereotype.Service;

//注解为一个服务
@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(UserForm user) {
        if ("gzy".equals(user.getName()) &&
                "123456".equals(user.getPassword())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean register(UserForm user) {
        if ("gzy".equals(user.getName()) &&
                "123456".equals(user.getPassword()) &&
                user.getPassword().equals(user.getRepassword())) {
            return true;
        }
        return false;
    }
}
