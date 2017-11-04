package info;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JobTest {
    private Job j = new Job();

    @Test
    public void getCompanyName() throws Exception {
        assertEquals(j.getCompanyName(), "default");
    }

    @Test
    public void setCompanyName() throws Exception {
        j.setCompanyName("_def");
        assertEquals(j.getCompanyName(), "_def");
    }

    @Test
    public void getSalary() throws Exception {
        assertEquals(j.getSalary(), 0);
    }

    @Test
    public void setSalary() throws Exception {
        j.setSalary(10);
        assertEquals(j.getSalary(), 10);
    }
}