package com.itschool;

import java.util.ArrayList;

public class Database
{
    private ArrayList<User> db;

    public Database()
    {
        this.db = new ArrayList<>();
    }

    public boolean add(User user)
    {
        for (User tempUser: db)
        {
            if (user.login.equals(tempUser.login))
                return false;
        }
        return db.add(user);
    }

    public User getUser(int number)
    {
        return db.get(number);
    }

    public boolean remove(int number)
    {
        return db.remove(number) != null ? true : false;
    }

    public void clear()
    {
        db.clear();
    }

    @Override
    public String toString()
    {
        String users = "";
        for (User user: db)
        {
            users += user + "\n";
        }
        return users;
    }
}
