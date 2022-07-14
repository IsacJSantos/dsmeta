package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Message;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MessageRepository extends JpaRepository<Message, Long>{
	
	@Query("SELECT obj FROM Message obj ORDER BY obj.id DESC")
	Page<Message> findMessages(Pageable pageable);
}
