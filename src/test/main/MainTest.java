package project_tests;

import info.*;
import org.junit.Assert;
import org.junit.Test;
import serializations.*;
import java.util.Arrays;
import java.util.List;

import static main.Main.takeMetrics;

public class MainTest {
    private ISerialize iserial = new GSON();
    private Person myPerson1 = new Person(25, "Ivan", "Ivanov", new Residence("Kyiv", CityTypes.city, 2500000), new Job("Infopulse", 25000));
    private Person myPerson2 = new Person(21, "Vasia", "Vasiliev", new Residence("Znamianka", CityTypes.town, 25000), new Job("Geoid", 10000));
    private Person myPerson3 = new Person();
    private List<Person> persons = Arrays.asList(myPerson1,myPerson2,myPerson3);
    @Test
    public void take() throws Exception {
        Assert.assertNotNull(takeMetrics(iserial,persons));
    }
}