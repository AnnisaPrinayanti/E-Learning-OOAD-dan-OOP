import java.util.Scanner;

class Mahasiswa {
	String nama;
	String npm;
	String kelas;
	String matakuliah1;
	String matakuliah2;
	String matakuliah3;
	String matakuliah4;
	String matakuliah5;
	String matakuliah6;
	String matakuliah7;

	void dataDiri() {

	Scanner scan = new Scanner (System.in);

	System.out.println("Permintaan Persetujuan Rencana Studi Dari");
	System.out.print("Nama Mahasiswa  	: ");
	nama = scan.nextLine();
	System.out.print("NPM			: ");
	npm = scan.nextLine();
	System.out.print("Kelas  			: ");
	kelas = scan.nextLine();	
	
	}	

	void perwalian() {

	Scanner scan = new Scanner (System.in);	
	
	System.out.println("==============================================");
	System.out.println("========== RENCANA STUDI SEMESTERAN ==========");
	System.out.println("==============================================");
	System.out.println("Nama Mahasiswa  	: "+nama);
	System.out.println("NPM			: "+npm);	
	System.out.println("Kelas			: "+kelas);
	System.out.println("==============================================");
	System.out.println("Matakuliah Yang Diambil: ");
	System.out.print("No.1: ");
	matakuliah1 = scan.nextLine();	
	System.out.print("No.2: ");
	matakuliah2 = scan.nextLine();		
	System.out.print("No.3: ");
	matakuliah3 = scan.nextLine();		
	System.out.print("No.4: ");
	matakuliah4 = scan.nextLine();		
	System.out.print("No.5: ");
	matakuliah5 = scan.nextLine();		
	System.out.print("No.6: ");
	matakuliah6 = scan.nextLine();		
	System.out.print("No.7: ");
	matakuliah7 = scan.nextLine();	
	System.out.println("==============================================");	
	System.out.println(" ");
	
	
	}
}