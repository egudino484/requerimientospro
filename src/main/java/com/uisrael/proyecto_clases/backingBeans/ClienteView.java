/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.proyecto_clases.backingBeans;

import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Usuario;
import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.UsuarioControlerImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author esanchez
 */
@ManagedBean
@ViewScoped
public class ClienteView implements Serializable {

    private Long txtidCliente;
    private Long txtidUsuario;
    List<Usuario> listaUsuarios;

    public Long getTxtidUsuario() {
        return txtidUsuario;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setTxtidUsuario(Long txtidUsuario) {
        this.txtidUsuario = txtidUsuario;
    }
    private String txtNombre;
    private String txtApellido;
    private String txtDireccion;
    private String txtTelefono;
    private String txtCorreo;
    private String txtMovil;

    public String getTxtMovil() {
        return txtMovil;
    }

    public void setTxtMovil(String txtMovil) {
        this.txtMovil = txtMovil;
    }

    public Long getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(Long txtUsuario) {
        this.txtUsuario = txtUsuario;
    }
    private String txtCi;
    private Long txtUsuario;
    private int txtEstado;
    private ClienteControlerImpl controlador;
    private UsuarioControlerImpl controladorUsuario;

    private Cliente objeto;
    private Cliente objetoSeleccionado;

    public String getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(String txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public Cliente getObjeto() {
        return objeto;
    }

    public void setObjeto(Cliente objeto) {
        this.objeto = objeto;
    }

    public Cliente getObjetoSeleccionado() {
        return objetoSeleccionado;
    }

    public void setObjetoSeleccionado(Cliente objetoSeleccionado) {
        this.objetoSeleccionado = objetoSeleccionado;
    }

    public ClienteView() {

    }

    @PostConstruct
    public void init() {
        objeto = new Cliente();
        objetoSeleccionado = new Cliente();
        controlador = new ClienteControlerImpl();
        controladorUsuario = new UsuarioControlerImpl();
        listaUsuarios = new ArrayList<>();
        cargarListas();

    }

    //cargar lista de usuarios , ordenes
    public void cargarListas() {
        try {
            listaUsuarios = controladorUsuario.findAll();
        } catch (Exception ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertarCiente() {
        objeto.setId(txtidCliente);
        objeto.setName(txtNombre);
        objeto.setApellidos(txtApellido);
        objeto.setDireccion(txtDireccion);
        objeto.setTelefono(txtTelefono);
        objeto.setCedula(txtCi);
        objeto.setCorreo(txtCorreo);
        objeto.setMovil(txtMovil);
        Usuario usuario = new Usuario();
        usuario.setId(txtidUsuario);
        objeto.setUsuario(usuario);

        try {
            controlador.insertCliente(objeto);
            System.out.println("sus datos fueron ingresados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void actualizar() {

        try {
            controlador.updateCliente(objetoSeleccionado);
            System.out.println("sus datos fueron actualizados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminar(Long code) {

        try {
            controlador.deleteCliente(code.intValue());
            System.out.println("sus datos fueron eliminados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Cliente> listar() {

        try {

            return controlador.findAll();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ArrayList<>();
        }

    }

    public void seleccionar(Long code) {
        try {
            System.out.println("id seleccionado:" + code);
            objetoSeleccionado = controlador.findClienteid(code.intValue()).get(0);
            System.err.println("termino de convertir: " + objetoSeleccionado);
        } catch (Exception ex) {
            Logger.getLogger(OrdenView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Long getTxtidCliente() {
        return txtidCliente;
    }

    public void setTxtidCliente(Long txtidCliente) {
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
        return controlador;
    }

    public void setClientecontroler(ClienteControlerImpl clientecontroler) {
        this.controlador = clientecontroler;
    }

    public Cliente getCliente() {
        return objeto;
    }

    public void setCliente(Cliente cliente) {
        this.objeto = cliente;
    }

}
