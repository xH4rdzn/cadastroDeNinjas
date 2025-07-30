package br.com.ircoelho.CadastroDeNinjas;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  UUID id;
  String name;
  String email;
  int idade;
}
