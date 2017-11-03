package info;


public class Residence{
    String nameOfCity;
    CityTypes type;
    long population;

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public CityTypes getType() {
        return type;
    }

    public void setType(CityTypes type) {
        this.type = type;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Residence(){
        nameOfCity = "default";
        type = CityTypes._default;
        population = 0;
    }

    public Residence(String name, CityTypes type, long population){
        nameOfCity = name;
        this.type = type;
        this.population = population;
    }

    @Override
    public String toString(){
        return "\n    nameOfCity: " + nameOfCity + "\n    type: " + type + "\n    population: " + population;
    }
}
