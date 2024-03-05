package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table( name = "TB_ESTADO")
public class Estado {

    int id;

    String nome;

    String sigla;
}
