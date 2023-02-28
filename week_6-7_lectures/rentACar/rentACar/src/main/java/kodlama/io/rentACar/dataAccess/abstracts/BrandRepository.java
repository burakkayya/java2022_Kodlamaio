package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer>{
	
	boolean existsByName(String name); //spring jpa keywords
}
