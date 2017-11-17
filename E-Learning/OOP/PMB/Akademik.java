class Akademik extends Maba {
	
	void status() {
		System.out.println("Registrasi Anda Berhasil");
		System.out.println(" ");
	
	}

	//overrinding
	public void cekRegistrasi() {
		System.out.println ("Nomor Induk Mahasiswa : 15111186");
		
		super.cekRegistrasi();

	}
	


}