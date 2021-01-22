/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aghniadewi.latihanmvcjdbc.event;

import edu.aghniadewi.latihanmvcjdbc.entity.Pelanggan;
import edu.aghniadewi.latihanmvcjdbc.model.PelangganModel;

/**
 * NIM  : 10119073
 * NAMA : AGHNIA DEWI MAHIRANIE
 * KELAS: IF-2
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
    
    
}
