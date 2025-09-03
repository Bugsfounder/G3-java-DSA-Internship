public class Main {

    int age;


    static public class Shalini{
        String name;

        Shalini(String name){
            this.name = name;
        }
    }


    public static void main(String[] args) {

        Shalini s = new Shalini("Shalini");

        Main m = new Main();
        m.age = 32;
//        System.out.println(m.age);
//        m.Shalini m2 = new m.Shalini();

        Human shalini = new Human("Shalini", 12, "B+");
//        Human kastoori = new Human("kastoori", 12, "B+");
//        Human tanvi = new Human("tanvi", 12, "B+");
//
//        System.out.println(shalini.population);
//        System.out.println(kastoori.population);
//        System.out.println(tanvi.population);

        System.out.println(Human.population);


    }
}
