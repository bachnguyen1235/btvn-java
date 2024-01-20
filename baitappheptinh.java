import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a= ");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("nhap b= ");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("nhap phep tinh ban muon thuc hien");
        String phemtinh = sc.nextLine();

        switch(phemtinh){
            case "+":
            System.out.println("ket qua cua phep cong cua ban la: "+(a+b));
            break;
            case "-":
            System.out.println("ket qua cua phep tru cua ban la: "+(a-b));
            break;
            case "*":
            System.out.println("ket qua cua phep nhan cua ban la: "+(a*b));
            break;
            case "/":
            System.out.println("ket qua cua phep chia cua ban la: "+(a/b));
            break;
        }

    }
}
