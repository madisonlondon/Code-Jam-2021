// Round 1A Append Sort Problem
import java.util.*;  // Import the Scanner class
import java.io.*;

class AppendSort {
    static void appendSort(String fileName) throws FileNotFoundException {
        File inputFile = new File(fileName);
        Scanner sc = new Scanner(inputFile);
        while(sc.hasNext()) {
            int numTests = Integer.parseInt(sc.next());  
            for(int i = 0; i < numTests; i++) {
                // Iterate through each test
                int numOperations = 0; 
                int numIntegers = Integer.parseInt(sc.next());
                String[] testData = new String[numIntegers];
                for(int j = 0; j < testData.length; j++) { // Read second line of test case into an array of integers
                    testData[j] = sc.next();
                }
                // System.out.println("Test Data: " + Arrays.toString(testData));
                for(int k = 0; k < testData.length; k++) {
                    if(k != testData.length - 1) {
                        if(Integer.parseInt(testData[k]) >= Integer.parseInt(testData[k + 1])) {
                            // System.out.println(Integer.parseInt(testData[k]) + " > " + Integer.parseInt(testData[k + 1]));
                            if(Integer.parseInt(testData[k]) == Integer.parseInt(testData[k + 1])) {
                                testData[k + 1] = testData[k + 1] + "0";
                                // System.out.println("Current index after: " + testData[k + 1]);

                                numOperations += 1;
                            }
                            else if(Integer.parseInt(String.valueOf(testData[k].charAt(0))) == Integer.parseInt(String.valueOf(testData[k + 1].charAt(0)))) {
                                // System.out.println(String.valueOf(testData[k].charAt(0)) + ">" + Integer.parseInt(String.valueOf(testData[k + 1].charAt(0))));
                                // System.out.println("Current index before: " + testData[k + 1]);
                                for(int l = 0; l < testData[k].length(); l++) {
                                    testData[k + 1] = testData[k + 1] + "0";
                                }
                                // System.out.println("Current index after: " + testData[k + 1]);

                                numOperations += testData[k].length();
                            }
                            else {
                                // System.out.println(String.valueOf(testData[k].charAt(0)) + "<=" + Integer.parseInt(String.valueOf(testData[k + 1].charAt(0))));
                                // System.out.println("Current index before: " + testData[k + 1]);
                                for(int l = 0; l < testData[k].length() - 1; l++) {
                                    testData[k + 1] = testData[k + 1] + "0";
                                }
                                // System.out.println("Current index after: " + testData[k + 1]);
                                numOperations += testData[k].length() - 1;
                            }
                        }
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + numOperations);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        // Test appendSort()
        if(args.length > 0) {
            appendSort(args[0]);
        }
    }
}