package com.behiye.dao;

import java.util.List;

import com.behiye.domain.Kurs;
import com.behiye.domain.Ogretmen;

public interface KursDAO {

	public List<Kurs> getKurslar();

	public void saveKurs(Kurs kurs);

	public Kurs getKurs(int kursId);

	public void deleteKurs(int kursId);

	public List<Ogretmen> getOgrList();

}
