public class Game {
    public static void main(String[] args) {

        Player kayla = new Player(false, "kayla");
        Player katie = new Player(false, "katie");
        Player joseph = new Player(true, "joseph");


        System.out.println("operation #1: Kayla shoots at Katie");
        kayla.shoot(katie);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #2: Kayla shoots at joseph");
        kayla.shoot(joseph);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #3: Kayla shoots at joseph");
        kayla.shoot(joseph);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #4: Kayla shoots at joseph");
        kayla.shoot(joseph);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #5: Kayla shoots at joseph");
        kayla.shoot(joseph);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #6: Kayla shoots at joseph");
        kayla.shoot(joseph);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #7: Kayla shoots at joseph");
        kayla.shoot(joseph);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #8: Kayla shoots at joseph");
        kayla.shoot(joseph);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #9: joseph takes cure");
        joseph.hospital();
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #10: kayla loads magazine");
        kayla.loadMagazine();
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #11: kayla loans money to joseph");
        kayla.moneyBusiness(joseph,500);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

        System.out.println("operation #12: : kayla loans money to katie");
        kayla.moneyBusiness(katie,100);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");

    }

}
