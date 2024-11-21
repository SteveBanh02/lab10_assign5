public class Deck {

    //This class is for building our deck of cards
    private Card[] deck;
    private int numCards; //(part 1)

    //constructors
    //constructor without a parameter, default 
    public Deck(){
        //created a deck of cards object
        deck = new Card[54];
        numCards = 54; //initialize 54 cards (part 2)

        //loop to create the deck of cards
        int position = 0; 
        for(int i = 1; i <= 4; i++){
            //create the cards 0-51
            for(int j = 1; j <= 13; j++){
                Card myCard = new Card(i,j);
                deck[position++] = myCard;
            }
            //hard code the cards 52 and 53 for jokers
            deck[52] = new Joker(5,1);
            deck[53] = new Joker(5,2);
        }
    }

    //constructor with a parameter (part 1)
    public Deck(int deckSize){
        deck = new Card[deckSize];
        numCards = 0;
    }

    //methods
    public void shuffle(){
        for ( int i = deck.length-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

    //returns the card that is at the specified position
    public Card dealCard(int index){
        return deck[index];
    }

    //return the card starting from the bottom (part 2)
    public Card dealCard(){

        if(numCards > 0){
            return deck[--numCards];
        }else{
            // System.out.println("empty deck");
            return null;
        }
    }

    //method for adding a card to the deck (part 1)
    public void addToDeck(Card card){
        if(numCards < deck.length){
            deck[numCards] = card;
            numCards++;
        }else{
            System.out.println("Card deck is full.");
        }
    }

    //method for printing the deck after it's been separated (part 1)
    public void printDeck(){
        
        if(numCards == 0){
            System.out.println("empty deck");//part 2
        }else{
            for(int i = 0; i < numCards; i++){
                System.out.println(deck[i]);
            }
        }
    }

    //main for testing
    // public static void main(String[] args) {

    //printDeck();
    //Deck myDeck = new Deck();

    //for(int i = 0; i < myDeck.deck.length; i++){
    //System.out.println(myDeck.deck[i]);
    //}
    // }
}