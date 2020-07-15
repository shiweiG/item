package com.example.item.controller;

import com.example.item.entity.Project;
import com.example.item.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/item/")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    //添加项目
    @PostMapping("addProject")
    public Project addProject(@RequestBody Project project){
        return projectService.addProject(project);
    }
    //按照id查询项目
    @GetMapping("findProject/{id}")
    public Project  getProject(@PathVariable int id){
        return projectService.findProject(id);
    }
    //按照name查询项目
    @GetMapping("findProject1/{name}")
    public List<Project>findProject(@PathVariable String name){
        return projectService.findProject1(name);
    }
     //更新项目
    @PostMapping("updateProject")
    public Project updateProject(@RequestBody Project project){
        return projectService.updateProject(project);
    }


}
