package com.khjeon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khjeon.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
