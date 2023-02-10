public class Person {

    private static int count = 0;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        ++count;

        System.out.printf("Person constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
