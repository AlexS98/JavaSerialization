package serializations;

import info.*;

import java.util.List;

public interface ISerialize {
    List<Person> serialize(List<Person> persons);
    List<Person> deserialize();
}
