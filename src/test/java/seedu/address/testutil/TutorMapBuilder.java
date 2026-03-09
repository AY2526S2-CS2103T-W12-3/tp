package seedu.address.testutil;

import seedu.address.model.TutorMap;
import seedu.address.model.person.Person;

/**
 * A utility class to help with building TutorMap objects.
 * Example usage: <br>
 *     {@code TutorMap ab = new TutorMapBuilder().withPerson("John", "Doe").build();}
 */
public class TutorMapBuilder {

    private TutorMap tutorMap;

    public TutorMapBuilder() {
        tutorMap = new TutorMap();
    }

    public TutorMapBuilder(TutorMap tutorMap) {
        this.tutorMap = tutorMap;
    }

    /**
     * Adds a new {@code Person} to the {@code TutorMap} that we are building.
     */
    public TutorMapBuilder withPerson(Person person) {
        tutorMap.addPerson(person);
        return this;
    }

    public TutorMap build() {
        return tutorMap;
    }
}
