package serializations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import info.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Jackson implements ISerialize {

    private File file = new File("jackson.json");

    @Override
    public List<Person> serialize(List<Person> persons) {
        ObjectMapper obj = new ObjectMapper();
        obj.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            obj.writeValue(file,persons);
        } catch (IOException e) {
             e.printStackTrace();
             return null;
        }
        return persons;
    }

    @Override
    public List<Person> deserialize() {
        List<Person> dserPerson = null;
        ObjectMapper obj = new ObjectMapper();
        obj.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            dserPerson = obj.readValue(file, new TypeReference<List<Person>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dserPerson;
    }
}
