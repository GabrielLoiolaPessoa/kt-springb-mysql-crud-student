package br.com.projetos.gabrielpessoa.kotlinspringbootcrud.service

import br.com.projetos.gabrielpessoa.kotlinspringbootcrud.model.Student
import br.com.projetos.gabrielpessoa.kotlinspringbootcrud.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService {


    @Autowired
    lateinit var studentRepository: StudentRepository

    fun findAllStudents( ) : List<Student>{
        return studentRepository.findAll()
    }

    fun findStudentById(id: Long): Optional<Student> {
        return studentRepository.findById(id)
    }

   fun  addStudent(addStudent:Student): Student {
        return studentRepository.save(addStudent)
   }

    fun deleteStudent(deleteStudent:Student) {
        return studentRepository.delete(deleteStudent)
    }

    fun updateStudent(updateStudent: Student):Student{
        return studentRepository.save(updateStudent)
    }


}

