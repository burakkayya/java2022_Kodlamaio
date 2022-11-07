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
import kodlama.io.Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.language.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.language.GetByIdLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@PostMapping("/add")
	void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		languageService.add(createLanguageRequest);
	}

	@DeleteMapping("/delete")
	void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageService.delete(deleteLanguageRequest);
	}

	@PutMapping("/update")
	void update(UpdateLanguageRequest updateLanguageRequest) {
		languageService.update(updateLanguageRequest);
	}

	@GetMapping("/getall")
	List<GetAllLanguageResponse> getAll() {
		return languageService.getAll();
	}

	@GetMapping("/getbyid")
	GetByIdLanguageResponse getById(int id) {
		return languageService.getById(id);
	}

}
