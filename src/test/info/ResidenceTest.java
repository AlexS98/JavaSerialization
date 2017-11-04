package info;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResidenceTest {
    private Residence r = new Residence();
    @Test
    public void getNameOfCity() throws Exception {
        assertEquals(r.getNameOfCity(), "default");
    }

    @Test
    public void setNameOfCity() throws Exception {
        r.setNameOfCity("_def");
        assertEquals(r.getNameOfCity(), "_def");
    }

    @Test
    public void getType() throws Exception {
        assertEquals(r.getType(), CityTypes._default);
    }

    @Test
    public void setType() throws Exception {
        r.setType(CityTypes.town);
        assertEquals(r.getType(), CityTypes.town);
    }

    @Test
    public void getPopulation() throws Exception {
        assertEquals(r.getPopulation(), 0);
    }

    @Test
    public void setPopulation() throws Exception {
        r.setPopulation(10);
        assertEquals(r.getPopulation(), 10);
    }
}