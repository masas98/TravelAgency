package lt.bit.Travel.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lt.bit.Travel.Entities.Countries;
import lt.bit.Travel.Services.CountriesService;

@Controller
public class HomeController {
	
	@Autowired
	CountriesService countriesService;
	
	
	@GetMapping("/")
	public String workouts(Model model) {
		model.addAttribute("country", countriesService.getCountries());
		return "home"; 
	}
	
	@GetMapping("/updateCountry")
	public String showCountry(@RequestParam("id") Integer id, Model model) {
		model.addAttribute("country", countriesService.getCountrybyId(id));
		return "updateCountry";
	}
	
	@PostMapping ("/updateCountry")
	public String updateCountry(
			@Valid
			@ModelAttribute
			Countries country,
			BindingResult result, 
			Model model
			) {
		if(result.hasErrors()) {
			return "updateCountry";
		}
		countriesService.updateCountry(country);
		return "redirect:/";
	}
	
	@GetMapping("/deleteCountry")
	public String deleteWorkout(@RequestParam("id") Integer id) {
		countriesService.deleteCountry(id);
		return "redirect:/";
	}
	
	@GetMapping("/addCountry")
	public String addCountry(Model model) {
		model.addAttribute("country", new Countries());
		return "addCountry";
	}

	
	@PostMapping ("/addCountry")
	public String saveOwner(
			@Valid
			@ModelAttribute(name = "country")
			Countries country,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			return "addCountry";
		}
		countriesService.addCountry(country);
		return "redirect:/";
	}
	
}
