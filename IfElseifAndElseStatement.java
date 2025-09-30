package pekan4;
import java.util.Scanner;
public class Nilai {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nilai;
		Scanner input = new Scanner(System.in);
		System.out.print("Berapa nilaimu? = ");
		nilai=input.nextInt();
		input.close();
		if (nilai >= 81) {
		    System.out.println("Kamu A ya...");
		} else if (nilai >= 70) {
			System.out.println("Kamu B ya...");
		} else if (nilai >= 60) {
			System.out.println("Kamu C ya...");
		} else if (nilai >= 50) {
			System.out.println("Yah, dapat D. Bete gw jir..");
		} else {
			System.out.println("Sorry ye, dapat E...");	
		}
	}
}
