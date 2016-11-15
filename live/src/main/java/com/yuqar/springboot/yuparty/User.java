package com.yuqar.springboot.yuparty.model;

public class User
{
 private long id;//unique identifier
 private String username, password, email, cellNumber;
 
    public User(long id, String username, String password, String email, String cellnumber)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email=email;
        this.cellNumber=cellnumber;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, username='%s', password='%s', email='%s', cellNumber='%s']",
                id, username, password, email, cellNumber);
    }
}
