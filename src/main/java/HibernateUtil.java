

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
	    if (null != sessionFactory)
	        return sessionFactory;
	    
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    try {
	        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    } catch (HibernateException e) {
	        System.err.println("Initial SessionFactory creation failed." + e);
	        throw new ExceptionInInitializerError(e);
	    }
	    return sessionFactory;
	}

//	private static SessionFactory sessionFactory;
//	private static ServiceRegistry serviceRegistry;
//
//	public static SessionFactory createSessionFactory() {
//		Configuration configuration = new Configuration();
//		configuration.configure();
//		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//		return sessionFactory;
//	}

//	private static final SessionFactory sessionFactory = buildSessionFactory();

//	private static SessionFactory buildSessionFactory() {
//		try {
//			// Create the SessionFactory from hibernate.cfg.xml
//			return new Configuration().configure().buildSessionFactory();
//		} catch (Throwable ex) {
//			// Make sure you log the exception, as it might be swallowed
//			System.err.println("SessionFactory creation failed." + ex);
//			throw new ExceptionInInitializerError(ex);
//		}
//	}
//
//	public static SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public static void shutdown() {
//		getSessionFactory().close();
//	}

}
