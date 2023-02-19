package com.id.proj.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.id.proj.model.*;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
    
}
