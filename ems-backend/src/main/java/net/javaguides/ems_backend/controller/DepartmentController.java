package net.javaguides.ems_backend.controller;


import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.dto.DepartmentDto;
import net.javaguides.ems_backend.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

//    private DepartmentService departmentService;
    private DepartmentService departmentService;
    //Build create or Add department REST API

    @PostMapping
    public ResponseEntity<DepartmentDto>  createDepartment( @RequestBody DepartmentDto departmentDto){
        DepartmentDto department=departmentService.createDepartment(departmentDto);

        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }



    //Build Get Department REST API


    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto>  getDepartmentId( @PathVariable("id") Long departmentId){
        DepartmentDto departmentDto=departmentService.getDepartmentId(departmentId);

        return ResponseEntity.ok(departmentDto);
    }

    //Build getALL Department REST API
    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAlldepartments(){
        List<DepartmentDto>  departments= departmentService.getAllDepartments();

        return ResponseEntity.ok(departments);
    }

    // Build updateDepartment REST API

    @PutMapping("{id}")
    public ResponseEntity<DepartmentDto> updatedDepartment( @PathVariable("id") Long departmentId, @RequestBody DepartmentDto updatedDepartment){
       DepartmentDto departmentDto= departmentService.updateDeparement(departmentId,updatedDepartment);
       return ResponseEntity.ok(departmentDto);
    }

    //Build  Delete Department REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartment(departmentId);
        return  ResponseEntity.ok("Department deleted Successfully");
    }
}
