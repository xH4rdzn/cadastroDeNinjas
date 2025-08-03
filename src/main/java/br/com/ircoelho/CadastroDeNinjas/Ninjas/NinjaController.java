package br.com.ircoelho.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

  @GetMapping("/hello")
  public String boasVindas() {
    return "Hello World !";
  }

}
