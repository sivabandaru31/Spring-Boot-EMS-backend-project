package net.javaguides.ems_backend.service.impl;
import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.Entity.Department;
import net.javaguides.ems_backend.dto.DepartmentDto;
import net.javaguides.ems_backend.exception.ResourceNotFoundException;
import net.javaguides.ems_backend.mapper.DepartmentMapper;
import net.javaguides.ems_backend.repository.DepartmentRepository;
import net.javaguides.ems_backend.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }


    //get department by id REST API
    @Override
    public DepartmentDto getDepartmentId(Long departmentId) {

       Department department= departmentRepository.findById(departmentId)
               .orElseThrow( () -> new ResourceNotFoundException("department is not exist with given id"+departmentId));
        return DepartmentMapper.mapToDepartmentDto(department);
    }

    @Override
    public List<DepartmentDto> getAllDepartments() {
       List<DepartmentDto> departmentDto= departmentRepository.findAll().stream().map(department->DepartmentMapper.mapToDepartmentDto(department))
               .collect(Collectors.toList());

        return departmentDto;
    }


    @Override
     public DepartmentDto updateDeparement(Long departmentId,DepartmentDto updatedDepartment){
        Department department= departmentRepository.findById(departmentId)
                 .orElseThrow(() -> new ResourceNotFoundException("depart is not exist with given id"+departmentId));

        department.setDepartmentname(updatedDepartment.getDepartmentname());
        department.setDepartmentDescription(updatedDepartment.getDepartmentDescription());

       Department savedDepartment= departmentRepository.save(department);


        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public void deleteDepartment(Long departmentId){
       Department department= departmentRepository.findById(departmentId)
                .orElseThrow(() ->new ResourceNotFoundException("department not exist with given id"+departmentId));

       departmentRepository.deleteById(departmentId);

    }
}
