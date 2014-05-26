/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

import java.util.List;

/**
 *
 * @author maurogarcia
 */
public class Cliente {
    
    private int cuil;
    private String domicilio;
    private String razonSocial;
    private List<Pedido> lstPedidos;

    public Cliente(int cuil, String domicilio, String razonSocial, List<Pedido> lstPedidos) {
        this.cuil = cuil;
        this.domicilio = domicilio;
        this.razonSocial = razonSocial;
        this.lstPedidos = lstPedidos;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Pedido> getLstPedidos() {
        return lstPedidos;
    }

    public void setLstPedidos(List<Pedido> lstPedidos) {
        this.lstPedidos = lstPedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cuil=" + cuil + ", domicilio=" + domicilio + ", razonSocial=" + razonSocial + ", lstPedidos=" + lstPedidos + '}';
    }
    
    
    
}
