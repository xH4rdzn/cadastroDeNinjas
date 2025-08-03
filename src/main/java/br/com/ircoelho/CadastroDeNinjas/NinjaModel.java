package br.com.ircoelho.CadastroDeNinjas;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String name;
  private String email;
  private int idade;

  public NinjaModel(String name, String email, int idade) {
    this.name = name;
    this.email = email;
    this.idade = idade;
  }

  public NinjaModel() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
