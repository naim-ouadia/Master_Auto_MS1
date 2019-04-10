/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.domain.model.Service.Impl;

import com.ncs.masterAuto.domain.bean.CategorieVoiture;
import com.ncs.masterAuto.domain.model.Service.CategorieVoitureService;
import com.ncs.masterAuto.domain.model.dao.CategorieVoitureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class CategorieVoitureServiceImpl implements CategorieVoitureService {

    @Autowired
    private CategorieVoitureDao categorieVoitureDao;

    //***** getters et setters ******//
    public CategorieVoitureDao getCategorieVoituredao() {
        return categorieVoitureDao;
    }

    public void setCategorieVoituredao(CategorieVoitureDao categorieVoituredao) {
        this.categorieVoitureDao = categorieVoituredao;
    }
//******************************************************************//

    @Override
    public CategorieVoiture findByNomCategorie(String nomCategorie) {
        return categorieVoitureDao.findByNomCategorie(nomCategorie);
    }

    @Override
    public int createCaategorie(CategorieVoiture categorieVoiture) {
        CategorieVoiture categorie = findByNomCategorie(categorieVoiture.getNomCategorie());
        if (categorie != null) {
            return -1;
        } else {
            categorieVoitureDao.save(categorieVoiture);
            return 1;
        }
    }

}
