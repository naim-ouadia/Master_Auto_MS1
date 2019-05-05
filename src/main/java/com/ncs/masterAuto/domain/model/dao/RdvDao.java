/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncs.masterAuto.domain.model.dao;

import com.ncs.masterAuto.domain.bean.Rdv;
import com.ncs.masterAuto.domain.bean.Technicien;
import com.ncs.masterAuto.domain.bean.UserAccount;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wadie
 */
@Repository
public interface RdvDao extends JpaRepository<Rdv, Long> {

    public Rdv findByDateRdv(Date dateRdv);

    public Rdv findByUserAccount(UserAccount userAccount);

    public Rdv findByTechnicien(Technicien technicien);

}
