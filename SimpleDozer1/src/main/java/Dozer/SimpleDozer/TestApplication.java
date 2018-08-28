package Dozer.SimpleDozer;

import org.dozer.DozerBeanMapper;

import com.lsn.bean.Employee1;
import com.lsn.bean.Employee2;

/**
 * Hello world!
 *
 */
public class TestApplication {
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1();
		employee1.setAge("23");
		employee1.setName("Saikiran");

		employee1.setAddress("Jagtial");

		Employee2 employee2 = new DozerBeanMapper().map(employee1, Employee2.class);
		System.out.println( "Employee Name: "+employee2.getName() + ", Employee Age: " + employee2.getAge()+", Employee Address: "+employee2.getAddress());
	}
}
