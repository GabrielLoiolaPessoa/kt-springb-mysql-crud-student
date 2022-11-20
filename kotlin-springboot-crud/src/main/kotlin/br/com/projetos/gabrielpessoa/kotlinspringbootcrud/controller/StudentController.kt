package br.com.projetos.gabrielpessoa.kotlinspringbootcrud.controller

import br.com.projetos.gabrielpessoa.kotlinspringbootcrud.model.Student
import br.com.projetos.gabrielpessoa.kotlinspringbootcrud.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    @Autowired
    lateinit var studentService: StudentService


    //read
    @GetMapping("/allStudents")
    fun findAllStudents( ) : List<Student>{
        return studentService.findAllStudents()
    }
    //create
    @PostMapping("addStudent")
    fun  addStudent(@RequestBody addStudents:Student): Student {
        return studentService.addStudent(addStudents)
    }
    //delete
    @DeleteMapping("/deleteStudent")
    fun deleteStudent(@RequestBody dltStudent:Student) {
        return studentService.deleteStudent(dltStudent)
    }

    @PutMapping("/updateStudent")
    fun updateStudent(@RequestBody updtStudent:Student): Student {
        return studentService.updateStudent(updtStudent)
    }


}