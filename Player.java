public class Player {
    
    private String name;
    private Deck playerDeck;

    //constructor
    public Player(String name){
        this.name = name;
        playerDeck = new Deck(54);
    }

    //getters
    public String getName(){
        return name;
    }

    public Deck getPlayerDeck(){
        return playerDeck;
    }
}
