package org.launchcode;

public class Post {
    private static int nextId = 0;
    private User user;
    private int id;
    private String content;
    private String webAddress;

    //constructor without a web address
    public Post(User user, String content){
        this.user = user;
        this.id = nextId++;
        this.content = content;
    }

    //constructor with a web address
    public Post(User user, String content, String webAddress){
        this.user = user;
        this.id = nextId++;
        this.content = content;
        this.webAddress = webAddress;
    }

    public User getUser() {
        return user;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public String printPost() {
        if(this.webAddress.length() == 0){
            return ((this.id + 1) + ". " + "Posted by: " + this.user.getUsername() + "\n" + this.content + "\n");
        } else {
            return ((this.id + 1) + ". " + "Posted by: " + this.user.getUsername() + "\n" + this.content + "\n"
                    + "Web address: " + this.webAddress + "\n");
        }
    }
}
