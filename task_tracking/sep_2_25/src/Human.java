public class Human {

    String name;
    int age;
    String bGroup;
    static int population = 10 ;

    Human(String name, int age, String bGroup){
        this.name = name;
        this.age = age;
        this.bGroup = bGroup;
        Human.population +=1;

//        this.population += 1;
    }

//
//    static int getPopulation(){
//        return Human.population;
//    }
}
