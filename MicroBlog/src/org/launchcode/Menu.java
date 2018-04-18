package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static Scanner keyboard = new Scanner(System.in);
    public static User[] userData = new User[10];
    public static Post[] postData = new Post[10];
    public static User currentUser = null;

    public static void main(String[] args) {
        int menuOption;

        while (true) {
            System.out.println("\nMain Menu");
            String[] options = {"1) Create a new user", "2) Become an existing user", "3) Create a post as the current user",
                    "4) Print all posts", "5) Print all users"};

            printMenu(options);

            if (currentUser == null) {
                System.out.println("You have not created any user accounts.  What would you like to do?");
            } else {
                System.out.println("You are currently " + currentUser.getUsername() + ". What would you like to do?");
            }

            menuOption = keyboard.nextInt();

            if (menuOption == 1) {
                currentUser = createUser();
            } else if (menuOption == 2) {
                System.out.println("Here is a list of the current user accounts.  Please choose a number.");
                printUsers(userData);
                int userInput = keyboard.nextInt();
                if(userData[userInput] == null){
                    System.out.println("That is not a valid user.");
                } else {
                    currentUser = userData[userInput - 1];
                }
            } else if (menuOption == 3) {
                if(currentUser == null){
                    System.out.println("You must create a user first.");
                } else {
                    ArrayList<Post> posts = currentUser.getPosts();
                    if(posts.size() == 0) {
                        System.out.println("This user has not added any posts.");
                        createPost();
                    } else {
                        Post recentPost = posts.get(posts.size()-1);
                        System.out.println("Most recent post by " + currentUser.getUsername()
                                + ": \n" + recentPost.getContent());
                        createPost();
                    }
                }
            } else if (menuOption == 4) {
                printPosts(postData);
            } else if (menuOption == 5) {
                printUserDetails(userData);
            }
        }
    }

    public static void printMenu(String[] options) {
        for (int option = 0; option < options.length; option++) {
            System.out.println(options[option]);
        }
    }

    public static User createUser() {
        String avatarPicture;
        String username;
        String firstName;
        String lastName;
        String email;

        System.out.println("What is the web address (url) to your avatar picture?");
        keyboard.skip("\n");
        avatarPicture = keyboard.nextLine();

        System.out.println("Please enter a username.");
        username = keyboard.nextLine();

        System.out.println("Please enter your first name.");
        firstName = keyboard.nextLine();

        System.out.println("Please enter your last name.");
        lastName = keyboard.nextLine();

        System.out.println("Please enter your email address.");
        email = keyboard.nextLine();

        User newUser = new User(avatarPicture, username, firstName, lastName, email);
        userData[newUser.getId()] = newUser;
        return newUser;
    }

    public static void printUsers(User[] users) {
        for (int counter = 0; counter < users.length; counter++) {
            if (users[counter] == null) {
                break;
            } else {
                System.out.println((counter + 1) + ") " + users[counter].getUsername());
            }
        }
    }

    public static Post createPost() {
        String content;
        String webAddress;

        System.out.println("Enter your new post content: ");
        keyboard.skip("\n");
        content = keyboard.nextLine();

        System.out.println("Enter a web address/link (optional): ");
        webAddress = keyboard.nextLine();

        Post newPost = new Post(currentUser, content, webAddress);
        currentUser.add(newPost);
        postData[newPost.getId()] = newPost;
        return newPost;
    }

    public static void printPosts(Post[] posts) {
       System.out.println("User Posts");
       for(int counter = 0; counter < posts.length; counter++){
           if (posts[counter] == null) {
               break;
           } else {
               System.out.print(posts[counter].printPost());
           }
       }
    }

    public static void printUserDetails(User[] users) {
       System.out.println("User Details");
       for (int counter = 0; counter < users.length; counter++) {
           if (users[counter] == null) {
               break;
           } else {
               System.out.println((counter + 1) + ". " + users[counter].printUser());
           }
       }
    }
}