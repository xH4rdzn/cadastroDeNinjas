package br.com.ircoelho.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MissoesRepository extends JpaRepository<MissoesModel, UUID> {
}
