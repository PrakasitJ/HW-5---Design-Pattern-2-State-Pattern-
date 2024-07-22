//6510450585 Prakasit Jaiharn
import Models.GumballMachine;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();
    }
}