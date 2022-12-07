
public class Print {


     public void printMainMenu() {
        System.out.println("""
                Choose one of the following options:
                1. See parked trucks
                2. Register a new truck
                3. Exit the program
                """);
    }

       public void askUserForInput() {
        System.out.print("Input: ");

    }


      public void printTypeOfTruck() {
        System.out.println("""
                Choose your type of truck:
                1. Van
                2. Small truck
                3. Heavy truck
                """);
    }

     public void printWeight() {
        System.out.println("Write truck's weight: ");
    }

     public void printWeAreFull() {
        System.out.println("Sorry, we are full. Try Station Dump More.");
    }

     public void printNoBerths() {
        System.out.println("No available berths");
    }

     public void printShuttingDown() {
        System.out.println("Shutting down");
        System.out.println("Have a nice day!");
    }

}
