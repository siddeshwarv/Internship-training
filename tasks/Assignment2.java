import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date & time in yyyy/mm/dd HH:mm:ss");
        String userInput = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime userDateTime=null;
        try {
            // Parsing datetime of user input
            userDateTime  = LocalDateTime.parse(userInput,formatter);
            System.out.println(" Your date time:"+userDateTime);
            LocalDateTime plusOnDay = userDateTime.plusDays(1);
            System.out.println(plusOnDay);
            LocalDateTime minusTenDays = userDateTime.minusDays(10);
            System.out.println(minusTenDays);
            LocalDateTime plusOneHour = userDateTime.plusHours(1);
            System.out.println(plusOneHour);
            LocalDateTime minus5hrs30mins = userDateTime.minusHours(5).minusMinutes(30);
            System.out.println(minus5hrs30mins);

        }
        catch(Exception e){
            System.out.println("Reenter date and time in right format."+e);
        }
        finally{
            sc.close();
        }
    }
    
}
