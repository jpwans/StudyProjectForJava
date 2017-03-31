package com.wrox;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by jiangqin on 17/3/24.
 */
public class User {
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPermissions(Map<String, Boolean> permissions) {
        this.permissions = permissions;
    }

    private long userId;
    private String username;

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Map<String, Boolean> getPermissions() {
        return permissions;
    }

    private String firstName;
    private String lastName;
    private Map<String, Boolean> permissions = new Hashtable<>();

    public User(){}

    public User(long userId, String username, String firstName, String lastName)
    {
        this.userId = userId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
