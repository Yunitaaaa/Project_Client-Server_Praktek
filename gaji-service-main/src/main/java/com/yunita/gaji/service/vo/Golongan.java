/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yunita.gaji.service.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Acer
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Golongan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long golonganId;
    private String golonganNama;
    private Long golonganGajiPokok;

}
