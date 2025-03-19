import com.example.demo.model.Person;

public class PersonFactory {
    public static Person createDefaultPerson() {
        Person person = new Person();
        person.setName("Default Name");
        person.setAge(30);
        person.setAddress("Default Address");
        return person;
    }
}

