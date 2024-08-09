package br.edu.ifpe.recife.gcms.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
	return "Hello, World";
	}
	
	@RequestMapping("/rinaldo")
	public @ResponseBody String greetingRinaldo() {
		return "Hello, Rinaldo!";
	}

	@RequestMapping("/teste")
	public @ResponseBody String greetingTeste() {
		return "Hello, Teste + Teste2!";
	}
	
	@RequestMapping("/hotfixmain")
	public @ResponseBody String greetingHotfixMain() {
		return "Hello, Hotfix na main!";
	}
}