public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Mars Colony";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        //Calculate meals left after landing
        int landingDays = 2;
        double mealsPerDay = 0.75;
        double mealsLeft = meals - (landingDays * mealsPerDay);
        System.out.println("Meals left after landing: " + mealsLeft);

        // Increase meals by 50%
        meals *= 1.5;
        System.out.println("Meals after finding an extra crate of food: " + meals);

        //Update ship population
        int additionalBabies = 5;
        shipPopulation += additionalBabies;
        System.out.println("Updated ship population: " + shipPopulation);

        //Landing Location
        String landingLocation = "The Plain";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        //Call landingCheck method
        landing = landingCheck(10);

        System.out.println("Landing completed: " + landing);

        // Instantiate GuessingGame object
        GuessingGame guessingGame = new GuessingGame();

        // Instantiate MarsExpedition object
        MarsExpedition marsExpedition = new MarsExpedition();

        // Instantiate FindingsList object
        FindingsList findingsList = new FindingsList();
    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if(((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}





