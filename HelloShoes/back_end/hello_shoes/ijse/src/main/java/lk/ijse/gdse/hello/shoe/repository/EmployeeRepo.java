package lk.ijse.gdse.hello.shoe.repository;
import lk.ijse.gdse66.footflex.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,String> {
    Employee findTopByOrderByCodeDesc();
    List<Employee> findByNameStartingWith(String name);
}
