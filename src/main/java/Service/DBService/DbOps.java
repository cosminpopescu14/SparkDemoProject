package Service.DBService;

import Models.Book;

import java.util.ArrayList;
import java.util.List;

public class DbOps
{
    public static List<Book> getAllBooks()
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Subtle Art of Not Giving a F*ck", "Mark Manson"));
        books.add(new Book("One Flew Over the Cuckoo's Nest", "Ken Kesey"));

        return books;
    }
}
