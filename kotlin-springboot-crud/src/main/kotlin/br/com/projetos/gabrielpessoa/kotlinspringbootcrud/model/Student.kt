package br.com.projetos.gabrielpessoa.kotlinspringbootcrud.model

import lombok.Data
import org.jetbrains.annotations.NotNull
import javax.persistence.*

@Entity
class Student(@Column(name= "name") val name:String,@Column(name= "age") val age: Int,@Column(name= "cpf") val cpf:String) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    val id: Long?= null
}