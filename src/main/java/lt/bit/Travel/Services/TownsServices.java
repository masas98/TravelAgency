package lt.bit.Travel.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.bit.Travel.Entities.Towns;
import lt.bit.Travel.Repositories.TownsRepository;


@Service
public class TownsServices {
	
	@Autowired
	TownsRepository townsRepository;

	
	
	public List<Towns>getCountryTowns(Integer id){
		return townsRepository.findByCountryId(id);
		
	}
}
