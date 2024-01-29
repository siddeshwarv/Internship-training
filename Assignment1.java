import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.ZoneId;
import java.time.Duration;
// import java.time.;
public class Assignment1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date & time in yyyy/mm/dd HH:mm:ss");
        String userInput = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime userDateTime=null;
        try {
            userDateTime  = LocalDateTime.parse(userInput,formatter);
            System.out.println("date time:"+userDateTime);
        }
        catch(Exception e){
            System.out.println("Reenter date and time in right format."+e);
        }
        ZoneId itsZone = ZoneId.of("Asia/Kolkata");
        System.out.println(userDateTime.atZone(itsZone).toEpochSecond());

    }
}
