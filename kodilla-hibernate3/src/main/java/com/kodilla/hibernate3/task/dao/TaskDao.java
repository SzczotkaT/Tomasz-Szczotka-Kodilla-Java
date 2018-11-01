package com.kodilla.hibernate3.task.dao;

import com.kodilla.hibernate3.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);

    @Query
    List<Task> retriveLongTasks();

    @Query
    List<Task> retriveShortTasks();

    @Query(nativeQuery = true)
    List<Task> retriveTasksWithEnoughTime();

    @Query
    List<Task> retriveTasksWithDurationLongerThan(@Param("DURATION") int duration);
}
