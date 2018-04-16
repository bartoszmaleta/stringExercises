package stringExercises;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Podaj imię i nazwisko");
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.next();
        String lastname = scanner.next();
        System.out.println("Twoje imię i nazwisko to: " + firstname + " " + lastname);

    }

}
