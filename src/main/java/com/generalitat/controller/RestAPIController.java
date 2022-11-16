package com.generalitat.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.reactive.function.client.WebClient;
 
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException; 
import com.generalitat.controller.entities.ResultDemoStatus;

import io.netty.util.internal.StringUtil;

/**
 * Controller base para realizar la demo
 * 
 * @author skanc
 *
 */
@RestController
public class RestAPIController {
	Logger log = LogManager.getLogger(RestAPIController.class);

	@GetMapping("/echo")
	ResultDemoStatus echo() { 
		log.info("Entra en Echo!");
		return ResultDemoStatus.getStatusOK();
	} 
 
	@GetMapping("/sendParameter")
	ResultDemoStatus sendParameter(@RequestParam String parameter) throws JsonMappingException, JsonProcessingException { 
		log.info("Entra en sendParameter!");
		if (StringUtil.isNullOrEmpty(parameter))
			return ResultDemoStatus.getStatusKO("No hay parametro");
		else
			return ResultDemoStatus.getStatusOK();
	}

}