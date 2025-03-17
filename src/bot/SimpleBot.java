package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        int birthYear=2025;
        String botName="Patrício";
        String userName;

        Scanner sc=new Scanner(System.in);

        System.out.println("Hello! My name is "+botName);
        System.out.println("I was created in "+birthYear);
        System.out.println("Please, remind me your name.");
        userName= sc.next();//username scan
        System.out.println("What a great name you have, "+userName+"!");
    }
}
