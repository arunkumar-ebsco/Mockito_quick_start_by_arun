package dao;

import entity.Book;
import org.mockito.Mock;

import java.util.List;

/**
 * Created by aganapathy on 4/5/17.
 */
public interface BookDAO {


    List<Book> findBooksByAuthorName(String authorName);

}
