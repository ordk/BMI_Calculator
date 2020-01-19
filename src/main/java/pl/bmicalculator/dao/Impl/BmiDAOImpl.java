package pl.bmicalculator.dao.Impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.bmicalculator.dao.IBmiDAO;
import pl.bmicalculator.model.Bmi;
import pl.bmicalculator.service.IHibernateSessionFactoryService;

import java.util.List;

@Repository
public class BmiDAOImpl implements IBmiDAO {

    @Autowired
    IHibernateSessionFactoryService sessionFactoryService;

    @Override
    public Bmi save(Bmi bmi) {

        Session session = this.sessionFactoryService.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(bmi);
        transaction.commit();
        session.close();

        return bmi;
    }

    @Override
    public List<Bmi> getAllBmis() {
        Session session = this.sessionFactoryService.getSession();
        Query query = session.createQuery("FROM pl.bmicalculator.model.Bmi");
        List<Bmi> bmis = query.list();
        session.close();

        return bmis;
    }

    @Override
    public Bmi getBmiById(int id) {
        Session session = sessionFactoryService.getSession();
        Query query = session.createQuery("FROM pl.bmicalculator.model.Bmi WHERE id=" + id);
        Bmi foundBmi = (Bmi) query.uniqueResult();
        session.close();
        return foundBmi;
    }
}
