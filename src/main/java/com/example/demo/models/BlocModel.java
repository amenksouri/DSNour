package com.example.demo.models;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Bloc")
public class BlocModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    
    private String nomBloc;
    private long capaciteBloc;
       
    
 

}