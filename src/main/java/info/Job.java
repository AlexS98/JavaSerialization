package info;


public class Job {
    String companyName;
    int salary;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public Job(){
        companyName = "default";
        salary = 0;
    }

    public Job(String name, int salary){
        companyName = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "\n    companyName: " + companyName + "\n    salary: " + salary;
    }
}
