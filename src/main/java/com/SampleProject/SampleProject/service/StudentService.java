package com.SampleProject.SampleProject.service;

import com.SampleProject.SampleProject.Model.Student;
import com.SampleProject.SampleProject.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public void addStudent(Student student){
        studentRepo.save(student);
    }
    public Student getStudent( String id){
        return studentRepo.findById(id).orElse(null);
    }
    public List<Student> fetchStudents(){
        return studentRepo.findAll();
    }
    public void updateStudent(String id, Student student)
    {
        Optional<Student> students=studentRepo.findById(id);
        if(students.isPresent()) {
            students.get().setRno(student.getRno());
            students.get().setName(student.getName());
            students.get().setBranch(student.getBranch());
            studentRepo.save(students.get());
        }

    }
    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }


}
