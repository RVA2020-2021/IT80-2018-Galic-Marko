package rva.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import rva.jpa.Departman;
import rva.jpa.Status;
import rva.jpa.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	Collection<Student> findByBrojIndeksaContainingIgnoreCase(String brojIndeksa);
	Collection<Student> findByStatus(Status s);
	Collection<Student> findByDepartman(Departman d);
}
