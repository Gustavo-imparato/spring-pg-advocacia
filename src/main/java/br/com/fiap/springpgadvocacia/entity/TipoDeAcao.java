package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.Column;
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
@Table( name = "TB_TIPO_DE_ACAO")
public class TipoDeAcao {

    @Column( name = "TIPO_DE_ACAO_ID")
    long id;

    @Column(name = "TIPO_DE_ACAO_NOME")
    String nome;

}
