public class Pistol extends Game{
    private  int bulletMagazine;
    public final double misFireRate = 0.3;
    private final int bulletCost = 5; // it's constant .

    public int getBulletMagazine() {
        return bulletMagazine;
    }

    public int getBulletCost() {
        return bulletCost;
    }

    public Pistol() {
        this.bulletMagazine= 20; //capacity of pistol.
    }

    public  int decreaseBulletAmount() {//decrease bullet amount after every successful shooting.
        return bulletMagazine--;
    }


    }




