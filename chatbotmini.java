import java.util.Scanner;

public class chatbotmini {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        // ...
        test();

    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("ques -- blah blah ques\n1. option1 \n2. option2 \n3. option 3\n");
        // write your code here
        int optans=scanner.nextInt();
        for(;;){
            if(optans==2){
                end();
                break;
            }
            else{
                optans=scanner.nextInt();
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");

    }

}
