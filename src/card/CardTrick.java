/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Sanjeev Singh
 * student number - 991700942
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        
        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rnd.nextInt(13)+2);
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Card s = new Card();
        
        System.out.println("Enter a number between 1 and 13");
           int a = sc.nextInt();
           

           s.setSuit(Card.SUITS[rnd.nextInt(4)]);
           s.setValue(a);

            System.out.println(a + " " + s.getSuit());


           for (int i=0; i<magicHand.length; i++) {
           if(magicHand[i].equals(s)) {
            System.out.println("Found");
           } else {
            System.out.println("Sorry, your card is not in the magic hand");
           }
           break;
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        }
    }
}
