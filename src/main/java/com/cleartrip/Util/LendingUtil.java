package com.cleartrip.Util;

import com.cleartrip.model.Book;
import com.cleartrip.model.User;
import com.cleartrip.service.BookService;
import com.cleartrip.service.UserService;

import java.util.Scanner;

public class LendingUtil {

    static UserService userService = SingletonUtil.getUserService();
    static BookService bookService = SingletonUtil.getBookService();

    public static void lendBook() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter user id");
        User user = null;
        Book book = null;
        String userId = sc.nextLine();
        while (userService.getUser(userId) == null) {
            System.out.println("User doesnt exist , please enter other user id");
            userId = sc.nextLine();

        }
        user = userService.getUser(userId);
        if (user.getBooks().size() >= user.getSubscription().getValue()) {
            System.out.println("Subscription limit exceeded");

        } else {
            System.out.println("Please enter book id");
            String bookId = sc.nextLine();
            while (bookService.getBook(bookId) == null || bookService.checkIfBookLended(bookId)) {
                System.out.println("Book doesnt exist or already lended, please enter other book id");
                bookId = sc.nextLine();
            }
            book = bookService.getBook(bookId);
            user.getBooks().add(bookId);
            bookService.addToLendedBooks(bookId);
            System.out.println("Book lended successully");
        }
    }

    public static void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter user id");
        User user = null;
        Book book = null;
        String userId = sc.nextLine();
        while (userService.getUser(userId) == null) {
            System.out.println("User doesnt exist , please enter other user id");
            userId = sc.nextLine();

        }
        user = userService.getUser(userId);
        System.out.println("Please enter book id");
        String bookId = sc.nextLine();
        while (bookService.getBook(bookId) == null ) {
            System.out.println("Book doesnt exist , please enter other book id");
            bookId = sc.nextLine();
        }
        book = bookService.getBook(bookId);
        user.getBooks().remove(bookId);
        bookService.removeFromLendedBooks(bookId);
        System.out.println("book successfully removed");
    }
}
