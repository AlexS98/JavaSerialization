package info;

import info.Job;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    private Job j = new Job();

    @Test
    public void getCompanyName() throws Exception {
        Assert.assertEquals(j.getCompanyName(), "default");
    }

    @Test
    public void setCompanyName() throws Exception {
        j.setCompanyName("_def");
        Assert.assertEquals(j.getCompanyName(), "_def");
    }

    @Test
    public void getSalary() throws Exception {
        Assert.assertEquals(j.getSalary(), 0);
    }

    @Test
    public void setSalary() throws Exception {
        j.setSalary(10);
        Assert.assertEquals(j.getSalary(), 10);
    }
}