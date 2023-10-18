import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Имя =" + name);
        String lastchar = name.substring(name.length() - 1);
        System.out.println("last character: " +lastchar);

        if ((lastchar.equals ("а"))|(lastchar.equals ("я"))|(lastchar.equals ("и"))) {
            System.out.println("Приветик!");
        }else
            System.out.println("Здарова!");
    }
}