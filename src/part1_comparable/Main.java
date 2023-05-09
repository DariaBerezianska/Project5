package part1_comparable;

public class Main {
    public static void main(String[] args) {
        Person masha = new Person("Masha", 2004);
        Person dasha = new Person("Dasha", 2005);
        Person mark = new Person("Mark", 2016);
        Person miia = new Person("Miia", 2016);
        System.out.println(dasha.compareTo(masha)); // dasha's birthYear > masha's birthYear
        System.out.println(dasha.compareTo(mark)); // dasha's birthYear < mark's birthYear
        System.out.println(miia.compareTo(mark)); // miia's birthYear = mark's birthYear
    }


}