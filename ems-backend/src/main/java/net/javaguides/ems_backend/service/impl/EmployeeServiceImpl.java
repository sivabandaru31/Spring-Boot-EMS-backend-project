package net.javaguides.ems_backend.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.exception.ResourceNotFoundException;
import net.javaguides.ems_backend.mapper.EmployeeMapper;
import net.javaguides.ems_backend.repository.EmployeeRepository;
import net.javaguides.ems_backend.service.EmployeeService;
import org.springframework.stereotype.Service;
import net.javaguides.ems_backend.Entity.Employee;

import java.util.List;
import java.util.stream.Collectors;

@Service  //to create spring beam for this class
@AllArgsConstructor
public class EmployeeServiceImpl  implements EmployeeService {

    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);

       Employee savedEmployee =employeeRepository.save(employee);//saced employee jpa entity into database

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);//saved employee object into map to employeee dto
    }

    @Override
    public EmployeeDto getEmployeeId(Long employeeId) {

       Employee employee= employeeRepository.findById(employeeId)
                .orElseThrow(()->
                        new ResourceNotFoundException("Employee is not exist  with given id :"+employeeId));

       //to convert employee jpa entity into employee dto
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees(){
      List<Employee>  employees=employeeRepository.findAll();
        return employees.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee))
        .collect(Collectors.toList());
    }
}
