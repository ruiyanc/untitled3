package com.rui.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.rui.web.model.Student;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private Student stu = new Student();
    @Override
    public Student getModel() {
        return stu;
    }

    public String add()  {
        System.out.println(stu);
        System.out.println(stu);
        return SUCCESS;
    }

}
