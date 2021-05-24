package com.behiye.databinding;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Personel {

	@NotEmpty(message = "bu alan zorunludur.")
	private String ad;
	private String soyad;
	private String cinsiyet;
	private String email;
	private String adres;
	private String ehliyet;
	private String tarih;
	private String[] yabanciDil;
	private String duzey;
	private static List<String> duzeyler;
	private String okul;
	private String pozisyon;
	private static List<String> pozisyonlar;

	static {

		duzeyler = new ArrayList<String>();
		duzeyler.add("Cok iyi");
		duzeyler.add("Iyi");
		duzeyler.add("Orta");
		duzeyler.add("Kotu");

		pozisyonlar = new ArrayList<String>();
		pozisyonlar.add("Bilgisayar Muhendisi");
		pozisyonlar.add("Elektrik-Elektronik Muhendisi");
		pozisyonlar.add("Insaat Muhendisi");
		pozisyonlar.add("Makine Muhendisi");
	}

	/*
	 * public String veritabaninaGonder() {
	 * 
	 * Connection connection = null; PreparedStatement preparedStatement = null; int
	 * i = 0;
	 * 
	 * try {
	 * 
	 * // Class.forName("oracle.jdbc.driver.OracleDriver"); connection =
	 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
	 * "1234"); preparedStatement = connection
	 * .prepareStatement("insert into DENEME(AD,SOYAD,CINSIYET,MAIL,ADRES,EHLIYET,DIL,DUZEY,"
	 * + "OKUL,POZISYON) values(?,?,?,?,?,?,?,?,?,?)");
	 * preparedStatement.setString(1, ad); preparedStatement.setString(2, soyad);
	 * preparedStatement.setString(3, cinsiyet); preparedStatement.setString(4,
	 * email); preparedStatement.setString(5, adres); preparedStatement.setString(6,
	 * ehliyet); preparedStatement.setString(7, Arrays.toString(yabanciDil));
	 * preparedStatement.setString(8, duzey); preparedStatement.setString(9, okul);
	 * preparedStatement.setString(10, pozisyon);
	 * 
	 * i = preparedStatement.executeUpdate();
	 * 
	 * } catch (Exception e) { System.err.println(e); }
	 * 
	 * finally { try { connection.close(); preparedStatement.close(); } catch
	 * (Exception e) { System.err.println("Hata" + e); } }
	 * 
	 * if (i > 0) {
	 * 
	 * System.out.println("kayýt baþarýlý"); return "basarili?faces-redirect=true";
	 * 
	 * } else {
	 * 
	 * System.out.println("kayýt baþarýlý deðil"); return
	 * "basarisiz?faces-redirect=true"; }
	 * 
	 * }
	 */
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEhliyet() {
		return ehliyet;
	}

	public void setEhliyet(String ehliyet) {
		this.ehliyet = ehliyet;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public String[] getYabanciDil() {
		return yabanciDil;
	}

	public void setYabanciDil(String[] yabanciDil) {
		this.yabanciDil = yabanciDil;
	}

	public String getDuzey() {
		return duzey;
	}

	public void setDuzey(String duzey) {
		this.duzey = duzey;
	}

	public List<String> getDuzeyler() {
		return duzeyler;
	}

	public void setDuzeyler(List<String> duzeyler) {
		Personel.duzeyler = duzeyler;
	}

	public String getOkul() {
		return okul;
	}

	public void setOkul(String okul) {
		this.okul = okul;
	}

	public String getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}

	public List<String> getPozisyonlar() {
		return pozisyonlar;
	}

	public void setPozisyonlar(List<String> pozisyonlar) {
		Personel.pozisyonlar = pozisyonlar;
	}

}
