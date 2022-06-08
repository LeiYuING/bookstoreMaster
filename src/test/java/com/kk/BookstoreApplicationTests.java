package com.kk;

import com.kk.dao.BookDao;
import com.kk.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.lang.NonNull;

import java.util.List;

@SpringBootTest
class BookstoreApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        List<Book> books = bookDao.selectList(null);
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("sss");
    }
}
