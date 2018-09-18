package com.cleartrip.service.impl;

import com.cleartrip.Util.SingletonUtil;
import com.cleartrip.dao.BookDAO;
import com.cleartrip.model.Book;
import com.cleartrip.service.BookService;

public class BookServiceImpl implements BookService {

    BookDAO bookDAO=SingletonUtil.getBookdao();
    public Book saveBook(Book book) {
        bookDAO.saveBook(book);
        return book;
    }

    public Book getBook(String bookId){
       Book book= bookDAO.getBook(bookId);
       return book;
    }

    public void addToLendedBooks(String bookId){
        bookDAO.addToLendedBooks(bookId);
    }

    public void removeFromLendedBooks(String bookId){
        bookDAO.removeFromLendedBooks(bookId);
    }

    public boolean checkIfBookLended(String bookId){
        return bookDAO.checkIfBookLended(bookId);
    }

}
