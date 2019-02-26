package com.dubbo.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.serverapi.BookService;
import com.dubbo.serverapi.bo.BookInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientApplicationTests {

    @Reference(check = false)
    private BookService bookService;

    @Test
    public void testDubbo() {
        BookInfo result = bookService.getById(2);
        log.info(result.toString());
    }

}
