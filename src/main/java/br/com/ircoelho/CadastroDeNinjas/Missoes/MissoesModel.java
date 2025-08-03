package br.com.ircoelho.CadastroDeNinjas.Missoes;

import br.com.ircoelho.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String nome;

  private String rank;

  // Uma missão pode ter vários ninjas
  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninjas;

  public MissoesModel(String nome, String rank) {
    this.nome = nome;
    this.rank = rank;
  }

  public MissoesModel() {
  }

  public UUID getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getRank() {
    return rank;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }
}
