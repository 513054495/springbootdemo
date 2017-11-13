package com.ray.service;

import com.ray.entity.User;
import com.ray.repository.IUserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * 用户服务类
 * @author Ray Lin
 * @createTime 2017-11-13 23:24
 */
@Service
public class UserService {
    @Resource
    private IUserRepository iUserRepository;

    @Transactional
    public void save(User user){
        iUserRepository.save(user);
    }
}
