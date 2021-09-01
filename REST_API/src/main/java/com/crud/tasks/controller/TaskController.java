package com.crud.tasks.controller;


import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks() {
        Object taskMapper;
        Object service;
        return taskMapper.mapToTaskDtoList(service.getAllTask());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public void deleteTask(@RequestParam Long taskId) {
        TaskController service;
        service.deleteTask(taskId);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTask")
    public TaskDto updateTask(@RequestBody TaskDto taskDto) {
        Object taskMapper;
        Object service;
        return taskMapper.mapToTaskDto(service.saveTask(taskMapper.mapToTask(taskDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTask", consumes = APPLICATION_JSON_VALUE)
    public void createTask(@RequestBody TaskDto taskDto) {
        Object service;
        Object taskMapper;
        service.saveTask(taskMapper.mapToTask(taskDto));

    }
}
