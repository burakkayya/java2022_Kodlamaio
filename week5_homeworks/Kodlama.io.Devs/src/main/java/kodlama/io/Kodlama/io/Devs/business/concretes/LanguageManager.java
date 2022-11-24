package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.language.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.language.GetByIdLanguageResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	private TechnologyRepository technologyRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository, TechnologyRepository technologyRepository) {
		super();
		this.languageRepository = languageRepository;
		this.technologyRepository = technologyRepository;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {

		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		if (!language.getName().isEmpty()) {
			for (int i = 0; i < languageRepository.findAll().size(); i++) {
				if (languageRepository.findAll().get(i).getName().equalsIgnoreCase(language.getName())) {
					throw new Exception("Programlama dili ismi tekrar edemez!");
				}
			}

			languageRepository.save(language);
		} else {
			throw new Exception("Programlama dili ismi boş olamaz!");
		}

	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		Language language = languageRepository.findById(deleteLanguageRequest.getId()).get();
		technologyRepository.deleteAll(language.getTechnologies());
		languageRepository.delete(language);

	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		Language language = languageRepository.findById(updateLanguageRequest.getId()).get();
		language.setName(updateLanguageRequest.getName());
		languageRepository.save(language);

	}

	@Override
	public List<GetAllLanguageResponse> getAll() {

		List<Language> languages = languageRepository.findAll();
		List<Technology> technologies = technologyRepository.findAll();

		List<GetAllLanguageResponse> languagesResponse = new ArrayList<GetAllLanguageResponse>();
		for (Language language : languages) {
			GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
			for (Technology technology : technologies) {
				if (technology.getLanguage().getId() == language.getId()) {
					if (!language.getTechnologies().contains(technology)) {
						language.getTechnologies().add(technology);
					}

				}
			}
			responseItem.setTechnologies(language.getTechnologies());
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponse.add(responseItem);
		}

		return languagesResponse;
	}

	@Override
	public GetByIdLanguageResponse getById(int id) {
		Optional<Language> language = languageRepository.findById(id);
		GetByIdLanguageResponse languageResponse = new GetByIdLanguageResponse();
		languageResponse.setName(language.get().getName());

		return languageResponse;
	}

}
