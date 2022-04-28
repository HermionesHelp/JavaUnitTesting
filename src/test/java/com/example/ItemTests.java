package com.example;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTests {

    @Test
    @DisplayName("Example Test")
    public void exampleTest (){
        assertEquals(10,10,.001);
    }

    @Test
    @DisplayName("Test correct return for item with no sell price.")
    public void testNoSell(){
        Item testItem1 = new Item("Lucky Stone", "This stone bring you luck on your adventure", 50);
        String expected = "This is a Lucky Stone - This stone bring you luck on your adventure. You can buy this item for 50. It cannot be sold.";
        assertEquals(expected, testItem1.toString());

    }

    @Test
    @DisplayName("Test correct return for sellable item.")
    public void testSellable(){
        Item testItem2 = new Item("Steel Sword", "Good for hacking up enemies.", 15, 5);
        assertEquals("This is a Steel Sword - Good for hacking up enemies.. You can buy this item for 15. Or sell this item for 5.", testItem2.toString());
    }

    @Test
    @DisplayName("Test not a duplicate item.")
    public void testDupes(){
        Item testItem1 = new Item("Lucky Stone", "This stone bring you luck on your adventure", 50);
        Item testItem2 = new Item("Steel Sword", "Good for hacking up enemies.", 15, 5);
        assertFalse(testItem1.equals(testItem2));
    }

    @Test
    @DisplayName("Test IS a duplicate item.")
    public void testAreDupes(){
        Item testItem1 = new Item("Steel Sword", "Good for hacking up enemies.", 15, 5);
        Item testItem2 = new Item("Steel Sword", "Good for hacking up enemies.", 15, 5);
        assertTrue(testItem1.equals(testItem2));
    }
 }
