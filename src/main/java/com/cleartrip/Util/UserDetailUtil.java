package com.cleartrip.Util;


import com.cleartrip.model.Subscription;
import com.cleartrip.model.User;
import com.cleartrip.service.UserService;

import java.util.Scanner;

public class UserDetailUtil {

    static UserService userService=SingletonUtil.getUserService();

    public static void addUser() {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Please enter first name");
        user.setFirstName(sc.nextLine());
        System.out.println("Please enter last name");
        user.setLastName(sc.nextLine());
        System.out.println("Please enter userId");
        String userId=sc.nextLine();
        while(userService.getUser(userId)!=null){
            System.out.println("User id already exists,Please enter other userId");
            userId=sc.nextLine();
        }
        user.setUserId(userId);

        System.out.println("Please press 1 for Monthly Subscription and 2 for Annual Subscription , other option implies default subscription");
        String sub=sc.nextLine();
        if(sub.equals("1")){
            user.setSubscription(Subscription.Monthly);
        }
        else if(sub.equals("2")){
            user.setSubscription(Subscription.Annual);
        }
        else{
            user.setSubscription(Subscription.Default);
        }
        System.out.println("User with user id:"+user.getUserId()+" created successfully with "+user.getSubscription()+" subscription ,please remember user id and password for further communication ");
        UserService userService=SingletonUtil.getUserService();
        userService.saveUser(user);


    }
}
