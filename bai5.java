import java.util.Scanner;

/**
 * hocjava
 */
public class hocjava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aRow,aColum, bRow,bColum;
        while (true) {
            
            while (true) {
                System.out.println("moi nhap so dong va cot cua ma tran A va B");
                System.out.println("ma tran A");
                System.out.print("dong a: ");
                aRow = Integer.parseInt(sc.nextLine());
                System.out.print("cot a: ");
                aColum = Integer.parseInt(sc.nextLine());
                System.out.println("ma tran B");
                System.out.print("dong b: ");
                bRow = Integer.parseInt(sc.nextLine());
                System.out.print("cot b: ");
                bColum = Integer.parseInt(sc.nextLine());
                if (aRow!=bRow || aColum != bColum ) {
                    System.out.println("khong the cong 2 ma tran khac kieu nhau, xin moi nhap lai:");
                }else{
                    break;
                }
    
            }
            System.out.println("nhap phan tu cho mang A");
            int A[][] = new int[aRow][aColum];
            String arrayA;
            for (int i = 0; i < aRow; i++) {
                for (int j = 0; j < aColum; j++) {
                    while (true) {
                        System.out.println("nhap phan tu a["+i+"]"+"["+j+"]");
                        arrayA = sc.nextLine();
                        if (arrayA.equals("")) {
                            System.out.println("ban khong the nhap phan tu rong, moi nhap lai"); 
                        }
                        else{
                            break;
                        }
                    }
                    A[i][j]=Integer.parseInt(arrayA);
                }
            }
            System.out.println("nhap phan tu cho mang B");
            int B[][] = new int[aRow][aColum];
            String arrayB;
            for (int i = 0; i < aRow; i++) {
                for (int j = 0; j < aColum; j++) {
                    while (true) {
                        System.out.println("nhap phan tu a["+i+"]"+"["+j+"]");
                        arrayB = sc.nextLine();
                        if (arrayB.equals("")) {
                            System.out.println("ban khong the nhap phan tu rong, moi nhap lai"); 
                        }
                        else{
                            break;
                        }
                    }
                    B[i][j]=Integer.parseInt(arrayB);
                }
            }
            int sumArr[][] = new int[aRow][aColum];
            for (int i = 0; i < aRow; i++) {
                for (int j = 0; j < aColum; j++){
                    sumArr[i][j]=A[i][j]+B[i][j];
                }
            }
            System.out.println("mang tong la:");
            for (int i = 0; i < aRow; i++) {
                for (int j = 0; j < aColum; j++) {
                    System.out.println("sumArr["+i+"]"+"["+j+"]"+sumArr[i][j]);
                }
            }
            System.out.println(" ban co muon thuc hien lai khong? y/n: ");
            String choose = sc.nextLine();
            if (choose.equalsIgnoreCase("n")) {
                break;
            }
        }


    }
}