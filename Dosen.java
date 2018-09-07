
public class Dosen extends Staf {
	
	public Dosen(String pekerjaan, String jabatan, String nama, String umur, String gender) {
		super(pekerjaan, jabatan, nama, umur, gender);
		super.setNama(nama);
		super.setGender(gender);
		super.setUmur(umur);
	}


}
