package lt.bit.Travel.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lt.bit.Travel.Services.TownsServices;

@Controller
public class TownsController {
	
	@Autowired
	TownsServices townsServices;
	
	@GetMapping("/towns")
	public String getTowns(@RequestParam("id") Integer id, Model model) {
		model.addAttribute("towns", townsServices.getCountryTowns(id));
		return "towns";
	}

}
