import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println(
            """
            Weclome to the card game of War!

            The player has to satisfy one of the following conditions:
                - The player must successfully guess the card that they picked
                - If the player picks a joker, they automatically wins
            The player has 5 rounds to win. 
                    """
        );
        
        Deck cardDeck = new Deck();

        System.out.println("please enter the name of player 1: ");
        String player1 = input.nextLine();

        System.out.println("please enter the name of player 2: ");
        String player2 = input.nextLine();

        //created 2 players based on the given name (part 1)
        Player firstPlayer = new Player(player1);
        Player secondPlayer = new Player(player2);

        //loop for splitting the deck into 2 and giving it to player 1 and 2 (part 1)
        for(int i = 0; i < 27; i++){

            //putting odd number cards into player 1 deck
            firstPlayer.getPlayerDeck().addToDeck(cardDeck.dealCard(i*2));
            //putting even number cards into player 2 deck
            secondPlayer.getPlayerDeck().addToDeck(cardDeck.dealCard(i*2 + 1));           
        }

        System.out.println("\n" + firstPlayer.getName() + " has:\n");
        firstPlayer.getPlayerDeck().printDeck();

        System.out.println("\n" + secondPlayer.getName() + " has:\n");
        secondPlayer.getPlayerDeck().printDeck();

        System.out.println("\nTransferring all cards from " + firstPlayer.getName() + " to " + secondPlayer.getName() + "...\n");

        // first loop to transfer all player1 cards to player2
        Card card; // Temporary variable to hold the dealt card for comparing 1 card at a time
        while ((card = firstPlayer.getPlayerDeck().dealCard()) != null) {
            secondPlayer.getPlayerDeck().addToDeck(card);
        }
        // Print both players' decks after the first transfer
        System.out.println("\nAfter transfer:");

        //player1 deck should be empty
        System.out.println("\n" + firstPlayer.getName() + " has:\n");
        firstPlayer.getPlayerDeck().printDeck();

        //player2 should have all 54 cards
        System.out.println("\n" + secondPlayer.getName() + " has:\n");
        secondPlayer.getPlayerDeck().printDeck();

        // second loop to transfer all player 2 cards to player1
        while ((card = secondPlayer.getPlayerDeck().dealCard()) != null){
            firstPlayer.getPlayerDeck().addToDeck(card);
        }
        // Print both players' decks after the second transfer
        System.out.println("\nAfter transfer:");

        //player1 deck should have all 54 cards
        System.out.println("\n" + firstPlayer.getName() + " has:\n");
        firstPlayer.getPlayerDeck().printDeck();

        //player 2 deck should be empty
        System.out.println("\n" + secondPlayer.getName() + " has:\n");
        secondPlayer.getPlayerDeck().printDeck();

        // boolean win = false;
        // for(int round = 0; round < 5; round++){
        //     //cardDeck.shuffle();

        //     System.out.println("Please guess a card (except the joker cards), mentioning the value first, and then the suit.");
        //     String cardGuess = input.nextLine();

        //     System.out.println("Please pick a card from the deck. Enter a number between 0-53.");
        //     int index = input.nextInt();
        //     System.out.println("You have picked " + cardDeck.dealCard(index));

        //     input.nextLine();

        //     String cardPicked = String.valueOf(cardDeck.dealCard(index));
        //     System.out.println(cardPicked);
            
        //     if(cardGuess.equalsIgnoreCase(cardPicked)){
        //         System.out.println("Congradulation, you won! You picked your guessed card.");
        //         win = true;
        //         break;
        //     }else if(cardPicked.equalsIgnoreCase("\"1\" of joker") || cardPicked.equalsIgnoreCase("\"2\" of joker")){
        //         System.out.println("Congradulation, you won! You picked a joker card.");
        //         win = true;
        //         break;
        //     }else{
        //         if(round < 4){
        //             System.out.println("Try again");
        //         }
        //     }
        // }
        // if(!win){
        //      System.out.println("You lost the game.");
        // }
    }
}
