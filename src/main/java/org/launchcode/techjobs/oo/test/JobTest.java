package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.Objects;

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
        Job j2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String str = j.getName();
        String str1 =j2.getName();

        assertTrue(j.getName().contains("Product tester"));
        assertTrue(j.getEmployer().getValue().equals("ACME"));
        assertTrue(j.getLocation().getValue().equals("Desert"));
        assertTrue(j.getPositionType().getValue().equals("Quality control"));
        assertTrue(j.getCoreCompetency().getValue().equals("Persistence"));
        assertEquals(str,str1);
        assertEquals(j.getEmployer().toString(), j2.getEmployer().toString());
        assertEquals(j.getLocation().toString(), j2.getLocation().toString());
        assertEquals(j.getPositionType().toString(), j2.getPositionType().toString());
        assertEquals(j.getCoreCompetency().toString(), j2.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Tom Brady", new Employer("Fox Sports"), new Location("Broadcasting Booth"), new PositionType("Broadcaster"), new CoreCompetency("BroadCasting"));
        Job job2 = new Job("Tom Brady", new Employer("Fox Sports"), new Location("Broadcasting Booth"), new PositionType("Broadcaster"), new CoreCompetency("BroadCasting"));
        assertFalse(job2.equals(job1));
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
    Job job = new Job("Tom Brady", new Employer("Fox Sports"), new Location("Broadcasting Booth"), new PositionType("Broadcaster"), new CoreCompetency("BroadCasting"));
        Job job2 = new Job("Tom Brady", new Employer("Fox Sports"), new Location("Broadcasting Booth"), new PositionType("Broadcaster"), new CoreCompetency("BroadCasting"));

        assertEquals('\n', job.toString().charAt(0));
        assertEquals('\n', job.toString().charAt(job.toString().length()-1));
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("", new Employer(""), new Location("Broadcasting Booth"), new PositionType("Broadcaster"), new CoreCompetency("BroadCasting"));
        String str = job.toString();
        assertEquals(job.getEmployer().getValue(),"Data not available");

//        assertEquals(employer.toString().equals(job.toString()));

    } @Test
    public void testToStringContainsCorrectLabelsAndData(){
Job job = new Job();
String[] str  = job.toString().replaceFirst("\n", "").split("\n");
String[] testValues =  {"ID: ",  "Name: " ,"Employer: ", "Location: " ,"Position Type: " ,"Core Competency: " };

       assertEquals(testValues[0] + "1", str[0]);

for (int i=1; i <testValues.length; i++){
    assertEquals(testValues[i] + "Data not available",str[i]);
}
//assertEquals();
    }

}
