package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.Entity.Department;
import net.javaguides.ems_backend.dto.DepartmentDto;

public class DepartmentMapper {

    //convert department jpa entity into department dto

    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentname(),
                department.getDepartmentDescription()
        );
    }

    //convert department dto into department jpa entity

    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
