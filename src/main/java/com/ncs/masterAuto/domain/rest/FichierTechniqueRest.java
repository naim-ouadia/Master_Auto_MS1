/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.domain.rest;

import com.ncs.masterAuto.domain.bean.FichierTechnique;
import com.ncs.masterAuto.domain.model.Service.FichierTechniqueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wadie
 */
@RestController
@RequestMapping("/master_Auto/FichierTechnique")
public class FichierTechniqueRest {

    @Autowired
    private FichierTechniqueService fichierTechniqueService;

    @PostMapping("/AddNewFichier")
    public int addNewFichierTechnique(@RequestBody FichierTechnique fichierTechnique) {
        return fichierTechniqueService.addNewFichierTechnique(fichierTechnique);
    }

    @GetMapping("/FindAllFichierTechnique")
    public List<FichierTechnique> findAllFichierTechnique() {
        return fichierTechniqueService.findAllFichierTechnique();
    }

    @GetMapping("/FindById/{id}")
    public FichierTechnique findById(@PathVariable Long id) {
        return fichierTechniqueService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteFichier(@PathVariable Long id) {
        return fichierTechniqueService.deleteFichier(id);
    }

}