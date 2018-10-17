package com.example.hibernate.util;
import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
	 
    private static SessionFactory buildSessionFactory() {
        try {
        	// Create the SessionFactory from hibernate.cfg.xml
        	Configuration configuration= new Configuration().configure(new File("C:\\Personal_JAVA\\FirstHibernate\\src\\main\\resources\\hibernate_annotation.cfg.xml"));
        	
        	serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            SessionFactory sf=configuration.buildSessionFactory(serviceRegistry);
            return sf;
 
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }

}
