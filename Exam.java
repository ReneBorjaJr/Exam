package playground;

import java.util.Random;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        //Question 1
        String oddNumbers = printOddNumbers();
        System.out.println("Question 1: odd numbers from 10 to 1: " + oddNumbers);

        //Question 2
        int[] questionTwo = {10, 20, 30, 45, 76, 69};
        int sum = sum(questionTwo);
        System.out.println("Question 2: The sum of these numbers is " + sum);

        //Question 3
        int[] questionThree = {10, 20, 30, 45, 76, 69};
        double average = getAverage(questionThree);
        System.out.println("Question 3: The average of these numbers is " + average);

        //Question 4
        int result = generateRandomNumber();
        System.out.println("Question 4: Your random number is " + result);

        //Question 5
        int[] questionFive = {10, 20, 30, 45, 76, 69};
        int evenNumbers = sumOfEvenNumbers(questionFive);
        System.out.println("Question 5: The sum of the even numbers in this array is " + evenNumbers);

        //Question 6
        double sideLength = 10;
        double volume = calculateVolume(sideLength);
        System.out.println("Question 6: The volume of the cube is " + volume);

        //Question 7
        String questionSeven = "Hello, my name is Rene.";
        char characterToFind = 'e';
        int total = characterAppears(questionSeven, characterToFind);
        System.out.println("Question 7: The character '" + characterToFind + "' Appears " + total + " times.");

        //Question 8
        String questionEight = "RaceCar";
        boolean answer = isPalindrome(questionEight);
        System.out.println("Question 8: Is '" + questionEight + "' a palindrome? " + answer);

        //Question 9
        int year = 2023;
        boolean questionNine = isLeapYear(year);
        System.out.println("Question 9: is " + year + " a leap year? " + questionNine);

        //Question 10
        String resultMessage = processTicket();
        System.out.println(resultMessage);


    }

    //Question 1
    public static String printOddNumbers() {
        StringBuilder oddNumbers = new StringBuilder();
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
                oddNumbers.append(i);
                if (i > 1) {
                    oddNumbers.append(", ");
                }
            }
        }
        return oddNumbers.toString();
    }

    //Question 2
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    //Question 3
    public static double getAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Question 4
    public static int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }
     //Question 5
    public static int sumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 ==0) {
                sum += num;
            }
        }
        return sum;
    }

    //Question 6
    public static double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }

    //Question 7
    public static int characterAppears(String text, char character){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(character)) {
                count ++;
            }
        }
        return count;
    }

    //Question 8
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    //Question 9
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //Question 10
    public static String processTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question 10:");
        System.out.println("Enter your ticket number:");
        int ticketNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your destinatiion:");
        String destination = scanner.nextLine();

        String message = "Now serving customer number " + ticketNumber + ". Enjoy your trip to " + destination + ".";

        return message;
    }

}




