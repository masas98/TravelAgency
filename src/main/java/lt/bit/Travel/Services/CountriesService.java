package lt.bit.Travel.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import lt.bit.Travel.Entities.Countries;
import lt.bit.Travel.Repositories.CountriesRepository;



@Service
public class CountriesService {
	
	@Autowired
	CountriesRepository countriesRepository;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	public List<Countries> getCountries(){
		return countriesRepository.findAll();
	}
	
	public Countries getCountrybyId(Integer id) {
		return countriesRepository.findById(id).orElse(null);
	}
	
	public void deleteCountry(Integer id) {
		countriesRepository.deleteById(id);
	}
	
	public Countries addCountry(Countries country) {
		return countriesRepository.save(country);
	}
	
	public Countries updateCountry(Countries country) {
		Countries old=this.getCountrybyId(country.getId());
		old.setTitle(country.getTitle());
		old.setDescription(country.getDescription());
		old.setDistance(country.getDistance());
		countriesRepository.save(old);
		return old;
	}

}
