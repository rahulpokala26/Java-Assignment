import java.util.*;

class TestDetails{

    final int numberOfStudents = 25;
    final int numberOfTests = 7;

    // Array Created for storing marks of the students
    public int[][] studentMarks = new int[numberOfStudents][numberOfTests];

    // This method creates random marks and stores in the array
    public void storeMarks(){

        Random random = new Random();

        for (int row = 0; row < numberOfStudents; row++){
            for (int column = 0; column < numberOfTests; column++){
                // This creates random values for marks in each test
                boolean takingTest = random.nextBoolean();
                if (takingTest)
                    studentMarks[row][column] = random.nextInt(101);
                else
                    // Here -1 represents of student not attending the test
                    studentMarks[row][column] = -1;
            }
        }

    }
    // This method displays the array which was created by storeMarks method
    public void displayMarks(){

        for (int row = 0; row < numberOfStudents; row++){
            System.out.print("The marks of Student ( ID " + (row+1) + " )      ");
            for (int column = 0; column < numberOfTests; column++){
                System.out.print(studentMarks[row][column] + "      ");
            }
            System.out.println();
        }

    }

    // This method verifies the conditions for getting the students in notice period
    public void noticePeriod(){

        System.out.println("The Students in notice period are --> ");

        for (int row = 0; row < numberOfStudents; row++){
            int testCount = 0;
            int marksCount = 0;
            for (int column = 0; column < numberOfTests; column++){
                if (studentMarks[row][column] != -1)
                    testCount++;
                if (studentMarks[row][column] < 101 && studentMarks[row][column] >= 50)
                    marksCount++;
            }
            if (testCount < 3){
                System.out.println("Student with ID " + (row+1));
            }
            else if (marksCount < 3){
                System.out.println("Student with ID " + (row+1));
            }
        }

    }

}

public class Main{
    public static void main(String[] args) {

        System.out.println("Students (ID Numbers)            Test_1  Test_2  Test_3  Test_4  Test_5  Test_6  Test_7");
        System.out.println("====================================================================================================");

        TestDetails object_TestDetails = new TestDetails();
        object_TestDetails.storeMarks();
        object_TestDetails.displayMarks();

        System.out.println("====================================================================================================");

        object_TestDetails.noticePeriod();
    }
}
