package com.example.project_management_system.service;

import com.example.project_management_system.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service //
public class ProjectService {
    private final Map<Long, Project> store = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(1); //AtomicLong thread safe id generator

    public List<Project> findAll(){
        return new ArrayList<>(store.values());
    }

    public Optional<Project> findById(Long id)
    {
        return Optional.ofNullable(store.get(id));
    }

    public Project create(Project project){
        long id = (seq.getAndIncrement());
        project.setId(id);
        store.put(id, project);
        return project;
    }
}
