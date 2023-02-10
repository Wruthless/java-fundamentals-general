public class PackageDataTest {
    public static void main(String[] args) {

        PackageData packageData = new PackageData();

        System.out.printf("After instantiation:%n%s%n", packageData);

        // change package access data directly
        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("%nAfter changing values:%n%s%n", packageData);

    }
}

// class with package access instance variables, package access class
class PackageData {

    int number;    // package-access instance variable
    String string; // package-access instance variable

    public PackageData() {
        number = 0;
        string = "Hello";
    }

    @Override
    public String toString() {
        return "PackageData{" +
            "number=" + number +
            ", string='" + string + '\'' +
            '}';
    }
}
