import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
// import java.time.;
public class Assignment1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date & time in yyyy/mm/dd HH:mm:ss");
        String userInput = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime userDateTime=null;
        try {
            // Parsing datetime of user input
            userDateTime  = LocalDateTime.parse(userInput,formatter);
            System.out.println("date time:"+userDateTime);
            // using ZoneId function to specify the user date time zone
            ZoneId itsZone = ZoneId.of("Asia/Kolkata");
            ZonedDateTime userZoneDateTime = userDateTime.atZone(itsZone);
            // Converting user datetime to unix time stamp
            long unixTimeStamp = userZoneDateTime.toEpochSecond();
            System.out.println("Unix Time Stamp:"+unixTimeStamp);
            // Converting user ist time stamp to utc time stamp 
            ZonedDateTime utcDateTime = userZoneDateTime.withZoneSameInstant(ZoneId.of("UTC"));
            System.out.println(utcDateTime);
            // Converting utc to IST time stamp
            ZonedDateTime istDateTime = utcDateTime.withZoneSameInstant(itsZone);
            System.out.println("IST date time :"+istDateTime);
        }
        catch(Exception e){
            System.out.println("Reenter date and time in right format."+e);
        }
        finally{
            sc.close();
        }

    }
}
