package com.springDonatien.springProj.studentMng.repositories;

import com.springDonatien.springProj.studentMng.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByFirstName(String xxx);
    List<Student> findByFirstNameAndLastName(String xxx,String yyy);
    List<Student> findByFirstNameOrLastName(String xxxx,String www);
    // Querry By HQL
    @Query(value = "select stb from Student stb where stb.firstName=:firstNameParam and stb.lastName=:lastNameParam")
    List<Student> findFirstNameAndLastNameHql(@Param("firstNameParam")String cdvdvdv,@Param("lastNameParam") String sdfjjhsdfhdfjh);
    // Querry By SQL
    @Query(value = "select * from student_tbl stb where stb.first_name=:firstNameParam and stb.last_name=:lastNameParam", nativeQuery = true)
    List<Student> findByFirstNameAndLastNameSql(@Param("firstNameParam")String firstName,@Param("lastNameParam")String lastName);
}
