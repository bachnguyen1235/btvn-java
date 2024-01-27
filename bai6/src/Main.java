
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("moi nhap ten: ");
        String name = sc.nextLine();
        System.out.println("moi nhap tuoi:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("moi nhap kinh nghiem lam viec:");
        double experience = Double.parseDouble(sc.nextLine());

        Employee employee= new Employee(id,name,age,experience);
        String listEmployee [] = new String[4];
        listEmployee[0]=Integer.toString(employee.getId());
        listEmployee[1]=employee.getName();
        listEmployee[2]=Integer.toString(employee.getAge());
        listEmployee[3]=Double.toString(employee.getExperience());
        System.out.println(Arrays.toString(listEmployee));

    }
}