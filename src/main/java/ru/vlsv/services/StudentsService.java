package ru.vlsv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vlsv.models.Student;
import ru.vlsv.repositories.StudentsRepository;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public Student getStudentById(Long id) {
        Student student = studentsRepository.findOneById(id);
        return student;
    }
}
