//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
class MyClass{
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter number A: ");
        a = myScanner.nextInt();
        System.out.println("Enter number B: ");
        b = myScanner.nextInt();
        System.out.println("Enter number C: ");
        c = myScanner.nextInt();
        System.out.println("Enter number D: ");
        d = myScanner.nextInt();
        double sum = a + b + c + d;
        double avg = sum / 4;
        System.out.println("Number A: " + a);
        System.out.println("Number B: " + b);
        System.out.println("Number C: " + c);
        System.out.println("Number D: " + d);
        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + avg);   
    }
}






//Paste console output below:
/*
Number A: 475.0
Number B: 821.0
Number C: 369.0
Number D: 562.0
Total Sum: 2227.0
Average: 556.75

*/
