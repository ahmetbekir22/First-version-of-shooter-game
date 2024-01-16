import java.util.Random;
public class Player extends Game{
    private String name;
    private int money;
    private int health;
    private  boolean isTerrorist;
    private  final Pistol pistol;


    public  Player (boolean isTerrorist, String name){// Constructor for Player class.
        this.name= name;
        this.isTerrorist= isTerrorist;
        this.health= 100;
        this.money= 1000; // Initially every player has 1000 dollars .
        this.pistol= new Pistol();
    }

    public  void shoot(Player target){//shooting a target player
        if (target.isTerrorist ==this.isTerrorist){// shooting his/her teammates.
            System.out.println("Failed! Target player is on the same side!");}
        else if (target.health == 0) { //shooting a dead player.
            System.out.println("Failed! The enemy is already dead!");}
        else if (this.pistol.getBulletMagazine()==0) {// if bullet is over.
            System.out.println("Failed! No bullet left in magazine!");}
        else {
            boolean isMisfire = RandomlyMisFareRate()<= (pistol.misFireRate*10) ; // it is equal to the 0.3 rate.that's already  given in Pistol.java class.
            if (!isMisfire){
                System.out.println("Failed! Pistol misfired!");}
            else {//successful shooting.
                this.pistol.decreaseBulletAmount();
                target.decreasingHealth(20);
                System.out.println("Success! Pinpoint accuracy!\n"
                + "Info: " + "There are " +this.pistol.getBulletMagazine() +" bullet(s) left in "+ this.name+ "'s magazine.\n"+
                        "Info: " +target.name +"'s health level is decreased to " + decreasingHealth(20) +"." ) ;}
        }
    }

    public void moneyBusiness(Player borrower, int amountOfDept){ //Lending money to another player.
        if (borrower.isTerrorist){ // giving borrow money to enemy. it is not allowed.
            System.out.println("Failed! Come on! Too young to be a spy!");
        } else if (this.money < amountOfDept) { //situation that player doesn't have enough money to borrow.
            System.out.println("Failed! "+ this.name +" cannot afford it now!");
        }else {
            System.out.println("Success! " +  this.name +" is a perfect philanthropist!\n" +
                    "Info: "+ this.name +" has now " + (this.money- amountOfDept)+" dollars!\n"+
            "Info: "+ borrower.name +" has now " + (borrower.money + amountOfDept) + " dollars!");}
    }


    public  void loadMagazine(){//loading bullets into the pistol's magazine.
        int cost = pistol.getBulletCost()*(20 -pistol.getBulletMagazine()); // calculate the cost.player just pay money for 5 *(number of bullets fired).
        this.money -= cost; //decreasing cost from total money.
        System.out.println("Success! The real war begins now!\n"+
                "Info: "+ this.name +" has now 20 bullets in the magazine!\n"+
                "Info: "+this.name +" has now "+ this.money + " dollars!"); }

    public void hospital(){//player's health situation.
        if (this.money>= 500){// if player has more or equal 500 dollars money health will be 100.
            health = 100;
            money -=500;
            System.out.println("Success! "+ this.name +" is now as fit as s(he) has never been before\n" +
                    "Info: "+ this.name+ "'s health level is now " + health+ ".\n" +
                    "Info: "+ this.name+" has now "+ this.money +"  dollars!");
                }
            else {System.out.println("Failed! "+ this.name +" cannot afford it now!");}
    }

    public int decreasingHealth(int damage){//health changing during game.
        this.health -=damage ;// damage is constant ,and it's 20 for every single successful shooting .
        if (this.health<0){
            this.health =0;
        } return  health; }


    public   static int RandomlyMisFareRate(){ // calculate mis fire rate randomly.
        Random random = new Random();
        int rate = random.nextInt(1,11);
        return rate;}
}
