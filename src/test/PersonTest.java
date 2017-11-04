import info.CityTypes;
import info.Job;
import info.Person;
import info.Residence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person pers = new Person();
    @Test
    public void getPersonAge() throws Exception {
        Assert.assertEquals(pers.getPersonAge(),0);
    }

    @Test
    public void setPersonAge() throws Exception {
        pers.setPersonAge(5);
        Assert.assertEquals(pers.getPersonAge(),5);
    }

    @Test
    public void getPersonName() throws Exception {
        Assert.assertEquals(pers.getPersonName(),"default");
    }

    @Test
    public void setPersonName() throws Exception {
        pers.setPersonName("_def");
        Assert.assertEquals(pers.getPersonName(),"_def");
    }

    @Test
    public void getPersonSurname() throws Exception {
        Assert.assertEquals(pers.getPersonSurname(),"default");
    }

    @Test
    public void setPersonSurname() throws Exception {
        pers.setPersonSurname("_def");
        Assert.assertEquals(pers.getPersonSurname(),"_def");
    }

    @Test
    public void getHomeTown() throws Exception {
        Assert.assertNotNull(pers.getHomeTown());
    }

    @Test
    public void setHomeTown() throws Exception {
        Residence r = new Residence("1", CityTypes._default,5000);
        pers.setHomeTown(r);
        Assert.assertSame(pers.getHomeTown(),r);
    }

    @Test
    public void getPersonJob() throws Exception {
        Assert.assertNotNull(pers.getPersonJob());
    }

    @Test
    public void setPersonJob() throws Exception {
        Job j = new Job("1", 5000);
        pers.setPersonJob(j);
        Assert.assertSame(pers.getPersonJob(),j);
    }
}