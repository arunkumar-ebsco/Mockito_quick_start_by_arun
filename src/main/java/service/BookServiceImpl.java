package service;


import dao.BookDAO;
import dao.BookDAOImpl;
import entity.Book;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by aganapathy on 4/5/17.
 */
public class BookServiceImpl implements BookService{

    @Autowired
    BookDAO bookDao;


    public BookServiceImpl(BookDAO bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> findBooksByAuthorName(String authorName) {

        if(null != authorName || StringUtils.isNotBlank(authorName)){
            return bookDao.findBooksByAuthorName(authorName);
        }else{
            throw new NullPointerException("authorName is empty or null");
        }

    }
}
