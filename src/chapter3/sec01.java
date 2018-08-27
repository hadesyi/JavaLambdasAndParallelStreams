package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class sec01 {
    private List<Person> getPersonsLessThan20Years(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() < 20) {
                result.add(person);
            }
        }
        return result;
    }

    private List<Person> getPersonsByAgeRange(List<Person> persons, int from, int to) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= from && person.getAge() <= to) {
                result.add(person);
            }
        }
        return result;
    }

    /*private List<Person> getPersonsByDiverseCriteria(List<Person> persons, int ageFrom, int ageTo, Person.Gender gender, boolean isCustomer, boolean isVendor) {

    }*/

    public interface Condition<T> {
        boolean test(T t);
    }

    private List<Person> getPersonsByCondition(List<Person> persons, Condition<Person> condition) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (condition.test(person)) {
                result.add(person);
            }
        }
        return result;
    }


}
