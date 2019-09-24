/*
* You are given 4 books.
* You are required to place them in a stack, and then pick the book at the top and read 100 pages of it.
* The book object contains a title and the number of pages which you have to read.
* In a single reading session, you can only read 100 pages.
* After a book is completed, remove it from the stack,
* and then begin reading the book that is now at the top of the stack.
Write a program that would first push the books into the stack, and then read all the books one by one, 100 pages at a time.
*/

import java.util.Scanner;
import java.util.Stack;

class Book {
    public String title;
    public int pagesLeft;

    public Book(String title, int pages) {
        this.title = title;
        this.pagesLeft = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pagesLeft;
    }

    public void read100Pages() {
        System.out.println("Reading 100 pages of " + this.title);
        this.pagesLeft = this.pagesLeft - 100;
    }

    public Boolean completed() {
        return this.pagesLeft <= 0;
    }
}

public class BookStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Harry Potter", 200);
        Book book2 = new Book("Champak", 100);
        Book book3 = new Book("Lord of the Rings", 300);
        Book book4 = new Book("Tinkle", 100);


        Stack<Book> bookStack = new Stack<>();
        bookStack.push(book1);
        bookStack.push(book2);
        bookStack.push(book3);
        bookStack.push(book4);

        for(int i=0;i<=3;i++){
            Book currentBook=bookStack.pop();
            while (!currentBook.completed()){
            currentBook.read100Pages();
            }
        }
    }
}
