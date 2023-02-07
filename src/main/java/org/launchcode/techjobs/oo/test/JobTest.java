package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job j = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(j.getName().contains("Product tester"));
        assertTrue(j.getEmployer().getValue().equals("ACME"));
        assertTrue(j.getLocation().getValue().equals("Desert"));
        assertTrue(j.getPositionType().getValue().equals("Quality control"));
        assertTrue(j.getCoreCompetency().getValue().equals("Persistence"));
    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Tom Brady",new Employer("Fox Sports"), new Location("Broadcasting Booth"),new PositionType("Broadcaster"), new CoreCompetency("BroadCasting"));
        Job job2 = new Job("Tom Brady",new Employer("Fox Sports"), new Location("Broadcasting Booth"),new PositionType("Broadcaster"), new CoreCompetency("BroadCasting"));
        assertFalse(job2.equals(job1));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){

    }
}
