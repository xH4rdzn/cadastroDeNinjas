package br.com.ircoelho.CadastroDeNinjas.Ninjas;

import br.com.ircoelho.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;

  @Column(unique = true)
  private String email;

  private int idade;

  // Um ninja pode ter uma única missão
  @ManyToOne
  @JoinColumn(name = "missoes_id")
  private MissoesModel missoes;


}
