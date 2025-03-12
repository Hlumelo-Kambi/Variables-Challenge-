import java.util.Scanner;



public class Chatbot {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello. What is your name?");
            String name = scanner.nextLine();

            System.out.println("Hi "+name+" I'm Javabot. Where are you from?");
            String place = scanner.nextLine();

            System.out.println("I hear it's beautiful at "+place+"! I'm from a place called Oracle!");
            
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("So you're "+age+", cool! I'm 400 years old.");
            System.out.println("This means I'm 8 times older than you.");
            
            System.out.println("Enough about me. What's your favourite language? (just don't say python)");
            String language = scanner.nextLine();

            System.out.println(language+", that's great! Nice chatting with you "+name+". I have to log off now. See ya!");
        }

    }
}
