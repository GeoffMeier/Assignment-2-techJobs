package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }
    public Job(String name,Employer employer,Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer = employer;
        this.location=location;
        this.positionType= positionType;
        this.coreCompetency=coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return  name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
public boolean equals(Object j){
        if(j.getClass() != getClass()){
            return false;
        }
        Job job = (Job) j;
        return job.getId() == getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



    @Override
    public String toString(){
//        if (getEmployer().toString() == "" && getCoreCompetency().toString() == "" && getName().toString() == "" && getPositionType().toString() == "" && getLocation().toString() == ""){
//            return  "OOPS! This job does not seem to exist.";
//
//        }

        if (getName()== null) {
            this.name = "Data not available";
        }if (getName() == ""){
            this.name += "Data not available";

        }
        if (getEmployer()== null) {
            this.employer = new Employer("Data not available");


        }if(getEmployer().toString() == ""){
            this.employer.setValue("Data not available");
        }
        if(getLocation()==null) {
            this.location = new Location("Data not available");
        }
        if (getLocation().toString() == ""){
            this.location.setValue("Data not available");

        }
        if(getPositionType()==null) {
            this.positionType = new PositionType("Data not available");
        }
        if (getPositionType().toString() == ""){
            this.positionType.setValue("Data not available");

        }
        if(getCoreCompetency()==null) {
            this.coreCompetency = new CoreCompetency ("Data not available");
        }
        if (getCoreCompetency().toString() == ""){
            this.coreCompetency.setValue("Data not available");

        }
   return     "\n" + "ID: "+  + getId() +  "\n" +
                "Name: "  + getName()  + "\n" +
                "Employer: " + getEmployer() + "\n" +
                "Location: " +  getLocation()+  "\n" +
                "Position Type: " + getPositionType()  + "\n" +
                "Core Competency: " + getCoreCompetency() + "\n";



    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
