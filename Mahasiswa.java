public class Mahasiswa extends Elemen {
	private String angkatan;

	public Mahasiswa(String nama, String umur, String gender, String angkatan) {
		super();
		this.angkatan = angkatan;
		super.setNama(nama);
		super.setGender(gender);
		super.setUmur(umur);
		super.setStatus("mahasiswa");
	}

	public String getAngkatan() {
		return angkatan;
	}

	public void setAngkatan(String angkatan) {
		this.angkatan = angkatan;
	}
	
	
}
