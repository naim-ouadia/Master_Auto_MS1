/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.domain.rest;

import com.ncs.masterAuto.domain.bean.Rdv;
import com.ncs.masterAuto.domain.model.Service.RdvService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wadie
 */
@RestController
@RequestMapping("/master_Auto/Rdvs")
public class RdvRest {

    @Autowired
    private RdvService rdvService;

    @GetMapping("/id/{idClient}/id/{idVoiture}/date/{dateRdv}/com/{commentaire}")
    public Rdv createRdv(@PathVariable long idClient, @PathVariable long idVoiture, @PathVariable String dateRdv, @PathVariable String commentaire) {
        return rdvService.createRdv(idClient, idVoiture, dateRdv, commentaire);
    }

    @GetMapping("/listRdvsCient/{id}")
    public List<Rdv> findListRdvById(@PathVariable long id) {
        return rdvService.findListRdvById(id);
    }

    @GetMapping("/findListRdvByTechnicien/{id}")
    public List<Rdv> findByTechnicien(@PathVariable long id) {
        return rdvService.findByTechnicien(id);
    }

    @GetMapping("/mois/{mois}")
    public int rdvParMois(@PathVariable String mois) {
        return rdvService.rdvParMois(mois);
    }

    @GetMapping("/findllRdv")
    public List<Rdv> findAllRdv() {
        return rdvService.findAllRdv();
    }
}
