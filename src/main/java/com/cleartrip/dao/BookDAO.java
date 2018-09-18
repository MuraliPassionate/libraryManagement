package com.cleartrip.dao;

import com.cleartrip.model.Book;

import java.util.HashMap;
import java.util.Map;

public interface BookDAO {



    public void saveBook(Book book);

    public Book getBook(String bookId);

    public void addToLendedBooks(String bookId);

    public void removeFromLendedBooks(String bookId);

    public boolean checkIfBookLended(String bookId);

}
