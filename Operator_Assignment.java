package pekan3;
import java.util.Scanner;
public class Operator_Assignment {
	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: "); // input 10
		A1 = keyboard.nextInt();
		System.out.print("Input angka-2: "); // input 5
        A2 = keyboard.nextInt();
        keyboard.close();
        System.out.println("Assignment Penambahan");
        A1 += A2;// penambahan, sekarang A1 = 15
        System.out.println("Penambahan : " + A1);
        System.out.println("Assignment Pengurangan");
        A1 -= A2;// pengurangan sekarang A1 = 10
        System.out.println("Pengurangan : " + A1);
        System.out.println("Assigment Perkalian");
        A1 *= A2;// perkalian,sekarang A1 = 50
        System.out.println("Perkalian : " + A1);
        System.out.println("Assigment Hasil Bagi");
        A1 /= A2;// pembagian
        System.out.println("Pembagian : " + A1);
        System.out.println("Assigment Sisa Bagi");
        A1 %= A2; //sisa bagi
        System.out.println("Sisa Bagi : " + A1);
	}
}
