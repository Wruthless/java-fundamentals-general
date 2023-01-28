public class GradeBook {

    private String courseName;
    private final int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.grades = grades;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMin() {
        int lowGrade = grades[0][0];

        // loop through rows of grades array
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }

    public int getMax() {
        int highGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    public double getAvg(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }

        return (double) total / setOfGrades.length;
    }


    public void outputGrades() {
        System.out.printf("The grades and averages for three exams are:%n%n");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }

            // call method getAvg to calculate students avg grade
            // pass row of grades as the argument to getAvg
            double average = getAvg(grades[student]);
            System.out.printf("%9.2f%n", average);
        }

    }

    public void outputBarChart() {
        System.out.println("Overall grade distribution");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade in Grade book, increment the appropriate frequency
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }

        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {

            // output bar label (00-09, ... , 90-99, 100)
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void processGrades() {
        outputGrades();
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade: ", getMin(), "Highest grade: ", getMax());
    }

}
