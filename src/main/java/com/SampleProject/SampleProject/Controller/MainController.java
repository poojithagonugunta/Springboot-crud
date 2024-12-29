package com.SampleProject.SampleProject.Controller;

import com.SampleProject.SampleProject.Model.Student;
import com.SampleProject.SampleProject.Repository.StudentRepo;
import com.SampleProject.SampleProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }

    @GetMapping("/fetchStudents")
    public List<Student> fetchStudents() {
        return studentService.fetchStudents();
    }

    @PutMapping("/updateStudent/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student student) {
         studentService.updateStudent(id,student);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }

}
