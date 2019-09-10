package com.company;
import java.util.Scanner;  // Import the Scanner class

class Book {
    // these are now protected
    protected String title;
    protected String author;
    protected int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}

class ExtBook extends Book {
    private String publisher;
    private int pageCount;

    public ExtBook(String t, String a, int d, String p, int pC) {
        super(t, a, d);
        publisher = p;
        pageCount = pC;
    }

    public void show() {
        if(pageCount > 100){
            super.show();
            System.out.println(publisher);
            System.out.println(pageCount);
            System.out.println();
        }
    }

    public int getPagecount() { return pageCount; }


    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }

    /* These are OK because subclass can access
       a protected member. */
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }
}

class Main {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide",
                "Schildt", 2018, "Oracle Press", 200);
        books[1] = new ExtBook("Java: The Complete Reference",
                "Schildt", 2018, "Oracle Press", 201);
        books[2] = new ExtBook("Introducing JavaFX 8 Programming",
                "Schildt", 2015,
                "Oracle Press", 15);
        books[3] = new ExtBook("Red Storm Rising",
                "Clancy", 1986, "Putnam", 25);
        books[4] = new ExtBook("On the Road",
                "Kerouac", 1955, "Viking", 100);
        for (int i = 0; i < books.length; i++) books[i].show();

// Otrais uzdevums
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ievadiet tekstu");
        String teksts = scanner.nextLine();
        System.out.println(pusteksts(teksts));
    }


    public static String pusteksts(String s) {
        StringBuffer result = new StringBuffer();
        for (int k = 1; k < s.length(); k++) {
            if(k % 2 == 0)
                result.append(s.charAt(k-1));
        } //for
        return result.toString();
    }

}


