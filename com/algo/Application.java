package com.algo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {

    List<UserInfo> userList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of users ");
        Application application = new Application();
        int users = sc.nextInt();
        for (int i = 1; i <= users; i++) {
            UserInfo user = new UserInfo();
            takeInput(sc, i, user);
            application.userList.add(user);
        }

        application.userList.get(0).logHeaders();
        application.userList.forEach(System.out::println);

        logMaxDurationUser(application.userList);
    }

    private static void takeInput(Scanner sc, int i, UserInfo user) {
        System.out.print("Enter the user identification for user " + i + " ");
        user.setUid(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter the LOGIN date and time in dd-MM hh:mm for user " + i + " ");
        user.setLoginDate(takeDateInput(sc));
        System.out.print("Enter the LOGOUT date and time in dd-MM hh:mm for user " + i + " ");
        user.setLogoutDate(takeDateInput(sc));
        setDuration(user);
    }

    private static LocalDateTime takeDateInput(Scanner sc) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM kk:mm");
        try {
            String dateInStr = sc.nextLine();
            Date date = format.parse(dateInStr);
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        } catch (Exception e) {
            System.out.println("Please use correct date format. Ending the program.");
            System.exit(0);
        }
        return null;
    }

    private static void setDuration(UserInfo user) {
        long hrs = ChronoUnit.HOURS.between(user.getLoginDate(), user.getLogoutDate());
        long mins = (ChronoUnit.MINUTES.between(user.getLoginDate(), user.getLogoutDate())) % 60;
        Duration duration = new Duration(hrs, mins);
        user.setDuration(duration);
    }

    private static void logMaxDurationUser(List<UserInfo> userList) {
        UserInfo maxDurationUser = new UserInfo();
        Duration maxDuration = new Duration(0,0);

        for (UserInfo user : userList) {
            if (user.getDuration().isThisGreaterDuration(maxDuration)) {
                maxDuration = user.getDuration();
                maxDurationUser = user;
            }
        }
        System.out.println("Maximum Duration User");
        System.out.println(maxDurationUser.toString());
    }
}
