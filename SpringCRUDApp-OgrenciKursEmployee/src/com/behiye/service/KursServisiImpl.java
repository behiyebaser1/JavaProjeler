package com.behiye.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.behiye.dao.KursDAO;
import com.behiye.domain.Kurs;
import com.behiye.domain.Ogretmen;

@Service
public class KursServisiImpl implements KursServisi {

	@Autowired
	private KursDAO kursDAO;

	@Transactional
	@Override
	public List<Kurs> getKurslar() {

		return kursDAO.getKurslar();
	}

	@Transactional
	@Override
	public void saveKurs(Kurs kurs) {

		kursDAO.saveKurs(kurs);

	}

	@Transactional
	@Override
	public Kurs getKurs(int kursId) {

		return kursDAO.getKurs(kursId);
	}

	@Transactional
	@Override
	public void deleteKurs(int kursId) {

		kursDAO.deleteKurs(kursId);

	}

	@Transactional
	@Override
	public List<Ogretmen> getOgrList() {

		return kursDAO.getOgrList();
	}

}
