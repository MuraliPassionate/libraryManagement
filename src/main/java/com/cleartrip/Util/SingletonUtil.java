package com.cleartrip.Util;

import com.cleartrip.dao.BookDAO;
import com.cleartrip.dao.UserDAO;
import com.cleartrip.dao.impl.BookDAOImpl;
import com.cleartrip.dao.impl.UserDAOImpl;
import com.cleartrip.service.BookService;
import com.cleartrip.service.UserService;
import com.cleartrip.service.impl.BookServiceImpl;
import com.cleartrip.service.impl.UserServiceImpl;

public class SingletonUtil {

    private SingletonUtil(){

    }

    public static BookService bookService;

    public static UserService userService;

    public static UserDAO userdao;

    public static BookDAO bookdao;


    public static UserDAO getUserdao(){
        if(userdao==null){
            userdao=new UserDAOImpl();
        }

        return userdao;
    }

    public static BookDAO getBookdao(){
        if(bookdao==null){
            bookdao=new BookDAOImpl();
        }

        return bookdao;
    }

    public static UserService getUserService(){
        if(userService==null){
            userService=new UserServiceImpl();
        }

        return userService;
    }

    public static BookService getBookService(){
        if(bookService==null){
            bookService=new BookServiceImpl();
        }

        return bookService;
    }


}
