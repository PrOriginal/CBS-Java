package course3.essential.topic01;
import java.util.Scanner;
import java.util.ArrayList;

public class Computer {
    private String name;
    private static ArrayList<Computer> computers = new ArrayList<Computer>();


    // Constructor
    public Computer(String name) {
        this.name = name;
        computers.add(this);
    }
    // Method for displaying a list of computers
    public static void showComputers() {
        System.out.println("List of Computers");
        for (Computer computer : computers) {
            System.out.println(computer.name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(computers.size() < 5) {
            System.out.println("Enter computer name: ");
            String name = sc.nextLine();
            Computer computer = new Computer(name);
        }
        Computer.showComputers();
    }
}