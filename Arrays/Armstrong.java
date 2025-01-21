import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        //Anagram
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        if(str1.length() == str2.length()) {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("It is anagram");
            } else {
                System.out.println("Not a anagram");
            }
        }
        else{
            System.out.println("Not a anagram");
        }

        //AgeRelation
        try {
            System.out.print("Enter the first date of birth (yyyy-MM-dd): ");
            String dob1String = sc.nextLine();
            Date dob1 = new SimpleDateFormat("yyyy-MM-dd").parse(dob1String);

            System.out.print("Enter the second date of birth (yyyy-MM-dd): ");
            String dob2String = sc.nextLine();
            Date dob2 = new SimpleDateFormat("yyyy-MM-dd").parse(dob2String);

            compareDates(dob1, dob2);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }
    }

    // Function to compare two dates of birth and display age relationship
    private static void compareDates(Date dob1, Date dob2) {
        if (dob1.before(dob2)) {
            System.out.println("Younger");
        } else if (dob1.after(dob2)) {
            System.out.println("Elder");
        } else {
            System.out.println("Same age");
        }
    }

    // Function to check if a number is Armstrong or not
    private static boolean isArmstrongNumber(int num) {
        int temp=num, rem, sum=0;
        while(num<0){
            rem = num%10;
            num = num/10;
            sum += rem;
        }
        return sum == temp;
    }
}