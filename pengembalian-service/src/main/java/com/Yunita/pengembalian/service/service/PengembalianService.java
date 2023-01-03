/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Yunita.pengembalian.service.service;

import com.Yunita.pengembalian.service.VO.Peminjaman;
import com.Yunita.pengembalian.service.VO.ResponseTemplateVo;
import com.Yunita.pengembalian.service.entity.Pengembalian;
import com.Yunita.pengembalian.service.repository.PengembalianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author acer
 */
@Service
public class PengembalianService {

    @Autowired
    private PengembalianRepository pengembalianRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Pengembalian savePengembalian(Pengembalian pengembalian) {
        return pengembalianRepository.save(pengembalian);
    }

    public ResponseTemplateVo getPengembalian(Long pengembalianId) {
        ResponseTemplateVo vo = new ResponseTemplateVo();
        Pengembalian pengembalian = 
                pengembalianRepository.findByPengembalianId(pengembalianId);

        Peminjaman peminjaman = 
                restTemplate.getForObject("http://localhost:9003/pengembalian/" + pengembalian.getPeminjamanId(), Peminjaman.class);

        vo.setPeminjaman(peminjaman);
        vo.setPengembalian(pengembalian);
        return vo;
    }

}
