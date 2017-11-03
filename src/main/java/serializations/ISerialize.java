package serializations;

import info.*;

import java.util.List;

public interface ISerialize {
    void serialize(List<Person> persons);
    List<Person> deserialize();
}
