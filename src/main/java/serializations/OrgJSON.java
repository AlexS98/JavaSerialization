package serializations;

import info.*;
import org.json.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrgJSON implements ISerialize {
    @Override
    public void serialize(List<Person> persons) {
        JSONObject person, home, work;
        JSONArray personsArray = new JSONArray();
        try (FileWriter writer = new FileWriter("OrgJSON.json"))
        {
            for(Person i : persons){
                person = new JSONObject();
                person.put("personAge", i.getPersonAge());
                person.put("personName", i.getPersonName());
                person.put("personSurname", i.getPersonSurname());
                home = new JSONObject();
                home.put("nameOfCity", i.getHomeTown().getNameOfCity());
                home.put("type",i.getHomeTown().getType());
                home.put("population",i.getHomeTown().getPopulation());
                person.put("homeTown",home);
                work = new JSONObject();
                work.put("companyName",i.getPersonJob().getCompanyName());
                work.put("salary", i.getPersonJob().getSalary());
                person.put("personJob", work);
                personsArray.put(person);
            }
            writer.write(personsArray.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> deserialize() {
        List<Person> dserPerson = new ArrayList<>();
        try {
            String data = new String(Files.readAllBytes(Paths.get("OrgJSON.json")));
            String substr = "personName";
            Pattern p = Pattern.compile(substr);
            Matcher m = p.matcher(data);
            int counter = 0;
            while(m.find()){
                counter++;
            }
            System.out.println("count: "+ counter);
            JSONArray array = new JSONArray(data);
            array.getJSONObject(counter - 1);
            for(int i = 0; i < counter; i++){
                int personAge = (array.optJSONObject(i)).getInt("personAge");
                String personName = (array.optJSONObject(i)).getString("personName");
                String personSurname = (array.optJSONObject(i)).getString("personSurname");
                JSONObject home = (array.optJSONObject(i)).getJSONObject("homeTown");
                String nameOfCity = home.getString("nameOfCity");
                String type = home.getString("type");
                long population = home.getLong("population");
                JSONObject work = (array.optJSONObject(i)).getJSONObject("personJob");
                String companyName = work.getString("companyName");
                int salary = work.getInt("salary");
                Residence homeTown = new Residence(nameOfCity, CityTypes.valueOf(type),population);
                Job personJob = new Job(companyName, salary);
                Person person = new Person(personAge, personName, personSurname, homeTown, personJob);
                dserPerson.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dserPerson;
    }
}
