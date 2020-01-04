package com.gzy.spring_basic_test.Services;

import com.gzy.spring_basic_test.Dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }

}

/**
 * @Component ——表示一个自动扫描 component
 * @Repository ——表示持久化层的 DAO component
 * @Service ——表示业务逻辑层的 Service component
 * @Controller ——表示表示层的 Controller component
 */
