package com.dubbo.server;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.serverapi.BookService;
import com.dubbo.serverapi.UserService;
import com.dubbo.serverapi.bo.BookInfo;

/**
 * 图书服务实现类
 *
 * @author ahuang
 * @version V1.0
 * @Title: BookServiceImpl
 * @Program: DubboDemo
 * @Package com.dubbo.server
 * @create 2018-09-18 21:51
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public BookInfo getById(Integer id) {

        BookInfo result = new BookInfo();
        result.setBookName("test");
        result.setId(1);
        return result;
    }
}
