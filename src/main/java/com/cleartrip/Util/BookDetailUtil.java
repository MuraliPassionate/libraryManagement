package com.cleartrip.Util;

import com.cleartrip.model.Book;
import com.cleartrip.model.User;
import com.cleartrip.service.BookService;

import java.util.Scanner;

public class BookDetailUtil {
    static BookService bookService = SingletonUtil.getBookService();

    public static void addBook() {

        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Please enter book name");
        book.setName(sc.nextLine());
        System.out.println("Please enter book id");
        String bookId = sc.nextLine();
        while (bookService.getBook(bookId) != null) {
            System.out.println("Book Id already exists ,Please enter other book id");
            bookId = sc.nextLine();
        }
        book.setBookId(bookId);
        bookService.saveBook(book);
    }
}
