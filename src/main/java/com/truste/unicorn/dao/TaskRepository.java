package com.truste.unicorn.dao;

import com.truste.unicorn.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer>
{
}
