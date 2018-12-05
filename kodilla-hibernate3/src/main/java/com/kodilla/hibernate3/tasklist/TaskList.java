package com.kodilla.hibernate3.tasklist;

import com.kodilla.hibernate3.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASK_LISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;
    private List<Task> tasks = new ArrayList<>();

    public TaskList(){}

    public TaskList(String listName, String description){
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId(){
        return id;
    }

    @NotNull
    @Column(name = "LIST_NAME")
    public String getListName(){
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription(){
        return description;
    }

    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Task> getTasks(){
        return tasks;
    }

    private void setTasks(List<Task> tasks){
        this.tasks = tasks;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}