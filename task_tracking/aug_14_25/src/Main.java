
class Game{
    Game(){
        System.out.println("Game launched...");
    }

    @Override
    protected void finalize(){ // deprecated
        System.out.println("Exiting game");
    }
}
public class Main {

    public static void main(String[] args) {

        Game game = new Game()  ;
        game = null;
        System.gc();

        try{
            System.out.println(10/0);
        }catch (Exception err){
            System.out.println(err);
        }
    }
}
