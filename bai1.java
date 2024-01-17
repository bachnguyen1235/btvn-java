import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập tên kho
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String stockItemName = sc.nextLine();
        // nhập ngày tháng  
        System.out.println("Mời bạn nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        String date = sc.nextLine();
        LocalDate dayDate = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));  
        // nhập ngày giờ
        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd  HH:mm:ss): ");
        String datetime = sc.nextLine();
        LocalDateTime dayDateTime = LocalDateTime.parse(datetime,DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss"));
        // nhập giờ
        System.out.println("Mời bạn nhập thời gian (HH:mm:ss): ");
        String time = sc.nextLine();
        LocalTime localTime = LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm:ss"));
        // hiển thị
        System.out.println("--------------------------------------");
        System.out.println("tên hàng nhập kho là: "+stockItemName);
        System.out.println("ngày tháng năm sinh: "+date);
        System.out.println("thời gian nhập hàng là: "+datetime);
        System.out.println("thời gian là: "+time);
      
    }
    
}