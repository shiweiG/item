package com.example.item.service;

import com.example.item.entity.Project;
import com.example.item.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjeceService {
    @Autowired
    private ProjectRepository projectRepository;
    public Project getProject(Project project){
        return projectRepository.save(project);
    }
    public Project getProject(int id){
        return projectRepository.findById(id).orElse(null);
    }
    public void updateProject(Project project){
        projectRepository.save(project);
    }
}
