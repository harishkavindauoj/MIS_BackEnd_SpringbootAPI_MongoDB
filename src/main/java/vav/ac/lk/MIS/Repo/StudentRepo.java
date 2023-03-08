package vav.ac.lk.MIS.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import vav.ac.lk.MIS.model.Student;

@Repository
	public interface StudentRepo extends MongoRepository<Student, Long>{

	}
