package pl.bmicalculator.service;

import org.hibernate.Session;

public interface IHibernateSessionFactoryService {

    Session getSession();

}
