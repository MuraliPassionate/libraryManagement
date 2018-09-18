package com.cleartrip.dao.impl;

import com.cleartrip.dao.BookDAO;
import com.cleartrip.model.Book;

import java.util.HashMap;
import java.util.Map;

public class BookDAOImpl implements BookDAO {

    private Map<String,Book> bookMap=new HashMap<String, Book>();

    private Map<String,Book> lendedMap=new HashMap<String, Book>();

    public void saveBook(Book book) {
        bookMap.put(book.getBookId(),book);
        System.out.println("book created with book id:"+book.getBookId());
    }

    public Book getBook(String bookId){
        return bookMap.get(bookId);
    }

    public void addToLendedBooks(String bookId){
        lendedMap.put(bookId,getBook(bookId));
    }

    public void removeFromLendedBooks(String bookId){
        lendedMap.remove(bookId);
    }


    public boolean checkIfBookLended(String bookId){
        if(lendedMap.containsKey(bookId))return true;
        return false;
    }

}
