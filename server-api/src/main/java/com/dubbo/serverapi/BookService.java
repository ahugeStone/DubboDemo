package com.dubbo.serverapi;

import com.dubbo.serverapi.bo.BookInfo;

/**
 * 图书接口
 *
 * @author ahuang
 * @version V1.0
 * @Title: BookService
 * @Program: DubboDemo
 * @Package com.dubbo.serverapi
 * @create 2018-09-18 21:48
 */
public interface BookService {
    /**
     * 通过id查找图书
     * @param id
     * @return
     */
    BookInfo getById(Integer id);
}
