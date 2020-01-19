package pl.bmicalculator.service.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import pl.bmicalculator.service.IHibernateSessionFactoryService;

@Service
public class HibernateSessionFactoryServiceImpl implements IHibernateSessionFactoryService {

    private SessionFactory sessionFactory;

    public HibernateSessionFactoryServiceImpl() {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public Session getSession() {
        return this.sessionFactory.openSession();
    }
}
