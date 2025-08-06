package br.com.ircoelho.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NinjasRepository extends JpaRepository<NinjaModel, UUID> {
}
