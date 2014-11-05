package cn.itcast.spring0401.aop.annotation;

import java.util.List;

public interface PersonDao {
	public void savePerson();
	public void updatePerson();
	public List<Person> getPerson() throws Exception;
	public void deletePerson();
}
