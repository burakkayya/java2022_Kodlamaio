package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Repository
public interface TechnologyRepository  extends JpaRepository<Technology,Integer>{

}
