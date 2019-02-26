package com.dubbo.server2;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.serverapi.UserService;

/**
 * 用户服务测试
 *
 * @author ahuang
 * @version V1.0
 * @Title: UserServiceImpl
 * @Program: DubboDemo
 * @Package com.dubbo.server2
 * @create 2018-09-22 18:23
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(Integer id) {
        return "一个用户";
    }
}
