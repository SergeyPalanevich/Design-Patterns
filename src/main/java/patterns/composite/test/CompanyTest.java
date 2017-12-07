package patterns.composite.test;

import patterns.composite.Supervisor;
import patterns.composite.Worker;
import org.testng.annotations.Test;

public class CompanyTest {

    @Test
    public void testHappinesLevel(){
        Worker tom = new Worker("tom", 5);
        Worker jimmy = new Worker("jimmy", 6);

        Supervisor marry = new Supervisor("marry", 7);
        Supervisor jerry = new Supervisor("jerry", 8);

        Supervisor bob = new Supervisor("bob", 10);

        marry.addSubordinates(tom);
        jerry.addSubordinates(jimmy);
        bob.addSubordinates(marry);
        bob.addSubordinates(jerry);
        bob.showHappiness();
    }
}
