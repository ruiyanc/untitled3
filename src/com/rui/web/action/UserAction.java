package com.rui.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.rui.web.model.User;
import org.apache.commons.lang3.StringUtils;

public class UserAction extends ActionSupport implements ModelDriven {
    private User user = new User();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;
    @Override
    public Object getModel() {
        return user;
    }

    public void validateRegister() {
        if (StringUtils.isEmpty(user.getUsername())) {
            addFieldError("username", "用户名不能为空");
        }
    }
    public String register() {
        System.out.println(user);
//        UserServiceImpl service = new UserServiceImpl();
//        service.addUser(user);
        return SUCCESS;
    }
}
