package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C"));
		languages.add(new Language(2, "C++"));
		languages.add(new Language(3, "C#"));
		languages.add(new Language(4, "Java"));
		languages.add(new Language(5, "Python"));
		languages.add(new Language(6, "JavaScript"));
	}

	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public void delete(Language language) {
		Language languageToDelete = null;
		for (int i = 0; i < languages.size(); i++) {
			if (language.getId() == languages.get(i).getId()) {
				languageToDelete = languages.get(i);
			}
		}
		languages.remove(languageToDelete);

	}

	@Override
	public void update(Language language) {
		Language languageToUpdate = null;
		for (int i = 0; i < languages.size(); i++) {
			if (language.getId() == languages.get(i).getId()) {
				languageToUpdate = languages.get(i);
			}
		}
		languageToUpdate.setId(language.getId());
		languageToUpdate.setName(language.getName());
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getById(int id) {
		for (int i = 0; i < languages.size(); i++) {
			if (languages.get(i).getId() == id) {
				return languages.get(i);
			}
		}
		return null;
	}

}
