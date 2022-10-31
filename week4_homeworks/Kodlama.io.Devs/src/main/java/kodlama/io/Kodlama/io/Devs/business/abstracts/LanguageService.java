package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public interface LanguageService {

	void add(Language language) throws Exception;

	void delete(Language language);

	void update(Language language);

	List<Language> getAll();

	Language getById(int id);

}
