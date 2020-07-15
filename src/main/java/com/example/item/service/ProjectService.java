package com.example.item.service;

import com.example.item.entity.Project;
import com.example.item.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    public Project addProject(Project project){
        return projectRepository.save(project);
    }
    public Project findProject(int id){
        return projectRepository.findById(id).orElse(null);
    }
    public List<Project> findProject1(String name){
        return  projectRepository.findByName(name);
    }
    public Project updateProject(Project project){
        return projectRepository.save(project);
    }
}
