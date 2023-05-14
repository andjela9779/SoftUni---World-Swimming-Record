import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Rekord u sekundama");
        double recordInSeconds = scan.nextDouble();
        System.out.println("Udaljenost u metrima");
        double distanceInMeters = scan.nextDouble();
        System.out.println("Vrijeme po metru");
        double timeForOneMeter = scan.nextDouble();  // seconds for one meter

        double timeWithoutSlowingDown = distanceInMeters * timeForOneMeter;
        System.out.println("Time without slowing down: " + timeWithoutSlowingDown);
        double slowDownTimes = distanceInMeters / 15;
        System.out.println("times to slow down " + slowDownTimes);
        double totalTimeWithSlowDown = timeWithoutSlowingDown + (slowDownTimes * 12.5);
        System.out.println("Time after slowing down" + totalTimeWithSlowDown);

        double razlika = 0;

        if ( recordInSeconds < totalTimeWithSlowDown){
            razlika = totalTimeWithSlowDown - recordInSeconds;
            System.out.println("Oliver je losiji od svjetskog rekorda za " + razlika);
        } else {
            razlika = recordInSeconds - totalTimeWithSlowDown;
            System.out.println("Oliver je bolji od svjetskog rekorda za " + razlika);

        }


    }
}
