package com.mixedinfos.myseata.globaltrasictional.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mixedinfos.myseata.globaltrasictional.dao.User;
import com.mixedinfos.myseata.globaltrasictional.dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    public List<User> findByName(String name) throws Exception {
        QueryWrapper<User>userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lambda().eq(User::getUserName,name);
        List<User>list  =list(userQueryWrapper);
        if(list.size()>1){
            throw new Exception("yoyo");
        }
        return list;
    }
}
