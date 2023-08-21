package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;

@RestController
public class studentController 
{
@PostMapping(value="insert")
public ResponseEntity<student> insert ()
{
	
}
}
