package info;


public class Person {
    int personAge;
    String personName;
    String personSurname;
    Residence homeTown;
    Job personJob;

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public Residence getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(Residence homeTown) {
        this.homeTown = homeTown;
    }

    public Job getPersonJob() {
        return personJob;
    }

    public void setPersonJob(Job personJob) {
        this.personJob = personJob;
    }

    public Person() {
        setPersonAge(0);
        setPersonName("default");
        setPersonSurname("default");
        setHomeTown(new Residence());
        setPersonJob(new Job());
    }

    public Person(int age, String name, String surname, Residence home, Job job) {
        setPersonAge(age);
        setPersonName(name);
        setPersonSurname(surname);
        setHomeTown(home);
        setPersonJob(job);
    }

    @Override
    public String toString(){
        return " personAge: " + personAge + "; \n personName: " + personName +
                "; \n personSurname: " + personSurname + "; \n homeTown {" +
                homeTown.toString() + "\n } \n personJob {" + personJob.toString() + "\n }";
    }
}
