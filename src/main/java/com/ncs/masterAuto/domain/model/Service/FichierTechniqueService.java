/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.domain.model.Service;

import com.ncs.masterAuto.domain.bean.FichierTechnique;
import java.util.List;

/**
 *
 * @author wadie
 */
public interface FichierTechniqueService {

    public FichierTechnique addNewFichierTechnique(FichierTechnique fichierTechnique);

    public List<FichierTechnique> findAllFichierTechnique();

    public FichierTechnique findById(long id);

    public FichierTechnique upDateFichier(long id, FichierTechnique fichierTechnique);

    public void deleteFichier(Long id);
}
