package com.truste.unicorn.dao;

import com.truste.unicorn.UnicornWebApplication;
import com.truste.unicorn.domain.Task;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UnicornWebApplication.class)
@WebAppConfiguration
public class TaskRepositoryTest
{
    @Autowired
    TaskRepository taskRepository;

    @Test
    public void contextLoads()
    {
        assertNotNull(taskRepository);
    }

    @Test
    public void saveTask()
    {
        Task task = Task.builder().description("First Task!!").build();

        Task savedTask = taskRepository.save(task);
        assertNotNull(savedTask.getId());
    }
}