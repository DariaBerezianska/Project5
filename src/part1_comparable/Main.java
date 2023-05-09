import part1_comparable.Person;

public class Main {
    public static void main(String[] args) {
        Person masha = new Person("Masha", 2004);
        Person dasha = new Person("Dasha", 2005);
        Person mark = new Person("Mark", 2016);
        Person miia = new Person("Miia", 2016);
        System.out.println(dasha.compareTo(masha));
        System.out.println(dasha.compareTo(mark));
        System.out.println(miia.compareTo(mark));
    }


}