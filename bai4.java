import java.util.ArrayList;
import java.util.Scanner;

/**
 * baitap2
 */
public class baitap2 {

    public static void main(String[] args) {
        while (true) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("moi nhap số hàng: ");
            int row =Integer.parseInt(sc.nextLine());
            System.out.println("moi nhap số cot: ");
            int colum =Integer.parseInt(sc.nextLine());
            int arr[][] = new int[row][colum];
            
            int sum=0;
            String array;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    while (true) {
                        System.out.println("nhap phan tu a["+i+"]"+"["+j+"]");
                        array = sc.nextLine();
                        if (array.equals("")) {
                            System.out.println("ban khong the nhap phan tu rong, moi nhap lai"); 
                        }
                        else{
                            break;
                        }
                    }
                    arr[i][j]=Integer.parseInt(array);
                    if (arr[i][j]%3==0) {
                        sum +=arr[i][j];
                    }
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    System.out.println("a["+i+"]"+"["+j+"]"+arr[i][j]);
                }
            }
            System.out.println("sum: "+sum);
            System.out.println("ban co muon nhap lai mang hay khong? (y/n)");
            String choose = sc.nextLine();
            if (choose.equalsIgnoreCase("n")) {
                break;
            }

        }
    }
        }