import info.CityTypes;
import info.Residence;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResidenceTest {
    Residence r = new Residence();
    @Test
    public void getNameOfCity() throws Exception {
        Assert.assertEquals(r.getNameOfCity(), "default");
    }

    @Test
    public void setNameOfCity() throws Exception {
        r.setNameOfCity("_def");
        Assert.assertEquals(r.getNameOfCity(), "_def");
    }

    @Test
    public void getType() throws Exception {
        Assert.assertEquals(r.getType(), CityTypes._default);
    }

    @Test
    public void setType() throws Exception {
        r.setType(CityTypes.town);
        Assert.assertEquals(r.getType(), CityTypes.town);
    }

    @Test
    public void getPopulation() throws Exception {
        Assert.assertEquals(r.getPopulation(), 0);
    }

    @Test
    public void setPopulation() throws Exception {
        r.setPopulation(10);
        Assert.assertEquals(r.getPopulation(), 10);
    }
}