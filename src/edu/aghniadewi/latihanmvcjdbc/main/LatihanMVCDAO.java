/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aghniadewi.latihanmvcjdbc.main;

import edu.aghniadewi.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.aghniadewi.latihanmvcjdbc.entity.Pelanggan;
import edu.aghniadewi.latihanmvcjdbc.error.PelangganException;
import edu.aghniadewi.latihanmvcjdbc.service.PelangganDao;
import edu.aghniadewi.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 * NIM  : 10119073
 * NAMA : AGHNIA DEWI MAHIRANIE
 * KELAS: IF-2
 */
public class LatihanMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable(){ 
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
