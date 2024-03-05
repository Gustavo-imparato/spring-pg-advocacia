package br.com.fiap.springpgadvocacia.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table( name = "TB_PROCESSO")
public class Processo {

    @Column(name = "PROCESSO_ID")
    long id;

    @Column(name = "PROCESSO_NOME")
    String numero;

    boolean proBono;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    Advogado advogado;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    TipoDeAcao tipoDeAcao;
}
