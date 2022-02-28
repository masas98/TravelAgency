package lt.bit.Travel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.bit.Travel.Entities.Countries;


public interface CountriesRepository extends JpaRepository<Countries, Integer>{
	

}
