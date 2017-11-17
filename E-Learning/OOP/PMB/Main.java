public class Main {

	public static void main (String[] args) {

	System.out.println(" ");
	System.out.println("=======================================");
	System.out.println(" SELAMAT DATANG DI FORM MAHASISWA BARU ");	
	System.out.println("=======================================");

	Maba maba = new Maba();
	Akademik akad = new Akademik();
	Keuangan uang = new Keuangan();

	maba.cekRegistrasi();

	System.out.println(" ");
	System.out.println("Silahkan Isi Identitas Diri Anda: ");
	System.out.println(" ");

	akad.registrasi();
	uang.cekKeuangan();
	akad.status();
	akad.cekRegistrasi();

	System.out.println("Nama Mahasiswa: " +akad.nama);
	System.out.println("Jurusan : " +akad.jurusan);
		
	}

}