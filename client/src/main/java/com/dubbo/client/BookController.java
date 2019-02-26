package com.dubbo.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.serverapi.BookService;
import com.dubbo.serverapi.bo.BookInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Book接口
 *
 * @author ahuang
 * @version V1.0
 * @Title: BookController
 * @Program: DubboDemo
 * @Package com.dubbo.client
 * @create 2018-09-19 22:08
 */
@RestController
@RequestMapping(path = "/book")
public class BookController {

    @Reference(check = false)
    private BookService bookService;

    @RequestMapping(path = "/{bookId}", method = {RequestMethod.GET})
    public BookInfo getById(@PathVariable Integer bookId) {
        Map<String, String> context = new HashMap<>();
        context.put("mykey", "myvalue");
        RpcContext.getContext().setAttachments(context);
        return bookService.getById(bookId);
    }
}
