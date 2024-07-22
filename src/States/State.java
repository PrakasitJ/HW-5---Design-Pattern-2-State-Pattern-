//6510450585 Prakasit Jaiharn
package States;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void choose(String flavor);
}