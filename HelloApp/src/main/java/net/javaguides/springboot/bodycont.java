package net.javaguides.springboot;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/")
	public class bodycont {
		
		@GetMapping("/body")
		public String helloWithBody(@RequestBody String name) {
		    return "Hello, " + name;
		}
	}