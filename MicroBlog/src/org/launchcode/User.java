package org.launchcode;

import java.util.ArrayList;

public class User {
    private int id;
    private static int nextId = 0;
    private String avatarPicture;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList posts;

    public User(){
    }

    public User(String avatarPicture, String username, String firstName, String lastName, String email)
    {
        this.id = nextId++;
        this.avatarPicture = avatarPicture;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.posts = new ArrayList();
    }

    public int getId()
    {
        return id;
    }

    public String getAvatarPicture()
    {
        return avatarPicture;
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

    public String getEmail() {
        return email;
    }

    public ArrayList getPosts() { return posts; }

    public String printUser() {
        return "Avatar: " + this.avatarPicture + "\nUsername: " + this.username + "\nName: " + this.firstName +
                " " + this.lastName + "\nEmail: " + this.email + "\n";
    }

    public void add(Post post) {
        this.posts.add(post);
    }

}

