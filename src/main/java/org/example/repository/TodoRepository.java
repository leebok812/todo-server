package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository <TodoEntity, Long> { // 앞은 데이터베이스 테이블과 연결될 객체인 TodoEntity | 뒤는 해당 객체의 아이디 타입
}
