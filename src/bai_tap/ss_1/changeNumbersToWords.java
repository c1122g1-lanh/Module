import java.util.Scanner;

public class changeNumbersToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so :");
        int number = scanner.nextInt();
        String changeNumbersToWords = null;
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    changeNumbersToWords = "Zero";
                    break;
                case 1:
                    changeNumbersToWords = "One";
                    break;
                case 2:
                    changeNumbersToWords = "Two";
                    break;
                case 3:
                    changeNumbersToWords = "Three";
                    break;
                case 4:
                    changeNumbersToWords = "Four";
                    break;
                case 5:
                    changeNumbersToWords = "Five";
                    break;
                case 6:
                    changeNumbersToWords = "Six";
                    break;
                case 7:
                    changeNumbersToWords = "Seven";
                    break;
                case 8:
                    changeNumbersToWords = "Eight";
                    break;
                case 9:
                    changeNumbersToWords = "Nine";
                    break;
            }
            System.out.println(changeNumbersToWords);
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Elevent");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteem");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            int a = number / 10;
            int b = number % 10;
            switch (a) {
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirty");
                    break;
                case 4:
                    System.out.println("Fourty");
                    break;
                case 5:
                    System.out.println("Fifty");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }
            switch (b) {
                case 1:
                    System.out.println("One ");
                    break;
                case 2:
                    System.out.println("Two ");
                    break;
                case 3:
                    System.out.println("Three ");
                    break;
                case 4:
                    System.out.println("Four ");
                    break;
                case 5:
                    System.out.println("Five ");
                    break;
                case 6:
                    System.out.println("Six ");
                    break;
                case 7:
                    System.out.println("Seven ");
                    break;
                case 8:
                    System.out.println("Eight ");
                    break;
                case 9:
                    System.out.println("Nine ");
                    break;
            }
        } else if (number >= 100 && number <= 999) {
            int a = number / 100;
            int b = number % 100;
            int d = b / 10;
            int c = b % 10;
            switch (a) {
                case 1:
                    System.out.print("One hundred ");
                    break;
                case 2:
                    System.out.print("Two hundred ");
                    break;
                case 3:
                    System.out.print("Three hundred ");
                    break;
                case 4:
                    System.out.print("Four hundred ");
                    break;
                case 5:
                    System.out.print("Five hundred ");
                    break;
                case 6:
                    System.out.print("Six hundred ");
                    break;
                case 7:
                    System.out.print("Seven hundred ");
                    break;
                case 8:
                    System.out.print("Eight hundred ");
                    break;
                case 9:
                    System.out.print("Nine hundred ");
                    break;
            }
            switch (b) {
                case 0:
                    System.out.print("");
                    break;
                case 11:
                    System.out.print("Elevent ");
                    break;
                case 12:
                    System.out.print("Twelve ");
                    break;
                case 13:
                    System.out.print("Thirteen ");
                    break;
                case 14:
                    System.out.print("Fourteen ");
                    break;
                case 15:
                    System.out.print("Fifteen ");
                    break;
                case 16:
                    System.out.print("Sixteen ");
                    break;
                case 17:
                    System.out.print("Seventeen ");
                    break;
                case 18:
                    System.out.print("Eighteen ");
                    break;
                case 19:
                    System.out.print("Nineteen ");
                    break;
            }
            if (b >= 20) {
                switch (d) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Fourty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
            }
            if (b < 10 || b > 20)
                switch (c) {
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
        }
    }
}
