package com.itschool;

public class User
{
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public User(int id, String login, String password, String name)
    {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = Type.гость;
    }

    public User()
    {
    }

    int id;
    String login;
    String password;
    String name;

    public Type getRole()
    {
        return role;
    }

    public void setRole(Type role)
    {
        this.role = role;
    }

    Type role;

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
