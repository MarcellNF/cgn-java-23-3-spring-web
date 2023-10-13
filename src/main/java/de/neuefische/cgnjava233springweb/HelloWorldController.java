package de.neuefische.cgnjava233springweb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}

	@PostMapping("/{name}/{name2}")
	@ResponseStatus(HttpStatus.CREATED)
	public String greetMe(@PathVariable String name, @PathVariable String name2){
		return "Hello " + name + " " + name2;
	}

	@DeleteMapping("/greet")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String greetMe2(
			@RequestParam String name,
			@RequestParam(required = false) String name2,
			@RequestParam(required = false) String name3
	){
		return "Hello " + name + ", " + name2 + ", " + name3 + ".";
	}
}
