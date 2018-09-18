package com.cleartrip;

import com.cleartrip.Util.BookDetailUtil;
import com.cleartrip.Util.LendingUtil;
import com.cleartrip.Util.UserDetailUtil;

import java.util.Scanner;

public class LibraryApp {


    public static void main(String[] args) {


        while(true){

            System.out.println("Please enter ");
            System.out.println("1 To Add Books");
            System.out.println("2 To Add User");
            System.out.println("3 To lend Book");
            System.out.println("4 To return book");
            System.out.println("5 To exit");
            Scanner sc=new Scanner(System.in);
            String input=sc.next();
            if(input.equals("1")){
                BookDetailUtil.addBook();
            }
            else if(input.equals("2")){
                UserDetailUtil.addUser();
            }
            else if(input.equals("3")){
                LendingUtil.lendBook();
            }
            else if(input.equals("4")){
                LendingUtil.returnBook();
            }
            else if(input.equals("5")){
                break;
            }
            else{
                System.out.println("Invalid input");
            }



        }

    }

}
