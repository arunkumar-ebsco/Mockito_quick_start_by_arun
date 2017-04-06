package service;

import dao.BookDAO;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by aganapathy on 4/5/17.
 */
public interface BookService {



    List<Book> findBooksByAuthorName(String authorName);
}
