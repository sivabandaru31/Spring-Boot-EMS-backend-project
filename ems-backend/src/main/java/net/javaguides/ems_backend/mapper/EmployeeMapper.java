package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.Entity.Employee;

public class EmployeeMapper {
//Employee entity to EmployeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee ){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getDepartment().getId()
        );
    }

    //EmployeeDto entity to Employee
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee= new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstname(employeeDto.getFirstname());
        employee.setLastname(employeeDto.getLastname());
        employee.setEmail(employeeDto.getEmail());
        return employee;

//                employeeDto.getId(),
//                employeeDto.getFirstname(),
//                employeeDto.getLastname(),
//                employeeDto.getEmail()
    }

}
