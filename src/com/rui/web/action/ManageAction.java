package com.rui.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.rui.web.model.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class ManageAction  extends ActionSupport {
    @Override
    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        context.put("username","张三");
        //session
        Map<String, Object> session = context.getSession();
        session.put("username", "李四");
        session.put("password", "123");
        //request
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("username", "王五");
        //application
        Map<String, Object> application = context.getApplication();
        application.put("username", "刘六");
        //获取ValueStack
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.push(new User("傻七", "345"));
        return SUCCESS;
    }
}

