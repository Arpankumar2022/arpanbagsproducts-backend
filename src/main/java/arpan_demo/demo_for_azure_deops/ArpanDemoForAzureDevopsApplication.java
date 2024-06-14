package arpan_demo.demo_for_azure_deops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping(value="/v1/api/arpanDemoForAzureDevopsApplication")
public class ArpanDemoForAzureDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArpanDemoForAzureDevopsApplication.class, args);
	}
	@GetMapping("/getAll-AzureDevopsApplication")
	public ResponseEntity<String>  createAzureDevopsApplication(){
		return new ResponseEntity<>("This ai first azure devops application", HttpStatus.CREATED);
	}

}
