// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Mars {
    public static void main(String[] args) {
        // Variables
        String message = "Hello Mars!";
        int count = 10;
        double temperature = -56.7;
        boolean isRaining = true;

        // If-Else statement
        if (temperature < -50) {
            System.out.println("It's freezing on Mars!");
        } else {
            System.out.println("The temperature on Mars is tolerable.");
        }

        // Call the landingCheck function
        boolean isSuccessfulLanding = landingCheck(count);
        System.out.println("Landing is successful: " + isSuccessfulLanding);
    }

    public static boolean landingCheck(int n) {
        // Implementation of the landingCheck function
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.println("Starting landing procedure...");
            } else {
                System.out.println("Executing step " + i + " of landing procedure...");
            }
        }
        return true; // Return true to indicate successful landing
    }
}





