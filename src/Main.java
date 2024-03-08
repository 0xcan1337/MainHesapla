import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String employeeName;
        int employeeSalary;
        int employeeHour;
        int employeeYear;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Maaş Hesaplayiciya Hoş Geldiniz. Devam etmek için bir isim giriniz: ");
        employeeName = girdi.nextLine();

        System.out.println("Net maaş miktarınızı giriniz: ");
        employeeSalary = girdi.nextInt();

        System.out.println("Haftalık çalışma saatinizi giriniz: ");
        employeeHour = girdi.nextInt();

        System.out.println("İşe başlama yılınızı giriniz:  ");
        employeeYear = girdi.nextInt();



        Employee employee1 = new Employee(employeeName, employeeSalary, employeeHour, employeeYear);
        System.out.println(employee1);
    }
}