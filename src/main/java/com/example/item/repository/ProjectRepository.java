package com.example.item.repository;

import com.example.item.entity.Project;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends BaseRepository<Project,Integer> {
@Query("from Project p where p.id=:id")
    List<Project>List(@Param("id")int id);
@Query("from Project p where p.name=:name")
    List<Project>findByName(@Param("name")String name);
@Query("from Project p where p.id=:id and p.name=:pname")
    List<Project>deleteByIdAndName(@Param("id")int id,@Param("pname")String pname);

@Modifying
    @Query("update Project p set p.name=:newname where p.id=:id")
    int update(@Param("id")int id,@Param("newname")String newname);
}
