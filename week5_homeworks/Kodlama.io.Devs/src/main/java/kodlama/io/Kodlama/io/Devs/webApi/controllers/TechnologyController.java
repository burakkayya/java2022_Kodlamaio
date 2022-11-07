package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.technology.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.technology.GetByIdTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}

	@PostMapping("/add")
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologyService.add(createTechnologyRequest);
	}

	@DeleteMapping("/delete")
	void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyService.delete(deleteTechnologyRequest);
	}

	@PutMapping("/update")
	void update(UpdateTechnologyRequest updateTechnologyRequest) {
		technologyService.update(updateTechnologyRequest);
	}

	@GetMapping("/getall")
	List<GetAllTechnologyResponse> getAll() {
		return technologyService.getAll();
	}

	@GetMapping("/getbyid")
	GetByIdTechnologyResponse getById(int id) {
		return technologyService.getById(id);
	}

}
