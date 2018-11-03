package Models;

import java.util.Random;

public class Book
{
    private int Id;
    private String Title;
    private String Author;

    public Book(String title, String author)
    {
        this.Id = new Random().ints(1, (100 + 1)).findFirst().getAsInt();
        this.Title = title;
        this.Author = author;
    }
}
