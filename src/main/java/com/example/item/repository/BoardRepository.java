package com.example.item.repository;

import com.example.item.entity.Board;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends BaseRepository<Board,Integer>{
    @Query("from Board b where b.id=:bid")
    List<Board> List (@Param("bid")int bid);
    @Query("from Board b where b.position=:position and b.name=:bname")
    List<Board>findByNameAndPosition(@Param("bname")int bname,@Param("position") int position);
    @Query("from Board b where b.id=:id and b.name=:bname")
    List<Board> deleteByIdAndName(@Param("id")int id,@Param("bname")String bname);

    @Modifying
    @Query("update Board b set b.name=:newname where b.id=:id")
    int update(@Param("id")int id,@Param("newname") String newname);

    List<Board> findByNameAndPosition(String uname, String position);
}
