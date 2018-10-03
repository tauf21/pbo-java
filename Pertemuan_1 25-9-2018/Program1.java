import java.util.Scanner;
public class Program1{
	public static void main(String[] args){
	
	//deklarasi variabel
	int umur;
	String nama;
	
	System.out.println("Selamat Belajar PBO");
	System.out.println("MUMET");
	//intansi class scaner
	Scanner s = new Scanner(System.in);
	System.out.print("\nMasukan Nama = ");
	nama = s.nextLine();
	
	System.out.print("masukan Umur = ");
	umur = s.nextInt();
	
	System.out.println("\nNama saya = "+nama);
	System.out.println("Umur saya = "+umur+" Tahun");
	//selesai
	}
}