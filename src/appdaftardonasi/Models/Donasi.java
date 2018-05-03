/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdaftardonasi.Models;

import java.util.Date;

/**
 *
 * @author Razikk
 */
public class Donasi {
    private Date tgl;
    private String namaDonatur;
    private double donasi;
    
    public Donasi(Date tgl, String namaDonatur, double donasi){
        this.tgl = tgl;
        this.namaDonatur = namaDonatur;
        this.donasi = donasi;
    }
    
    public void setTgl(Date tgl){
        this.tgl = tgl;
    }
    
    public void setNamaDonatur(String namaDonatur){
        this.namaDonatur = namaDonatur;
    }
    
    public void setDonasi(double donasi){
        this.donasi = donasi;
    }
    
    public Date getTgl(){
        return this.tgl;
    }
    
    public String getNamaDonatur(){
        return this.namaDonatur;
    }
    
    public double getDonasi(){
        return this.donasi;
    }

}
