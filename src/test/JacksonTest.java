import info.*;
import org.junit.Assert;
import org.junit.Test;
import serializations.ISerialize;
import serializations.Jackson;

import java.util.Arrays;
import java.util.List;

public class JacksonTest {
    ISerialize iserial = new Jackson();
    Person myPerson1 = new Person(25, "Ivan", "Ivanov", new Residence("Kyiv", CityTypes.city, 2500000), new Job("Infopulse", 25000));
    Person myPerson2 = new Person(21, "Vasia", "Vasiliev", new Residence("Znamianka", CityTypes.town, 25000), new Job("Geoid", 10000));
    Person myPerson3 = new Person();
    List<Person> persons = Arrays.asList(myPerson1,myPerson2,myPerson3);
    @Test
    public void serializeTest() throws Exception {
        Assert.assertNotNull(iserial.serialize(persons));
    }

    @Test
    public void deserializeTest() throws Exception {
        Assert.assertNotNull(iserial.deserialize());
    }

}