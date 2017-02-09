package com.novauc;

import java.util.Scanner;

public class Game {

    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();


    public static void main(String[] args) throws Exception {
        // write your code here

        System.out.println("Welcome, traveller");

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();

        player.findItem("shield");
        player.findItem("belt");
        player.findItem("diamonds");

    }


    public static String nextLine() {
        String line = scanner.nextLine();

        while (line.startsWith("/")) {
            switch (line) {

                case "/inv":
                    for (String item : player.items) {
                        System.out.println(item);
                    }
                    break;

                case "/exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Command not found!");
                    break;

            }

            line = scanner.nextLine();

        }

        return line;
    }
}
