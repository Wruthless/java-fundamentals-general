public class InitArrayCli {

    public static void main(String[] args) {

        // check number of command-line arguments
        if (args.length != 3){
            System.out.printf("Error: please re-enter entire command, including %n" +
                "an array size, initial value and increment.%n");
        } else {
            // get array size from first command-line argument
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // get initial value and increment from command-line arguments
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calculate value for each array element
            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue + increment * i;
            }

            System.out.printf("%s%8s%n", "Index", "Value");

            for (int i = 0; i < array.length; i++) {
                System.out.printf("%5d%8d%n", i, array[i]);
            }

        }
    }
}
