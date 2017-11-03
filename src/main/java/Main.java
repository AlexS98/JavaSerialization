import info.*;
import serializations.*;
import java.util.Arrays;
import java.util.List;


public class Main {
    static long startTime = 0, endTime = 0, startMemory = 0, endMemory = 0, nanoTime = 0, bytesMemory = 0;
    static double secondsTime = 0.0, megaBytesMemory = 0.0;

    public static void main(String[] args) {
        Person myPerson1 = new Person(25, "Ivan", "Ivanov", new Residence("Kyiv", CityTypes.city, 2500000), new Job("Infopulse", 25000));
        Person myPerson2 = new Person(21, "Vasia", "Vasiliev", new Residence("Znamianka", CityTypes.town, 25000), new Job("Geoid", 10000));
        Person myPerson3 = new Person();
        List<Person> persons = Arrays.asList(myPerson1,myPerson2,myPerson3);

        System.out.println(takeMetrics(new Jackson(), persons));
        System.out.println(takeMetrics(new GSON(), persons));
        System.out.println(takeMetrics(new OrgJSON(), persons));
    }

    static String takeMetrics(ISerialize iserial, List<Person> list){
        String metric = "";
        startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        iserial.serialize(list);
        endTime = System.nanoTime();
        nanoTime = endTime - startTime;
        secondsTime = nanoTime * 1000000000.0;
        endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        bytesMemory = endMemory - startMemory;
        megaBytesMemory = bytesMemory / (1024.0 * 1024.0);
        metric += "Serialize " + iserial.getClass().getName().substring(15) + " using "
                  + secondsTime + " seconds & " + megaBytesMemory + " MBytes of memory";
        startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.nanoTime();
        iserial.deserialize();
        endTime = System.nanoTime();
        nanoTime = endTime - startTime;
        secondsTime = nanoTime * 1000000000;
        endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        bytesMemory = endMemory - startMemory;
        megaBytesMemory = bytesMemory / (1024.0 * 1024.0);
        return  metric + "\nDeserialize " + iserial.getClass().getName().substring(15) +
                " using " + secondsTime + " seconds & " + megaBytesMemory + " MBytes of memory";
    }
}
