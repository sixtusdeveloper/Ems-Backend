package net.sixtusdev.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sixtusdev.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
