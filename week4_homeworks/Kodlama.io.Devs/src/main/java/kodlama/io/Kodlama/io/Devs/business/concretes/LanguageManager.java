package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) throws Exception {
		if (!language.getName().isEmpty()) {
			for (int i = 0; i < languageRepository.getAll().size(); i++) {
				if (languageRepository.getAll().get(i).getName().equalsIgnoreCase(language.getName())) {
					throw new Exception("Programlama dili ismi tekrar edemez!");
				}
			}
			languageRepository.add(language);
		} else {
			throw new Exception("Programlama dili ismi boş olamaz!");
		}
		
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);

	}

	@Override
	public void update(Language language) {
		languageRepository.update(language);

	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		// TODO Auto-generated method stub
		return languageRepository.getById(id);
	}

}
