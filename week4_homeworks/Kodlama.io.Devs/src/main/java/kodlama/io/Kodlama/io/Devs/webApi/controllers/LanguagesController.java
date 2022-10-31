package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@PostMapping("/add")
	void add(Language language) throws Exception {
		languageService.add(language);
	}

	@DeleteMapping("/delete")
	void delete(Language language) {
		languageService.delete(language);
	}

	@PutMapping("/update")
	void update(Language language) {
		languageService.update(language);
	}

	@GetMapping("getall")
	List<Language> getAll() {
		return languageService.getAll();
	}

	@GetMapping("getbyid")
	Language getById(int id) {
		return languageService.getById(id);
	}

}
