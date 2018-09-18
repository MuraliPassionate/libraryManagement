package com.cleartrip.service;

import com.cleartrip.model.Book;

public interface BookService {

    public Book saveBook(Book book);

    public Book getBook(String bookId);

    public void addToLendedBooks(String bookId);

    public void removeFromLendedBooks(String bookId);

    public boolean checkIfBookLended(String bookId);


}
