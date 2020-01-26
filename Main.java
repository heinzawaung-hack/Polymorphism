
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "Learn yourself";
    }

}
class Titanic extends Movie{
   public Titanic(){
       super("Titanic");
   }

   public String plot(){
       return "A love from a big ship";
   }
}

class EndGame extends Movie{
    public EndGame() {
        super("EndGame 2019");
    }

    @Override
    public String plot() {
        return "I don't give a Fuck, Watch yourself";
    }
}

class Thor extends Movie{
    public Thor() {
        super("God of Thunder");
    }

    @Override
    public String plot() {
        return "A movie of MCU";
    }
}

class theIrishMan extends Movie{
    public theIrishMan() {
        super("The Irishman");
    }

    @Override
    public String plot() {
        return "The American Mafia Movie";
    }
}

class ironMan3 extends Movie{
    public ironMan3() {
        super("Iron Man 3");
    }

    //No Plot Here.
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11 ; i++){
            Movie movie = randomMovie();
            System.out.println("The Movie is " + i +
                    ":" + movie.getName() + "\n" +
                    "Plot :  " + movie.plot() );
        }

    }

   public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
       System.out.println("Random number generated was" + randomNumber);
       switch (randomNumber){
           case 1:
           return new Titanic();

           case 2:
               return new EndGame();

           case 3:
               return new theIrishMan();

           case 4:
               return new ironMan3();
       }
       return null;
   }
}

