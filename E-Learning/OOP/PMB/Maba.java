import java.util.Scanner;

class Maba {

	String nama;
	String alamat;
	String email;
	String no_tlp;
	String jurusan;
	

	public void cekRegistrasi() {

	System.out.println ("Nomor Registrasi : 186");
	
	}
	
	void registrasi() {

	Scanner input = new Scanner (System.in);
	
	System.out.print ("Nama Lengkap : ");
	nama = input.nextLine();

	System.out.print ("Alamat : ");
	alamat = input.nextLine();

	System.out.print ("Email : ");
	email = input.nextLine();

	System.out.print ("Nomor Telephone : ");
	no_tlp = input.nextLine();

	System.out.print ("Jurusan Yang Diambil : ");
	jurusan = input.nextLine();

	}
	

}
	