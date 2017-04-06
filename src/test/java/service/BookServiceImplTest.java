package service;


import dao.BookDAO;
import entity.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.any;

/**
 * Created by aganapathy on 4/5/17.
 */
public class BookServiceImplTest {

    @Mock
    BookDAO bookDao;

    BookService bookService;

    List<Book> bookListMocked;

    @Before
    public void setUp()
            throws Exception
    {
        MockitoAnnotations.initMocks( this );
        bookService = new BookServiceImpl( bookDao );
        bookListMocked = Arrays.asList(new Book("1","Mocked Book",0));
    }

   @Test
    public void testFindBooksByAuthorName_With_Non_Empty_Author(){
      //Given
       String authorName = "aaa";

       //When
       Mockito.when(bookDao.findBooksByAuthorName(authorName)).thenReturn(bookListMocked);
       List<Book> bookList =  bookService.findBooksByAuthorName(authorName);

       //Then
       Assert.assertTrue(bookList.size()==1);
   }

    @Test(expected = NullPointerException.class)
    public void testFindBooksByAuthorName_With_Empty_Author(){
        //Given
        String authorName = null;
        List<Book> bookList =  bookService.findBooksByAuthorName(authorName);
    }

}
