package com.kampot.blog.repo;

import com.kampot.blog.models.Reviews;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Reviews, Long>
{

}
