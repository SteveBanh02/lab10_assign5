// import java.util.Scanner;
public class Card {

    /*this class is responsible of declaring the suits
    and the value of the cards*/
    private int suit;
    private int value;

    //Constructor
    public Card(int suit, int value){
        this.suit = suit;
        this.value = value;
    }

    //getters
    public int getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    //methods
    public String getSuitAsString(int suit){

        switch (suit){
            case 1:
                return "Spades";
            case 2:
                return "Hearts";
            case 3:
                return "Diamonds";
            case 4:
                return "Clubs";
            case 5:
                return "Joker";
            default:
                return "Invalid suit";
        }
    }

    public String getValueAsString(int value){

        /*check if value is bigger than 2 if it is, return invalid because
        there are only 2 jokers in a deck of cards. here the logic is not
        2 bigger or equal than 2 because if value is 2 it would return invalid
        2 is not bigger than 2, therefore it goes to the else statement
        */
        // if(suit == 5){
        //     if (value > 2){
        //         return "invalid value";
        //     }else{
        //         return "\"" + value + "\"";
        //     }
        // }
        if(suit == 5){
            return "\"" + value + "\"";
        }
        
        switch (value){
            case 1:
                return "Ace";
            case 2,3,4,5,6,7,8,9,10:
                return Integer.toString(value);
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Invalid value";
        }
    }

    public String toString(){
        return getValueAsString(value) + " of " + getSuitAsString(suit);
    }

    // //main for testing
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     System.out.println("enter a suit");
    //     int suit = input.nextInt();

    //     System.out.println("enter a value");
    //     int value = input.nextInt();

    //     Card myCard = new Card (suit, value);

    //     System.out.println(myCard.toString());

    //     System.out.println(myCard.getSuitAsString(5));
    // }
    
}