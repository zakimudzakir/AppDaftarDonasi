/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdaftardonasi.Controllers.Interfaces;

import appdaftardonasi.Models.Donasi;
import java.util.List;

/**
 *
 * @author Razikk
 */
public interface DonasiInterface {
    
    public boolean create(Donasi donasi);
    
    public boolean update(Donasi donasi);
    
    public boolean delete(Donasi donasi);
    
    public List<Donasi> viewAll();
    
    public Donasi viewDonasi(String donasiID);
}
