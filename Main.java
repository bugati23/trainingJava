package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("First point:");
            System.out.println("Hello, world!");
            System.out.println("Second point:");
            System.out.println("Nikita Bukato, Prushinskikh 22-54, +375295555778");
            System.out.println("Third point:");
            System.out.print("Enter triangle legs: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Hypotenuse = " + DoSomething.hypotenuseСalculation(a, b));
            System.out.println("Area = " + DoSomething.areaСalculation(a, b));
            System.out.println("Fourth point");
            System.out.println("Enter array size: ");
            int[] array = DoSomething.fillArray(scanner.nextInt());
            DoSomething.printArray(array);
            System.out.println("Enter k: ");
            int k = scanner.nextInt();
            System.out.println("Sum of elements of multiples k: " + DoSomething.summaOfK(k,array));
            System.out.println("Fifth point:");
            System.out.println("Enter string: ");
            String string = scanner.next();
            System.out.println("1)length: " + string.length());
            System.out.println("2)toUpperCase: " + string.toUpperCase());
            System.out.println("3)concat: " + string.concat(scanner.next()));
            System.out.println("4)indexOf: " + string.indexOf(scanner.next()));
            System.out.println("Enter another string:");
            String anotherString = scanner.next();
            System.out.println("5)equals: " + string.equals(anotherString));
            System.out.println("Sixth point:");
            System.out.println("Enter array size: ");
            double[] sequence = DoSomething.fillSequence(scanner.nextInt());
            DoSomething.printSequence(sequence);
            System.out.println("Is increasing? " + DoSomething.isIncreasing(sequence));
        }
        catch (IllegalArgumentException | InputMismatchException exc){
            System.out.println(exc);
        }
    }
}
//javac -sourcepath ./src -d bin src/task/Main.java