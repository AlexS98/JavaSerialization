package info;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person pers = new Person();
    @Test
    public void getPersonAge() throws Exception {
        assertEquals(pers.getPersonAge(),0);
    }

    @Test
    public void setPersonAge() throws Exception {
        pers.setPersonAge(5);
        assertEquals(pers.getPersonAge(),5);
    }

    @Test
    public void getPersonName() throws Exception {
        assertEquals(pers.getPersonName(),"default");
    }

    @Test
    public void setPersonName() throws Exception {
        pers.setPersonName("_def");
        assertEquals(pers.getPersonName(),"_def");
    }

    @Test
    public void getPersonSurname() throws Exception {
        assertEquals(pers.getPersonSurname(),"default");
    }

    @Test
    public void setPersonSurname() throws Exception {
        pers.setPersonSurname("_def");
        assertEquals(pers.getPersonSurname(),"_def");
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