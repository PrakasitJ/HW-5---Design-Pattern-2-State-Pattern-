//6510450585 Prakasit Jaiharn
package States;

import Models.GumballMachine;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = (int) Math.floor(Math.random()*10);
        if ((winner == 7) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else {
            System.out.println("A " + gumballMachine.getFlavor() + " gumball comes rolling out the slot");
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void choose(String flavor) {
        gumballMachine.setFlavor(flavor);
        System.out.println("You have chosen the flavor " + flavor);
    }
}