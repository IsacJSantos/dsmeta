package com.devsuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Message;
import com.devsuperior.dsmeta.services.MessageService;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

	@Autowired
	MessageService msgService;

	@GetMapping
	public Page<Message> findMessage(Pageable pageable) {
		return msgService.findMessages(pageable);
	}

	@GetMapping("/{id}/sendMessage")
	public void SendMessage(@PathVariable Long id) {
		msgService.sendMessage(id);
	}
}
