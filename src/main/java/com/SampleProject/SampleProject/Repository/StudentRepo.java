package com.SampleProject.SampleProject.Repository;

import com.SampleProject.SampleProject.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String>{

}
