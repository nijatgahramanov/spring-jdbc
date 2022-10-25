package az.spring.jdbc;

import az.spring.jdbc.config.SpringJdbcConfig;
import az.spring.jdbc.dao.EmployeeDao;
import az.spring.jdbc.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

        long count = employeeDao.count();
        System.out.println(count);

        Employee employee = employeeDao.getEmployeeById(1);
        System.out.println(employee);

        System.out.println(employeeDao.getAllEmployee());

//        System.out.println("_________________________________________________");
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans/spring-jdbc-config.xml");
//        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
//
//        long count = employeeDao.count();
//        System.out.println("count : " + count);
//
//        System.out.println(employeeDao.getAllEmployee());
//
//        Employee employee = employeeDao.getEmployeeById(1);
//        System.out.println(employee);


    }
}
