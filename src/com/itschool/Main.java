package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Database db = new Database();
        // db.db.add(new User(1, "user", "password", "User Noname"));
        db.add(new User(1, "user1", "password1", "User1 Noname"));
        db.add(new User(2, "user2", "password2", "User2 Noname"));
        db.add(new User(3, "user3", "password3", "User3 Noname"));
        db.add(new User(4, "user4", "password4", "User4 Noname"));
        db.add(new User(5, "user5", "password5", "User5 Noname"));

        System.out.println(db.getUser(2)/*.toString()*/);
        db.remove(3);

        System.out.println(db);

        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        String number;
        while (result == false || id <= 0) {
            System.out.println("Input ID:\n");
            number = scanner.next();
            try {
                id = Integer.valueOf(number);
                result = true;
            } catch (Exception e) {
                System.out.println(e + "\nTry to input again:\n");
            }
        }
        scanner.close();

        User user = new User(id, "login", "password", "Name");
        System.out.println("User has" + (db.add(user) ? "" : "n't") + " been added succesfuly");
        System.out.println("User has" + (db.add(user) ? "" : "n't") + " been added succesfuly");
        db.getUser(1).setRole(Type.опытный_пользователь);
        System.out.println(db);
    }
}
