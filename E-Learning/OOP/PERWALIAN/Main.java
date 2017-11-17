public class Main {

	public static void main (String[] args){  

	System.out.println(" ");
	System.out.println("==============================================");
	System.out.println("          WELCOME TO FORM PERWALIAN           ");
	System.out.println("==============================================");
	System.out.println(" ");

	Dosen dosen = new Dosen();
	Keuangan uang = new Keuangan();
	
	dosen.dataDiri();
	uang.cekKeuangan();

	System.out.println("Silahkan Isi Rencana Studi Anda");
	System.out.println(" ");	

	dosen.perwalian();
	
	System.out.println("Menunggu Persetujuan.............");
	System.out.println(" ");
	System.out.println("==============================================");
	System.out.println("========== RENCANA STUDI SEMESTERAN ==========");
	System.out.println("==============================================");
	System.out.println("Nama Mahasiswa  	: "+dosen.nama);
	System.out.println("NPM			: "+dosen.npm);	
	System.out.println("Kelas			: "+dosen.kelas);
	System.out.println("==============================================");
	System.out.println("Matakuliah Yang Diambil: ");
	System.out.println("No.1: "+dosen.matakuliah1);	
	System.out.println("No.2: "+dosen.matakuliah2);		
	System.out.println("No.3: "+dosen.matakuliah3);		
	System.out.println("No.4: "+dosen.matakuliah4);		
	System.out.println("No.5: "+dosen.matakuliah5);	
	System.out.println("No.6: "+dosen.matakuliah6);	
	System.out.println("No.7: "+dosen.matakuliah7);
	System.out.println("==============================================");	
	
	dosen.persetujuan();
		
                                                                                                                                                  
	}
}