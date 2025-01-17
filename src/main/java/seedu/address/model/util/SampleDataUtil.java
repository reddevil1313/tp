package seedu.address.model.util;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.ClassId;
import seedu.address.model.person.Grade;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.StudentId;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Allard Quek"), new StudentId("A0212425H"), new ClassId("B01"), new Grade("F")),
            new Person(new Name("Samay Sagar"), new StudentId("A0212425H"), new ClassId("B02"), new Grade("A")),
            new Person(new Name("Erwin Quek"), new StudentId("A0212425H"), new ClassId("B03"), new Grade("A")),
            new Person(new Name("David Li"), new StudentId("A0212425H"), new ClassId("B04"), new Grade("A")),
            new Person(new Name("Irfan Ibrahim"), new StudentId("A0212425H"), new ClassId("B05"), new Grade("A")),
            new Person(new Name("Roy Balakrishnan"), new StudentId("A0212425H"), new ClassId("B06"), new Grade("A"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Same method as getSampleAddressBook but with AddressBook object as its return type.
     * @return AddressBook filled with sample data
     */
    public static AddressBook fillSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

}
