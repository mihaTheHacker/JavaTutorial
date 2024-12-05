package VariabilaMetoda;

import org.testng.annotations.Test;

public class Book {

    public String Title;
    public String Author;
    public Integer Pages;
    public Integer Year;
    public String Publisher;
    public String ISBN;
    public String Language;
    public String Genre;
    public String Format;
    public String Cover;
    public Integer Price;
    public Boolean movieAdaptation;

    @Test
    public void displayBookInfo() {
        Title = "The Handmaid's Tale";
        Author = "Margaret Atwood";
        Pages = 311;
        Year = 1985;
        Publisher = "McClelland and Stewart";
        ISBN = "0-7710-0813-5";
        Language = "English";
        Genre = "Dystopian";
        Format = "Paperback";
        Cover = "Soft";
        Price = 20;
        movieAdaptation = true;

        System.out.println("The book title is: " + Title);
        System.out.println("The book author is: " + Author);
        System.out.println("The book has " + Pages + " pages");
        System.out.println("The book was published in " + Year);
        System.out.println("The book was published by " + Publisher);
        System.out.println("The book ISBN is: " + ISBN);
        System.out.println("The book language is: " + Language);
        System.out.println("The book genre is: " + Genre);

    }

}
