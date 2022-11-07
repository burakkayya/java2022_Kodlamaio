package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.technology.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.technology.GetByIdTechnologyResponse;

@Service
public interface TechnologyService {

	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;

	void delete(DeleteTechnologyRequest createTechnologyRequest);

	void update(UpdateTechnologyRequest createTechnologyRequest);

	List<GetAllTechnologyResponse> getAll();

	GetByIdTechnologyResponse getById(int id);
}
