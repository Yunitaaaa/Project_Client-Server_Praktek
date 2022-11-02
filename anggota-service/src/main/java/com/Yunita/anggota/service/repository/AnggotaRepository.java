/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Yunita.anggota.service.repository;

import com.Yunita.anggota.service.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author acer
 */
public interface AnggotaRepository extends JpaRepository<Anggota, Long>{
    public Anggota findByAnggotaId(Long anggotaId);
    
}
