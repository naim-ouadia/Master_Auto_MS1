/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.domain.model.Service;

import com.ncs.masterAuto.domain.bean.MarqueVoiture;
import java.util.List;

/**
 *
 * @author wadie
 */
public interface MarqueVoitureService {

    public MarqueVoiture findByNomMarque(String nomMarque);

    public int createMarqueVoiture(MarqueVoiture marqueVoiture);

    public List<MarqueVoiture> findAll();
}
