package dao;

import entity.Book;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aganapathy on 4/5/17.
 */
public class BookDAOImpl implements BookDAO {
    public List<Book> findBooksByAuthorName(String authorName) {
        return Arrays.asList(new Book("1","Mathematics",25),
                new Book("2","Science",20),
                new Book("3","Social",15));
    }
}
