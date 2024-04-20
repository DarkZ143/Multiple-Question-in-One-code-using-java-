//Coded by DarkZ143
import java.util.Scanner;
// class including prime function...
class Prime{
    protected int number;
    protected int temp;
    protected int i;
    public void prime()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close();
         boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
//class including reverse function..
class Reverse extends Prime{
    protected int rev;
    public void reverse(){
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close();
        rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number : " + rev);
    }
    
}
//class including Palindrome function..
class Palindrome extends Reverse{
    public void pdrome()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close();
        int originalNumber = number;
        rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }

        if (originalNumber == rev)
            System.out.println(originalNumber + " is a palindrome.");
        else
            System.out.println(originalNumber + " is not a palindrome.");
    }
}
//class including perfect function
class Perfect extends Palindrome{
    public void perfect()
    {
          Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close();
        int sum = 1; 
        for (i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number && number != 1) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
//class including fibonacci function..
class Fibonacci extends Perfect{
    public void fibonacci()
    {
          Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close();
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci series up to " + number + " terms :");
        for (i = 1; i <= number; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
//class including factorial function..
class Factorial extends Fibonacci{
    public void factorial()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close();
        long fact = 1;

        for (i = 1; i <= number; ++i) {
            fact *= i;
        }

        System.out.println("Factorial of " + number + " is : " + fact);
    }
}
//class including armstrong function..
class Armstrong extends Factorial{
    public void armstrong()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close(); 
        int originalNumber = number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
//class including evenodd function..
class EvenOdd extends Armstrong{
    public void eo()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = myobj.nextInt();
        myobj.close(); 
        if (number%2==0){
            System.out.println(number + " is a even number.");
        }
        else 
        {
            System.out.println(number + " is a odd number.");
        }
    }
}
//here is the main function..
public class Main{
    public static void main(String[] args)
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Prime Number = 1");
        System.out.println("Reverse Number = 2");
        System.out.println("Palindrome Number = 3");
        System.out.println("Perfect Number = 4");
        System.out.println("Fibonacci Number = 5");
        System.out.println("Factorial Number = 6");
        System.out.println("Armstrong Number = 7");
        System.out.println("Even or Odd Number = 8");
        System.out.print("Enter Choice to perform action : ");
        int choice = myobj.nextInt();
        myobj.close();
        EvenOdd obj = new EvenOdd(); 
        if (choice==1)
        {
            obj.prime();
        }
        else if (choice==2)
        {
            obj.reverse();
        }
        else if (choice==3)
        {
            obj.pdrome();
        }
        else if (choice==4)
        {
            obj.perfect();
        }
        else if (choice==5)
        {
            obj.fibonacci();
        }
        else if (choice==6)
        {
            obj.factorial();
        }
        else if (choice==7)
        {
            obj.armstrong();
        }
        else if (choice==8)
        {
            obj.eo();
        }
        else{
            System.out.println("Invalid input !");
        }

    }
}
