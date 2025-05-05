public class List {

    String models;
    static int numberOfCars;

    List(String models){
        this.models=models;
        numberOfCars++;
    }

    static void displayList(){
        System.out.println("There are "+numberOfCars+" cars to choose from!");
    }
}
