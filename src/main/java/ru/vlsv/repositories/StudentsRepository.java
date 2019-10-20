package ru.vlsv.repositories;

import org.springframework.stereotype.Component;
import ru.vlsv.models.Student;

@Component
public class StudentsRepository {
    // Это заглушка, на самом деле достаем из БД
    public Student findOneById(Long id) {
        Student student = new Student();
        student.setFirstName("test" + id);
        student.setLastName("test" + id);
        return student;
    }
}
