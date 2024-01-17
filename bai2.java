import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Thực hiện chuyển đổi dữ liệu từ String -> LocalDatetime
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd  HH:mm:ss): ");
        String datetime = sc.nextLine();
        LocalDateTime dayDateTime = LocalDateTime.parse(datetime,DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss"));
        System.out.println("thời gian nhập hàng là: "+datetime);
        //in ra ngày giờ hiện tại
        System.out.println("ngày giờ hiện tại là: "+LocalDateTime.now());
        //in ra thời gian của 3 ngày sau
        System.out.println("thời gian của 3 nagfy sau là: "+LocalDateTime.now().plusDays(3));

    }
}
