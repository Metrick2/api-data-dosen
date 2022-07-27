package com.uas.pm.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_DOSEN")
public class Dosen {
	
	@Id
	@Column(name="ID_DOSEN")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDosen;
	
	@Column(name = "NAMA")
	private String nama;
	
	@Column(name = "NIP")
	private String nip;
	
	@Column(name = "ALAMAT")
	private String alamat;	
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NO_TELEPON")
	private String noTelpon;
	
	@Column(name = "KODE_MATA_KULIAH")
	private String kodeMataKuliah;
	
	@Column(name = "BIDANG")
	private String bidang;

	public Integer getIdDosen() {
		return idDosen;
	}

	public void setIdDosen(Integer idDosen) {
		this.idDosen = idDosen;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNoTelpon() {
		return noTelpon;
	}

	public void setNoTelpon(String noTelpon) {
		this.noTelpon = noTelpon;
	}

	public String getKodeMataKuliah() {
		return kodeMataKuliah;
	}

	public void setKodeMataKuliah(String kodeMataKuliah) {
		this.kodeMataKuliah = kodeMataKuliah;
	}

	public String getBidang() {
		return bidang;
	}

	public void setBidang(String bidang) {
		this.bidang = bidang;
	}

}
