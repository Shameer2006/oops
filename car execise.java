import java.util.Scanner;

class Car {
    int m = 0;
    String color;

    void start(String model, String color) {
        System.out.println("Car started - Model: " + model + ", Color: " + color);
        m = 1;
    }

    void start() {
        System.out.println("Car started (but model not shown)");
        m = 1;
    }

    void stop() {
        if (m == 1) {
            System.out.println("Car is stopped");
            m = 0;
        } else {
            System.out.println("Car is not started");
        }
    }
}

public class bassil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Car c = new Car();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Start the car");
            System.out.println("2. Stop the car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the car model: ");
                    String model = s.nextLine();
                    System.out.print("Enter the car color: ");
                    String color = s.nextLine();
                    c.start(model, color);
                    break;
                case 2:
                    c.stop();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
