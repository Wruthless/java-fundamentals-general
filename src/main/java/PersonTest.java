public class PersonTest {

    public static void main(String[] args) {

        System.out.printf("Persons before instantiation: %d%n", Person.getCount());

        Person p1 = new Person("Susan", "Baker");
        Person p2 = new Person("Bob", "Blue");

        System.out.printf("%nPersons after instantiation: %n");
        System.out.printf("e1: %d%n", p1.getCount());
        System.out.printf("e2: %d%n", p2.getCount());
        System.out.printf("Person: %d%n", Person.getCount());

        System.out.printf("%n%s", p1.getFirstName());
        System.out.printf("%n%s", p2.getFirstName());
    }
}
