package com.project.online_diary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.online_diary.dto.Event;

@RestController
public class DiaryController {
	@PostMapping("/add-event")
	public String addEvent(@RequestBody Event event) {
		return "event added succesfully";
	}
	@GetMapping("/get-events")
	public void getEvents(){
		
	}
}
