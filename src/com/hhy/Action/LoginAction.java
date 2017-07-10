package com.hhy.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.lang.*;


/**
 * Created by Administrator on 2017/7/10.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception{
        ActionContext ac= ActionContext.getContext();
        if(username.equals("admin")&&password.equals("123")){
            ac.put("success","login successfully!");
            return SUCCESS;
        }else {
            ac.put("error","Error!");
            return ERROR;
        }
    }
}
