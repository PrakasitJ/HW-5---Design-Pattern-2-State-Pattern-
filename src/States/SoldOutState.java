public class SoldOutState implements State{
    GumballMachine gumballMachine;
    SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("There are no gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There are no gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("There are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("There are no gumballs");
    }

    @Override
    public void choose(String flavor) {
        System.out.println("Can't choose a new flavor now.");
    }
}