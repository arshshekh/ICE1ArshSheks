package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Arsh Shekh
 * @author Arsh Shekht Jan 25, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card(); 
               card.setValue ((int)(1 + Math.random()*13));
              
              card.setSuit(card.SUITS[(int)(0+Math.random()*3)]);
              hand[i]=card;
              System.out.println("card" + (i)+" "+hand[i].getSuit() +" "+hand[i].getValue());
              
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        Scanner keyboard = new Scanner(System.in)
                System.out.print("enter a suit:-");
                String input = keyboard.nextLine();
                System.out.print("enter a number:-");
                int num = keyboard.nextInt();
                
                for(int i=0; i<hand.length; i++)
                {
                    if (num==hand[i].getValue()&& input.equalsIgnoreCase(hand[i].getSuit()));
                    {
                        printinfo();
                    }
                }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Arsh Shekh Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Arsh Shekh, but you can call me bestie, boy or champ");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- i want to become a footballer");
        System.out.println("-- I want to build my career in sports!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- football");
        System.out.println("-- cricket");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
