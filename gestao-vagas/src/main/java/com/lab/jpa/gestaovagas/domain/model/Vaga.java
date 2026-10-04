package com.lab.jpa.gestaovagas.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity //marca a classe como uma entidade JPA (tabela no banco)
@Table(name = "BVagas")  //define o nome da tabela no banco de dados
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Vaga {
    @Id                                                /* define a chave primária
                                                     usando o padrão UUID (128 bits)*/
    @GeneratedValue (strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    private UUID id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(nullable = false)
    private double salario;

    @Column(name = "data_criacao", updatable = false)
    private LocalDateTime dataCriacao;

    @PrePersist //Método executado automaticamente antes de salvar no banco para preencher a data de criação
    public void onCreate(){
        if(this.dataCriacao == null){
            this.dataCriacao = LocalDateTime.now();
        }
    }
}
