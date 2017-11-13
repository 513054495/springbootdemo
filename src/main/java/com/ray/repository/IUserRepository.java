package com.ray.repository;

import com.ray.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户持久化接口
 * @author Ray Lin
 * @createTime 2017-11-13 23:03
 */
public interface IUserRepository extends JpaRepository<User,Integer> {
}
