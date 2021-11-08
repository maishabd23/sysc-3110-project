package Monopoly;

import Monopoly.BlankSquare;

import java.util.HashMap;

public class Board {
    private HashMap<Integer, Square> squares;

    /**
     * @author Maisha
     */
    public Board(){
        this.squares = new HashMap<>();
        this.setProperties();
    }

    /**
     * @author Shrimei
     * @author Sabah
     * @author Thanuja
     * Sets the properties with their descriptions
     */
    private void setProperties(){

        BlankSquare GO = new BlankSquare("GO");

        Property Mediterranean = new Property("Mediterranean Avenue", 60, ColourGroups.BROWN);
        Property Baltic = new Property("Baltic Avenue", 60, ColourGroups.BROWN);

        BlankSquare IncomeTax = new BlankSquare("Income Tax");

        BlankSquare ReadingRail = new BlankSquare("Reading Railroad");

        Property Oriental = new Property("Oriental Avenue", 100, ColourGroups.GREY);
        Property Vermont = new Property("Vermont Avenue", 100, ColourGroups.GREY);
        Property Connecticut = new Property("Connecticut Avenue", 120, ColourGroups.GREY);

        BlankSquare VisitingJail = new BlankSquare("Visiting Jail");

        Property StCharles  = new Property("St. Charles Place", 140, ColourGroups.PINK);

        BlankSquare Electric  = new BlankSquare("Electric Company");

        Property States  = new Property("States Avenue", 140, ColourGroups.PINK);
        Property Virginia  = new Property("Virginia Avenue", 160, ColourGroups.PINK);

        BlankSquare PennsylvaniaRail = new BlankSquare("Pennsylvania Railroad");

        Property StJames  = new Property("St. James Place", 180, ColourGroups.ORANGE);
        Property Tennessee  = new Property("Tennessee Avenue", 180, ColourGroups.ORANGE);
        Property NewYork  = new Property("New York Avenue", 200, ColourGroups.ORANGE);

        BlankSquare FreeParking = new BlankSquare("Free Parking");

        Property Kentucky  = new Property("Kentucky Avenue", 220, ColourGroups.RED);
        Property Indiana  = new Property("Indiana Avenue", 220, ColourGroups.RED);
        Property Illinois  = new Property("Illinois Avenue", 240, ColourGroups.RED);

        BlankSquare BO = new BlankSquare("B. & O. Railroad");

        Property Atlantic  = new Property("Atlantic Avenue", 260, ColourGroups.YELLOW);
        Property Ventnor  = new Property("Ventnor Avenue", 260, ColourGroups.YELLOW);

        BlankSquare WaterWorks = new BlankSquare("Water Works");

        Property Marvin = new Property("Marvin Gardens", 280, ColourGroups.YELLOW);

        BlankSquare GotoJail = new BlankSquare("Go to Jail");

        Property Pacific  = new Property("Pacific Avenue", 300, ColourGroups.GREEN);
        Property NorthCarolina  = new Property("North Carolina Avenue", 300,  ColourGroups.GREEN);
        Property Pennsylvania  = new Property("Pennsylvania Avenue", 320,  ColourGroups.GREEN);

        BlankSquare ShortLine = new BlankSquare("Short Line Railroad");

        Property ParkPlace = new Property("Park Place", 350,  ColourGroups.BLUE);

        BlankSquare LuxuryTax = new BlankSquare("Luxury Tax");

        Property Boardwalk  = new Property("Boardwalk", 400, ColourGroups.BLUE);

        this.squares.put(0,GO); //
        this.squares.put(1,Mediterranean);
        this.squares.put(2,Baltic);
        this.squares.put(3,IncomeTax);
        this.squares.put(4,ReadingRail);
        this.squares.put(5,Oriental);
        this.squares.put(6,Vermont);
        this.squares.put(7,Connecticut);
        this.squares.put(8,VisitingJail); //
        this.squares.put(9,StCharles);
        this.squares.put(10,Electric);
        this.squares.put(11,States);
        this.squares.put(12,Virginia);
        this.squares.put(13,PennsylvaniaRail);
        this.squares.put(14,StJames);
        this.squares.put(15,Tennessee);
        this.squares.put(16,NewYork);
        this.squares.put(17,FreeParking); //
        this.squares.put(18,Kentucky);
        this.squares.put(19,Indiana);
        this.squares.put(20,Illinois);
        this.squares.put(21,BO);
        this.squares.put(22,Atlantic);
        this.squares.put(23,Ventnor);
        this.squares.put(24,WaterWorks);
        this.squares.put(25,Marvin);
        this.squares.put(26,GotoJail); //
        this.squares.put(27,Pacific);
        this.squares.put(28,NorthCarolina);
        this.squares.put(29,Pennsylvania);
        this.squares.put(30,ShortLine);
        this.squares.put(31,ParkPlace);
        this.squares.put(32,LuxuryTax);
        this.squares.put(33,Boardwalk);
    }

    /**
     * @author Thanuja
     * @return box hashmap
     */
    public HashMap<Integer, Square> getSquares() {
        return squares;
    }

}