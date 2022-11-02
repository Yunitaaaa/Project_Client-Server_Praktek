/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Yunita.peminjaman.service.repository;

import com.Yunita.peminjaman.service.entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long> {

    public Peminjaman findByPeminjamanId(Long peminjamanId);

}
