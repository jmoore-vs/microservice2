package com.example.microservice2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice2Controller {

	private static final Logger logger = LoggerFactory.getLogger(Microservice2Controller.class);
	
	@GetMapping("/microservice2/enviaRespuesta/{user}")
	public String enviaRespuesta(@PathVariable String user) {
		logger.info("microservice2 consumido por "+user);
		String resp = "hola "+user+", este es microservice2";
		return resp;
	}
	
}
