package br.com.projetos.gabrielpessoa.kotlinspringbootcrud.repository

import br.com.projetos.gabrielpessoa.kotlinspringbootcrud.model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Long> {


}