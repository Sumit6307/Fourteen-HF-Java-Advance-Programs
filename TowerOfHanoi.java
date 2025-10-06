// TowerOfHanoi.java
// A Java program to solve the Tower of Hanoi problem using recursion

import java.util.Scanner;

public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi
    static void solveTowerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        // Move top n-1 disks from source to auxiliary
        solveTowerOfHanoi(n - 1, fromRod, auxRod, toRod);

        // Move remaining disk from source to destination
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Move n-1 disks from auxiliary to destination
        solveTowerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        System.out.println("\nSteps to solve Tower of Hanoi with " + n + " disks:\n");
        solveTowerOfHanoi(n, 'A', 'C', 'B'); // A: source, C: destination, B: auxiliary

        sc.close();
    }
}
