package com.example;

public class Main {

    public static void main(String args[]) {
        Item testItem = new Item("Lucky Stone", "This stone bring you luck on your adventure", 50);
        Item testItem2 = new Item("Steel Sword", "Good for hacking up enemies.", 15, 5);

        System.out.println(testItem.getItem());
        System.out.println(testItem2.getItem());
    }
}
