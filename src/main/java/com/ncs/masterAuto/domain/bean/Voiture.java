/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.domain.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author wadie
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private MarqueVoiture marque;
    @ManyToOne
    private ModelVoiture model;
    @ManyToOne
    private CategorieVoiture categorie;
    @ManyToOne
    private TypeCarburant typeCarburant;

}
