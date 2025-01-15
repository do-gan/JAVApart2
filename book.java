import javax.swing.*;
class Book {
    private String title;
    private String author;
    private String isbn;

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Method to handle book management
    public static void BookManagement(Book[] books, int BookCount) {
        boolean continu = true;

        while (continu) {
            String menuOption = JOptionPane.showInputDialog(null,
                "Select an option:\n1. Add a book\n2. Remove a book\n3. Display all books\n4. Exit");

            switch (menuOption) 
            {
                case "1":
                    BookCount = addBook(books, BookCount);
                    break;
                case "2":
                    BookCount = removeBook(books, BookCount);
                    break;
                case "3":
                    displayBooks(books, BookCount);
                    break;
                case "4":
                    continu = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option, please try again.");
            }
        }
    }

    
    public static int addBook(Book[] books, int BookCount) {
        
        String title = JOptionPane.showInputDialog("Enter the book title:");
        String author = JOptionPane.showInputDialog("Enter the book author:");
        String isbn = JOptionPane.showInputDialog("Enter the book ISBN:");

        
        Book newBook = new Book();
        newBook.setTitle(title);
        newBook.setAuthor(author);
        newBook.setIsbn(isbn);

        // Check if there's enough space in the array to add a new book
        if (BookCount < books.length) 
        {
            books[BookCount] = newBook;
            JOptionPane.showMessageDialog(null, "Book added: " + displayBookDetails(newBook));
            BookCount++;
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Cannot add more books. The collection is full.");
        }

        return BookCount;
    }

    // Method to remove a book from the array by ISBN
    public static int removeBook(Book[] books, int BookCount) 
    {
        String isbnToRemove = JOptionPane.showInputDialog("Enter the ISBN of the book to remove:");
        boolean removed = false;
        for (int i = 0; i < BookCount; i++) {
            if (books[i].getIsbn().equals(isbnToRemove)) 
            {
                for (int j = i; j < BookCount - 1; j++) 
                {
                    books[j] = books[j + 1];
                }
                books[BookCount - 1] = null;
                BookCount--;
                JOptionPane.showMessageDialog(null, "Book removed.");
                removed = true;
                break;
            }
        }

        if (removed) 
        {
            JOptionPane.showMessageDialog(null, "No book found with ISBN: " + isbnToRemove);
        }

        return BookCount;
    }

    // Method to display all books
    public static void displayBooks(Book[] books, int BookCount) 
    {
        if (BookCount == 0) 
        {
            JOptionPane.showMessageDialog(null, "No books in the list.");
        } 
        else 
        {
            StringBuilder bookList = new StringBuilder("Books in the collection:\n");
            for (int i = 0; i < BookCount; i++) 
            {
                bookList.append(displayBookDetails(books[i])).append("\n");
            }
            JOptionPane.showMessageDialog(null, bookList.toString());
        }
    }

    
    public static String displayBookDetails(Book book) 
    {
        return "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn();
    }

    public static void main(String[] args) 
    {
        Book[] books = new Book[10];
        int BookCount = 0;
        BookManagement(books, BookCount);
    }
}