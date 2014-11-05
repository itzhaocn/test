package cn.itcast.spring0401.mvc.annotation;

import org.springframework.stereotype.Repository;
/**
 * <bean id="personDaoImpl" class="PersonDaoImpl">
 * @author Administrator
 *
 */
@Repository("person1Dao")
public class Person1DaoImpl implements PersonDao{

	public void savePerson() {
		// TODO Auto-generated method stub
		System.out.println("save person");
	}

	public void updatePerson() {
		// TODO Auto-generated method stub
		System.out.println("update person");
	}

}
