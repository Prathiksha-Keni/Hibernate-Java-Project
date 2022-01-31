package com.xworkz.medicine.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.medicine.medicineentity.MedicineEntity;

public class MedicineDaoImpl implements MedicineDao {

	@Override
	public void save() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(MedicineEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		MedicineEntity medicine = new MedicineEntity(3, "crocine", "crocine", 25.0, "12-1-2022", "12-1-2023");
		// session.save(medicine);
		session.persist(medicine);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
