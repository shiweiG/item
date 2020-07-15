package com.example.item.repository;

import com.example.item.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User,Integer> {
    @Query("from User u where u.id=:uid")
    List<User> List(@Param("uid") int uid);
    @Query("from User u where u.name=:uname")
    List<User>findByName (@Param("uname") String uname);
    @Query("from User u where u.name=:uname and u.id=:id")
    List<User>deleteByNameAndId(@Param("id")int id,@Param("uname")String uname);

    @Modifying
    @Query("update User u set u.name=:newname where u.id=:id")
    int update(@Param("id")int id,@Param("newname")String name);

}
/*
*  @Modifying
    @Query("update User07 u set u.name=:newname where u.id=:id")
    int update(@Param("id") int id, @Param("newname") String name);
* */