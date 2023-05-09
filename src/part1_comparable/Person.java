package part1_comparable;

public class Person implements Comparable<Person> {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int compareTo(Person person) {
        if (birthYear == person.birthYear) {
            return 0;
        } else if (birthYear > person.birthYear) {
            return 1;
        } else {
            return -1;
        }
    }
}
