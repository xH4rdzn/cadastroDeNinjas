package br.com.ircoelho.CadastroDeNinjas.Missoes;

import br.com.ircoelho.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String nome;

  private String rank;

  // Uma missão pode ter vários ninjas
  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninjas;

}
