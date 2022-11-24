package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.technology.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.technology.GetByIdTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {

		Language language = languageRepository.findById(createTechnologyRequest.getLanguageId()).get();
		Technology technology = new Technology();
		technology.setLanguage(language);
		technology.setName(createTechnologyRequest.getName());
		technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		Technology technology = technologyRepository.findById(deleteTechnologyRequest.getId()).get();
		technologyRepository.delete(technology);
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		Language language = languageRepository.findById(updateTechnologyRequest.getLanguageId()).get();
		Technology technology = technologyRepository.findById(updateTechnologyRequest.getId()).get();
		technology.setName(updateTechnologyRequest.getName());
		technology.setLanguage(language);
		technologyRepository.save(technology);
	}

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> technologiesResponse = new ArrayList<GetAllTechnologyResponse>();
		for (Technology technology : technologies) {
			GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			responseItem.setLanguageId(technology.getLanguage().getId());
			responseItem.setLanguageName(technology.getLanguage().getName());
			technologiesResponse.add(responseItem);
		}

		return technologiesResponse;
	}

	@Override
	public GetByIdTechnologyResponse getById(int id) {
		Optional<Technology> technology = technologyRepository.findById(id);
		GetByIdTechnologyResponse responseItem = new GetByIdTechnologyResponse();
		responseItem.setName(technology.get().getName());
		return responseItem;
	}

}
