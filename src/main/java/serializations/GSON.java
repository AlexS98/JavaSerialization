package serializations;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import info.*;

import java.io.*;
import java.util.List;

public class GSON implements ISerialize {

    @Override
    public void serialize(List<Person> persons) {
        try {
            FileWriter writer = new FileWriter("GoogleGSON.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(persons));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> deserialize() {
        List<Person> dserPerson = null;
        try {
            FileReader read = new FileReader("GoogleGSON.json");
            Gson gson = new Gson();
            dserPerson = gson.fromJson(read, new TypeToken<List<Person>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dserPerson;
    }
}
