package br.com.projetos.gabrielpessoa.kotlinspringbootcrud.controller

import br.com.projetos.gabrielpessoa.kotlinspringbootcrud.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    @Autowired
    lateinit var studentService: StudentService


    @GetMapping





}