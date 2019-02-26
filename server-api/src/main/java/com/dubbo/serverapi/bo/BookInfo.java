package com.dubbo.serverapi.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * 图书实体
 *
 * @author ahuang
 * @version V1.0
 * @Title: BookInfo
 * @Program: DubboDemo
 * @Package com.dubbo.serverapi.bo
 * @create 2018-09-18 21:48
 */
@Data
public class BookInfo implements Serializable {
    private Integer id;
    private String bookName;
}
