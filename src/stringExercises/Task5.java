package stringExercises;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        System.out.println("Podawj wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        // 012345
        // Michał

//        System.out.println(s.charAt(s.length()-2));

        int length = word.length();
        System.out.println(word.charAt(length-2));
        System.out.println(word.charAt(0));


//        StringBuilder lastName = new StringBuilder("Maleta");
//        lastName.reverse();


    }
}
