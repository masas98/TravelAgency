package lt.bit.Travel.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.bit.Travel.Entities.Towns;

public interface TownsRepository extends JpaRepository<Towns, Integer> {
	
	List<Towns> findByCountryId(Integer country_id);
}
