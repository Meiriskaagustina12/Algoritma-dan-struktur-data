import java.util.Scanner;
//PIC -> Package, Import, Class

public class VariableTipeData {
    
    static String nama;
    static int nilai;
    static Integer sks;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Nama:");
        nama = sc.nextLine();
        
        System.out.println("Nama anda :" + nama);
    }
}
