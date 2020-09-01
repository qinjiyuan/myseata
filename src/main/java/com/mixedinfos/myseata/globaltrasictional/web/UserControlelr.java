package com.mixedinfos.myseata.globaltrasictional.web;

import com.mixedinfos.myseata.globaltrasictional.dao.User;
import com.mixedinfos.myseata.globaltrasictional.service.UserServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myseata/tratest")
public class UserControlelr {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getByUserName")
    @ApiOperation(value = "查询用户",httpMethod = "GET",notes = "")
    public List<User> getByUserName(@Param("userName") String userName) throws Exception {
        List<User>list = userService.findByName(userName);
        return list;
    }
    @GlobalTransactional(timeoutMills = 300000, name = "spring-cloud-demo-tx")
    @RequestMapping("/saveUser")
    @ApiOperation(value = "保存用户",httpMethod = "POST",notes = "")
    public User saveUser(@RequestBody User user){
        userService.save(user);
        return user;
    }

}
