package com.dubbo.serverapi;

/**
 * 用户服务测试
 *
 * @author ahuang
 * @version V1.0
 * @Title: UserService
 * @Program: DubboDemo
 * @Package com.dubbo.serverapi
 * @create 2018-09-22 18:22
 */
public interface UserService {
    /**
    * 根据id获取用户名
    * @params  [id]
    * @return: java.lang.String
    * @Author: ahuang
    * @Date: 2018/9/22 下午6:23
    */
    String getUserName(Integer id);
}
