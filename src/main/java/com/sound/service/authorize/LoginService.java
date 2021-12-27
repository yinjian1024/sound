package com.sound.service.authorize;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {

    public String login(){
        return "{\"code\":20000,\"data\":{\"token\":\"admin-token\"}}";
    }

    public String info(){
        return "{\"code\":20000,\"data\":{\"roles\":[\"admin\"],\"introduction\":\"I am a super administrator\",\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\",\"name\":\"Super Admin\"}}";
    }

    public String logout(){
        return "{\"code\":20000,\"data\":\"success\"}";
    }
}
