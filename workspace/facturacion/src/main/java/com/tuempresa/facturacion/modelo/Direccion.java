package com.tuempresa.facturacion.modelo;
 
import javax.persistence.*;

import lombok.*;
 
@Embeddable // Usamos @Embeddable en vez de @Entity
@Getter @Setter
public class Direccion {
 
 
    @Column(length = 5)
    int codigoPostal;
 
    @Column(length = 30)
    String provincia;
    
    @Column(length = 30)
    String ciudad;
    
    @Column(length = 30) // Los miembros se anotan igual que en las entidades
    String callePrincipal;
    
    @Column(length = 30) // Los miembros se anotan igual que en las entidades
    String calleSecundaria;
}