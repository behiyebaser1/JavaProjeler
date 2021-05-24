package com.behiye.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Kurs {

	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "course_seq", sequenceName = "seq_course", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
	private int kursId;

	@Column(name = "kurs_adi")
	private String kursAdi;

	@Column(name = "saat")
	private int saat;

	@OneToOne
	@JoinColumn(name = "ogretmen_id")
	private Ogretmen ogretmen;

	public int getKursId() {
		return kursId;
	}

	public void setKursId(int kursId) {
		this.kursId = kursId;
	}

	public String getKursAdi() {
		return kursAdi;
	}

	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}

	public int getSaat() {
		return saat;
	}

	public void setSaat(int saat) {
		this.saat = saat;
	}

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	public Kurs(String kursAdi, int saat, Ogretmen ogretmen) {
		super();
		this.kursAdi = kursAdi;
		this.saat = saat;
		this.ogretmen = ogretmen;
	}

	public Kurs() {
		super();
	}

	@Override
	public String toString() {
		return "Kurs [kursAdi=" + kursAdi + "]";
	}

}
