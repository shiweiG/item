package com.example.item.entiy;

import com.example.item.entity.Board;
import com.example.item.entity.Project;
import com.example.item.entity.User;
import com.example.item.repository.BoardRepository;
import com.example.item.repository.ProjectRepository;
import com.example.item.repository.UserRepository;
import com.example.item.service.BoardService;
import com.example.item.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.mapping.ValueVisitor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class dataTest {
    @Autowired
    private  EntityManager manager;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private BoardService boardService;
    @Autowired
    private ProjectRepository projectRepository;
    @Test
    public void test_rel(){
        User u1=new User();
        u1.setName("姚世维");
        manager.persist(u1);

        Project p1=new Project();
        p1.setName("lol");
        manager.persist(p1);

        Project p2=new Project();
        p2.setName("dnf");
        manager.persist(p2);

        Board b1=new Board();
        b1.setName("项目经理");
        b1.setPlan("学习");
        manager.persist(b1);

    }

    @Test
    public void test_getUser1(){
      userRepository.findById(1);
      log.debug("{}",userRepository.getOne(1).getName());
    }
    @Test
    public void test_getUser(){
     userRepository.List(1).forEach(u->log.debug("{}",u.getName()));
    }
    @Test
    public void test_deleteUser(){
     userRepository.deleteById(2);
    }
    @Test
    public void test_board(){
        boardRepository.List(1).forEach(b->log.debug("{}",b.getName()));

    }
    @Test
    public void test_deleteBoard(){
        boardRepository.deleteById(1);
    }
    @Test
    public void test_updateBoard(){
        boardRepository.update(2,"项目经理");
    }
    @Test
    public void test_project(){
        projectRepository.List(2).forEach(p->log.debug("{}",p.getName()));
    }
    @Test
    public void test_deleteProject(){
        projectRepository.deleteById(1);
    }
    @Test
    public void test_updateProject(){
        projectRepository.update(2,"王者荣耀");
        log.debug("{}",projectRepository.getOne(2).getName());
    }

}

