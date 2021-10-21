import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Board {

    private Dice dice;
    private HashMap<Integer, Box> boxes;
    private ArrayList<Player> players;
    private int currentPlayerNumber;
    private Player playerNumber;

    /**
     * @author Sabah, Shrimei
     */

    public Board (){
        this.dice= new Dice();
        this.boxes = new HashMap<>();
        this.players = new ArrayList<>();
        this.setProperties();
        this.addPlayer(new Player());
        this.addPlayer(new Player());
        this.currentPlayerNumber = players.get(0).getId();
    }

    /**
     * @author Shrimei, Sabah
     * sets the properties with their descriptions
     */

    private void setProperties(){

        Property GO = new Property("GO", 0, "");
        // player collects $200 whenever they pass this property, have to fix

        Property Mediterranean = new Property("Mediterranean Avenue", 60, "brown");
        Property Baltic = new Property("Baltic Avenue", 60, "brown");

        Property IncomeTax = new Property("Income Tax", 200, "white");
        // no rent, pays $200 everytime (have to fix)

        Property ReadingRail = new Property("Reading Railroad", 200, "black");
        // for each railroad added to collection, the rent is doubled, have to fix rent code separately for these 4

        Property Oriental = new Property("Oriental Avenue", 100, "grey");
        Property Vermont = new Property("Vermont Avenue", 100, "grey");
        Property Connecticut = new Property("Connecticut Avenue", 120, "grey");

        Property VisitingJail = new Property("Visiting Jail", 0, "");

        Property StCharles  = new Property("St. Charles Place", 140, "pink");

        Property Electric  = new Property("Electric Company", 150, "white");
        // no rent, pays $150 everytime (have to fix)

        Property States  = new Property("States Avenue", 140, "pink");
        Property Virginia  = new Property("Virginia Avenue", 160, "pink");

        Property PennsylvaniaRail = new Property("Pennsylvania Railroad", 200, "black");
        // for each railroad added to collection, the rent is doubled, have to fix rent code separately for these 4

        Property StJames  = new Property("St. James Place", 180, "orange");
        Property Tennessee  = new Property("Tennessee Avenue", 180, "orange");
        Property NewYork  = new Property("New York Avenue", 200, "orange");

        Property FreeParking = new Property("Free Parking", 0, "");

        Property Kentucky  = new Property("Kentucky Avenue", 220, "red");
        Property Indiana  = new Property("Indiana Avenue", 220, "red");
        Property Illinois  = new Property("Illinois Avenue", 240, "red");

        Property BO = new Property("B. & O. Railroad", 200, "black");
        // for each railroad added to collection, the rent is doubled, have to fix rent code separately for these 4

        Property Atlantic  = new Property("Atlantic Avenue", 260, "yellow");
        Property Ventnor  = new Property("Ventnor Avenue", 260, "yellow");

        Property WaterWorks = new Property("WaterWorks", 150, "white");
        // no rent, pays 150 everytime player lands (have to fix)

        Property Marvin = new Property("Marvin Gardens", 280, "yellow");

        Property GotoJail = new Property("Go to Jail", 0, "");

        Property Pacific  = new Property("Pacific Avenue", 300, "green");
        Property NorthCarolina  = new Property("North Carolina Avenue", 300, "green");
        Property Pennsylvania  = new Property("Pennsylvania Avenue", 320, "green");

        Property ShortLine = new Property("Short Line", 200, "black");
        // for each railroad added to collection, the rent is doubled, have to fix rent code separately for these 4

        Property ParkPlace = new Property("Park Place", 350, "blue");

        Property LuxuryTax = new Property("Luxury Tax", 100, "white");
        // no rent, pays 100 everytime player lands (have to fix)

        Property Boardwalk  = new Property("Boardwalk", 400, "blue");

        this.boxes.put(0,GO);
        this.boxes.put(1,Mediterranean);
        this.boxes.put(2,Baltic);
        this.boxes.put(3,IncomeTax);
        this.boxes.put(4,ReadingRail);
        this.boxes.put(5,Oriental);
        this.boxes.put(6,Vermont);
        this.boxes.put(7,Connecticut);
        this.boxes.put(8,VisitingJail);
        this.boxes.put(9,StCharles);
        this.boxes.put(10,Electric);
        this.boxes.put(11,States);
        this.boxes.put(12,Virginia);
        this.boxes.put(13,PennsylvaniaRail);
        this.boxes.put(14,StJames);
        this.boxes.put(15,Tennessee);
        this.boxes.put(16,NewYork);
        this.boxes.put(17,FreeParking);
        this.boxes.put(18,Kentucky);
        this.boxes.put(19,Indiana);
        this.boxes.put(20,Illinois);
        this.boxes.put(21,BO);
        this.boxes.put(22,Atlantic);
        this.boxes.put(23,Ventnor);
        this.boxes.put(24,WaterWorks);
        this.boxes.put(25,Marvin);
        this.boxes.put(26,GotoJail);
        this.boxes.put(27,Pacific);
        this.boxes.put(28,NorthCarolina);
        this.boxes.put(29,Pennsylvania);
        this.boxes.put(30,ShortLine);
        this.boxes.put(31,ParkPlace);
        this.boxes.put(32,LuxuryTax);
        this.boxes.put(33,Boardwalk);

    }

    /**
     * @author Sabah
     * @param newPlayer to be added
     */
    private void addPlayer (Player newPlayer) {
        int length = players.size();
        newPlayer.setId(length);
        players.add(newPlayer);
    }

    /**
     * @author Shrimei
     */
    private void switchTurn(){
        if(currentPlayerNumber+1 == players.size()){
            this.currentPlayerNumber = 0;
        } else {
            this.currentPlayerNumber += 1;
        }
    }

    /**
     * @author Shrimei
     */
    private void play(){
        Scanner sc = new Scanner(System.in);

        while(true){
            Player currentPlayer = players.get(currentPlayerNumber);
            Box currentProperty =  boxes.get(currentPlayer.getPosition() % boxes.size());
            currentPlayer.printCurrentState(currentProperty.getName());
            System.out.println("Enter a command");
            String command = sc.nextLine();
            if(command.equals("q")){
                System.out.println("You have exited the game");
                break;
            } else if (command.equals("roll")){
                int roll = dice.rollDice();
                System.out.println(currentPlayerNumber);
                System.out.println(roll);
                System.out.println(currentPlayer.changePosition(roll));
                currentProperty = boxes.get(currentPlayer.getPosition() % boxes.size());
                //print property info
                System.out.println(currentProperty.toString());
                //give option to buy/pay rent
                this.switchTurn();
            }
        }
    }

    /**
     * @author Sabah
     * @param args
     */

    public static void main(String[] args) {
        Board board = new Board();
        board.play();
    }
}
