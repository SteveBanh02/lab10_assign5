public class Joker extends Card{

    public Joker(int value, int suit){
        super(value, 5);
    }

    public String getSuitAsString(int suit){
        return "Joker";
    }

    public String getValueAsString(int value){
        return "\"" + super.getValue() + "\"";
    }

    public String toString(){
        return getValueAsString(value) + " of " + getSuitAsString(suit);
    }

    //main for testing
    // public static void main(String[] args) {
        
    //     Joker myJoker = new Joker(suit, value);

    //     System.out.println(myJoker.toString());
    // }
}
