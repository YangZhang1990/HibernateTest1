import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
// Test Class
public class StudentTest {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	

	@Before
	public void init(){
	
		//create configure object
		Configuration config = new Configuration().configure();
		//create service registry object
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//create session factory
		sessionFactory =config.buildSessionFactory(serviceRegistry);
		//session object
		session = sessionFactory.openSession();
		//open transaction object
		transaction = session.beginTransaction();

		
	}
	@After
	public void destory(){
		transaction.commit();//submit transaction
		session.close();
		sessionFactory.close();
	}
	@Test
	public void testSaveStudents(){
		//create a Students object
		Students s = new Students(1,"SanFeng", "Male", new Date(),"Wudangshan");
		session.save(s);//save object
	}
}
