// Round 1A Prime Time Problem
import java.util.*;  // Import the Scanner class
import java.io.*;

public class PrimeTime {
    static void appendSort(String fileName) throws FileNotFoundException {
        File inputFile = new File(fileName);
        Scanner sc = new Scanner(inputFile);
        while(sc.hasNext()) {
            int numTests = Integer.parseInt(sc.next()); 
            System.out.println("Number of tests: " + numTests);
            for(int i = 0; i < numTests; i++) {
                int numPrimes = Integer.parseInt(sc.next());
                System.out.println("Number of primes: " + numPrimes);
                List <Integer> testData = new ArrayList<Integer>(); 
                for(int j = 0; j < numPrimes; j++) {
                    int currentPrime = Integer.parseInt(sc.next());
                    int currentPrimeCount = Integer.parseInt(sc.next());
                    for(int k = 0; k < currentPrimeCount; k++) {
                        testData.add(currentPrime);
                    }
                }
                if(testData.size() == 2) {
                    System.out.println("Case #" + (i + 1) + ": " + testData.get(0));
                }
                else if(testData.size() > 2) {
                }
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


