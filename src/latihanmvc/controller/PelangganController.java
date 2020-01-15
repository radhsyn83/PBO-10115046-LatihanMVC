/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvc.controller;

import javax.swing.JOptionPane;
import latihanmvc.model.PelangganModel;
import latihanmvc.view.PelangganView;

/**
 *
 * @author radhsyn83
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if(nama.equals("") && email.equals("") && noTelp.equals("")) {
            
        } else {
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if(nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih kosong");
        } else if(email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih kosong");
        } else if(noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp masih kosong");
        } else {
            model.simpanForm();
        }
        
    }
    
}
