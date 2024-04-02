package com.unifametro.apirestful.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifametro.apirestful.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		
		list.add(new Client(1L, "Matheus", "987.654.321-00", null, 15000.0));
		list.add(new Client(1L, "Miguel", "987.654.321-00", null, 18000.0));
		list.add(new Client(1L, "Auricelio", "987.654.321-00", null, 16000.0));
		list.add(new Client(1L, "Rafael", "987.654.321-00", null, 17000.0));
		
		return ResponseEntity.ok().body(list);
	}
}
