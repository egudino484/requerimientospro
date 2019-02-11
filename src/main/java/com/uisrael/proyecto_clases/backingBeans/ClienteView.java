/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.backingBeans;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author fernanda
 */
@ManagedBean
@ViewScoped
public class ClienteView implements Serializable {

    private String txtidCliente;
    private String txtNombre;
    private String txtApellido;
    private String txtDireccion;
    private String txtTelefono;
    private String txtCi;
    private int txtEstado;
    private ClienteControlerImpl clientecontroler;
    private Cliente cliente;

    public ClienteView() {

    }

    @PostConstruct
    public void init() {
        cliente = new Cliente();
        clientecontroler = new ClienteControlerImpl();
    }

    public void insertarCiente() {
        cliente.setId(-1l);
        cliente.setName(txtNombre);
        cliente.setApellidos(txtApellido);
        cliente.setDireccion(txtDireccion);
        cliente.setTelefono(txtTelefono);
        cliente.setCedula(txtCi);
        

        try {
            clientecontroler.insertCliente(cliente);
            System.out.println("sus datos fueron ingresados");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public String getTxtidCliente() {
        return txtidCliente;
    }

    public void setTxtidCliente(String txtidCliente) {
        this.txtidCliente = txtidCliente;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(String txtApellido) {
        this.txtApellido = txtApellido;
    }

    public String getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(String txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public String getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(String txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public String getTxtCi() {
        return txtCi;
    }

    public void setTxtCi(String txtCi) {
        this.txtCi = txtCi;
    }

    public int getTxtEstado() {
        return txtEstado;
    }

    public void setTxtEstado(int txtEstado) {
        this.txtEstado = txtEstado;
    }

    public ClienteControlerImpl getClientecontroler() {
        return clientecontroler;
    }

    public void setClientecontroler(ClienteControlerImpl clientecontroler) {
        this.clientecontroler = clientecontroler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
