/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdaftardonasi.Controllers.Functions;

import appdaftardonasi.Controllers.Interfaces.DonasiInterface;
import appdaftardonasi.Models.Donasi;
import java.util.List;

/**
 *
 * @author Razikk
 */
public class DonasiFunction implements DonasiInterface{

    @Override
    public boolean create(Donasi donasi) {
        return false;
    }

    @Override
    public boolean update(Donasi donasi) {
        return false;
    }

    @Override
    public boolean delete(Donasi donasi) {
        return false;
    }

    @Override
    public List<Donasi> viewAll() {
        return null;
    }

    @Override
    public Donasi viewDonasi(String donasiID) {
        return null;
    }
    
}
