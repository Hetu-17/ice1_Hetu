/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/*
    *Modifier: Hetu Patel
    *Student Number: 991778678
    *Date Modified: 2025-05-27
*/

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i]= c;
            System.out.println(c.getSuit() + ""+ c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a card value (1-13):  ");
            int userInput = input.nextInt();
            
            System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):  ");
            int userSuit = input.nextInt();
            
            Card usrCard = new Card();
            usrCard.setValue(userInput);
            usrCard.setSuit(Card.SUITS[userSuit]);
            
        // and search magicHand here
        boolean search = false;
        for (Card c : magicHand){
            if(c.getValue() == usrCard.getValue() && c.getSuit().equals(usrCard.getSuit())){
                search = true;
                break;
            }
        }
        //Then report the result here
        if (search){
                System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        // add one luckcard hard code 2,clubs
         Card luckCard = new Card();
         luckCard.setValue(2);
         luckCard.setSuit("Clubs");
         
         boolean luckySearch = false;
         for (Card c : magicHand){
         if(c.getValue() == luckCard.getValue() && c.getSuit().equals(luckCard.getSuit())){
         luckySearch = true;
         break;
         }
         }
         if (luckySearch){
         System.out.println("Congratulations! Your lucky card 2 of Clubs was found!");
         }
         else{
         System.out.println("Sorry, Your lucky card 2 of Clubs was not found!");
         }
                 
         }
}
