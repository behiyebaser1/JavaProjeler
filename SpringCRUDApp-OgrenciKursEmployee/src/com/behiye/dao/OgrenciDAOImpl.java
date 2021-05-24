package com.behiye.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.behiye.domain.Ogrenci;

@Repository
public class OgrenciDAOImpl implements OgrenciDAO {

	@Autowired
	SessionFactory sessionFactory;

	// @Transactional-- gerek kalmadý servis ile
	@Override
	public List<Ogrenci> getOgrenciler() {

		Session session = sessionFactory.getCurrentSession();

		// session.beginTransaction();

		Query<Ogrenci> query = session.createQuery("from Ogrenci", Ogrenci.class);
		List<Ogrenci> resultList = query.getResultList();
		// session.getTransaction().commit();

		return resultList;
	}

	// @Transactional
	@Override
	public void saveOgrenci(Ogrenci ogr) {

		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(ogr);

	}

	@Override
	public Ogrenci getOgrenci(int ogrId) {

		Session session = sessionFactory.getCurrentSession();

		Ogrenci ogr = session.get(Ogrenci.class, ogrId);

		return ogr;
	}

	@Override
	public void deleteOgrenci(int ogrId) {

		Session session = sessionFactory.getCurrentSession();
		Ogrenci ogr = session.get(Ogrenci.class, ogrId);
		session.delete(ogr);

	}

}
