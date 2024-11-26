package com.noteapp.notely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class NotelyApplication {

    @GetMapping("/")
    public String redirectToAdmin() {
        return "redirect:/admin";
    }

    @GetMapping("/admin")
    public String homePage() {
        return "forward:/index.html";
    }

	public static void main(String[] args) {
		SpringApplication.run(NotelyApplication.class, args);
	}

}
