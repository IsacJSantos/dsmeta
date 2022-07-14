package com.devsuperior.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Message;
import com.devsuperior.dsmeta.repositories.MessageRepository;


@Service
public class MessageService {

	@Autowired
	MessageRepository messageRepo;

	public Page<Message> findMessages(Pageable pageable) {
		return messageRepo.findMessages(pageable);
	}

	public void sendMessage(Long id) {
		Message message = messageRepo.findById(id).get();
		
	}
}
