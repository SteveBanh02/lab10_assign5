public class Joker extends Card{

    //constructor
    public Joker(int suit, int value){
        super(5, value);
    }

    //getters
    public String getSuitAsString(int suit){
        return "Joker";
    }

    public String getValueAsString(int value){
        return "\"" + value + "\"";
    }

    //main for testing
    // public static void main(String[] args) {
        
    //     Joker myJoker = new Joker(3, 1);

    //     System.out.println(myJoker.toString());
    // }
}
