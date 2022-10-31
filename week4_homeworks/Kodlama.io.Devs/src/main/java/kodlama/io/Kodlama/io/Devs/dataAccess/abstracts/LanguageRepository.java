package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public interface LanguageRepository {

	void add(Language language);

	void delete(Language language);

	void update(Language language);

	List<Language> getAll();

	Language getById(int id);

}
