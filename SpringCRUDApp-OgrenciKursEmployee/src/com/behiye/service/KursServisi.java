package com.behiye.service;

import java.util.List;

import com.behiye.domain.Kurs;
import com.behiye.domain.Ogretmen;

public interface KursServisi {

	public List<Kurs> getKurslar();

	public void saveKurs(Kurs kurs);

	public Kurs getKurs(int kursId);

	public void deleteKurs(int kursId);

	public List<Ogretmen> getOgrList();

}
