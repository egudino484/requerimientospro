/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.backingBeans;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Requerimiento;
import com.requerimientos.requerimientospro.entidades.Usuario;
import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.OrdenControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.RequerimientoControlerImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

/**
 *
 * @author fernanda
 */
@ManagedBean
@ViewScoped
public class RequerimientoView implements Serializable {
    
    private Long txtid = 1l;
    
    private Date txtfechaAsignacion = new Date();
    private Date txtfechaVisita = new Date();
    private String txtobservaciones = "";
    private String txttelefonoContacto = "";
//relaciones 

    private Cliente cliente;
    private Usuario usuario;
    private Estado estado;
    private Orden orden;
    
    private Ciudad ciudad;
    
    private RequerimientoControlerImpl controller;
    private Requerimiento objeto;
    
    public RequerimientoView() {
        
    }
    
    @PostConstruct
    public void init() {
        objeto = new Requerimiento();
        controller = new RequerimientoControlerImpl();
        cliente = new Cliente();
        usuario = new Usuario();
        estado = new Estado();
        orden = new Orden();
        ciudad = new Ciudad();
    }
    
    public void insertar() {
        objeto.setId(txtid);
        objeto.setFechaAsignacion(txtfechaAsignacion);
        objeto.setFechaVisita(txtfechaVisita);
        objeto.setObservaciones(txtobservaciones);
        objeto.setTelefonoContacto(txttelefonoContacto);
        //setear relacioens con objetos 
       
        objeto.setUsuario(usuario);
        cliente.setUsuario(usuario);
        objeto.setCliente(cliente);
        objeto.setEstado(estado);
        objeto.setOrden(orden);
        objeto.setCiudad(ciudad);
        
        try {
            System.out.println("Objeto a ingresar: " + objeto.toString());
            
            controller.insert(objeto);
            System.out.println("Sus datos fueron ingresados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public List<Requerimiento> list(){
    
        try {
            return controller.findAll();
        } catch (Exception ex) {
            Logger.getLogger(RequerimientoView.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
        
    }
    public Long getTxtid() {
        return txtid;
    }
    
    public void setTxtid(Long txtid) {
        this.txtid = txtid;
    }
    
    public Date getTxtfechaAsignacion() {
        return txtfechaAsignacion;
    }
    
    public void setTxtfechaAsignacion(Date txtfechaAsignacion) {
        this.txtfechaAsignacion = txtfechaAsignacion;
    }
    
    public Date getTxtfechaVisita() {
        return txtfechaVisita;
    }
    
    public void setTxtfechaVisita(Date txtfechaVisita) {
        this.txtfechaVisita = txtfechaVisita;
    }
    
    public String getTxtobservaciones() {
        return txtobservaciones;
    }
    
    public void setTxtobservaciones(String txtobservaciones) {
        this.txtobservaciones = txtobservaciones;
    }
    
    public String getTxttelefonoContacto() {
        return txttelefonoContacto;
    }
    
    public void setTxttelefonoContacto(String txttelefonoContacto) {
        this.txttelefonoContacto = txttelefonoContacto;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Orden getOrden() {
        return orden;
    }
    
    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    
    public Ciudad getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    public RequerimientoControlerImpl getController() {
        return controller;
    }
    
    public void setController(RequerimientoControlerImpl controller) {
        this.controller = controller;
    }
    
    public Requerimiento getObjeto() {
        return objeto;
    }
    
    public void setObjeto(Requerimiento objeto) {
        this.objeto = objeto;
    }
    
}
