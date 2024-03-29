package com.guizKev.api.domain.service.employee;
import java.util.List;
import com.guizKev.api.persistence.entity.Employee;

public interface EmployeeService {
    
    List<Employee> getAllEmployee();

    List<Object[]> findEmployeesByManagerCode(Long managerCode);

    List<Object[]> findEmployeesWithoutManager();

    List<Object[]> findNonSalesRepresentatives(String position);

    List<Object[]> findEmployeesWithManagers();

    List<Object[]> findEmployeesWithManagersAndManagerOfManagers();

    List<Employee> findEmployeesWithoutOffice();

    List<Object[]> findEmployeesWithoutClient();

    List<Object[]> findEmployeesWithoutClientAndTheirOffice();

    List<Employee> findEmployeesWithoutOfficeAndClient();

    List<Object[]> findEmployeesWithoutClientAndTheirManager();

    Long countEmployees();

    List<Object[]> findSalesRepresentativesAndTheirClients();
}