package com.behiye.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.behiye.domain.Kurs;
import com.behiye.domain.Ogretmen;

@Repository
public class KursDAOImpl implements KursDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Kurs> getKurslar() {

		Session session = sessionFactory.getCurrentSession();

		Query<Kurs> query = session.createQuery("from Kurs", Kurs.class);
		List<Kurs> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public void saveKurs(Kurs kurs) {

		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(kurs);

	}

	@Override
	public Kurs getKurs(int kursId) {

		Session session = sessionFactory.getCurrentSession();

		Kurs kurs = session.get(Kurs.class, kursId);

		return kurs;
	}

	@Override
	public void deleteKurs(int kursId) {

		Session session = sessionFactory.getCurrentSession();
		Kurs kurs = session.get(Kurs.class, kursId);
		session.delete(kurs);

	}

	@Override
	public List<Ogretmen> getOgrList() {

		Session session = sessionFactory.getCurrentSession();

		Query<Ogretmen> query = session.createQuery("from Ogretmen", Ogretmen.class);
		List<Ogretmen> resultList = query.getResultList();

		return resultList;
	}

}
