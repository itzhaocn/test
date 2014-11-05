package cn.itcast.cglib0401.proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void test(){
		PersonDaoImpl target = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyIntercptor intercptor = new MyIntercptor(transaction,target);
		
		PersonDaoImpl personDaoImpl = (PersonDaoImpl)intercptor.createProxy();
		personDaoImpl.getPerson();
	}
}
