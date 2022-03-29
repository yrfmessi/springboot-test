package com.yrf.admin.mapper;

import com.yrf.admin.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author YuRuoFan
 * @Date 2022-03-28 20:35
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 查找用户
     */
    public User getUser(long id);
}
