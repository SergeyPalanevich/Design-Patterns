package patterns.factorystaticmethod.test;

import patterns.factorystaticmethod.StaticFactory;
import patterns.factorystaticmethod.User;
import org.testng.annotations.Test;

public class StaticFactoryTest {
    @Test
    public void testUser(){
        User sergey = StaticFactory.createDefaultUser().withFirstName("Override");
        User ivan = StaticFactory.createFromBirthday(1950);
        System.out.println(sergey.toString());
        System.out.println(ivan.toString());
    }
}
