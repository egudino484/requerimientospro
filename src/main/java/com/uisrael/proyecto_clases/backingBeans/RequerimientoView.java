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
import com.uisrael.proyecto_clases.controlador.controladorImpl.CiudadControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.EstadoControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.OrdenControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.RequerimientoControlerImpl;
import com.uisrael.proyecto_clases.controlador.controladorImpl.UsuarioControlerImpl;
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
 * @author esanchez
 */
@ManagedBean
@ViewScoped
public class RequerimientoView implements Serializable {

    private Long id;

    private Date fechaAsignacion;
    private Date fechaVisita;
    private String observaciones;
    private String telefonoContacto;
//relaciones 

    private Cliente cliente;
    private Usuario usuario;
    private Estado estado;
    private Orden orden;

    private Ciudad ciudad;

    private RequerimientoControlerImpl controlador;
    private Requerimiento objeto, objetoSeleccionado;
    private List<Usuario> listaUsuarios;
    private List<Ciudad> listaCiudades;
    private List<Estado> listaEstados;
    private List<Orden> listaOrdenes;
    private List<Cliente> listaClientes;

    private UsuarioControlerImpl controladorUsuario;
    private CiudadControlerImpl controladorCiudad;
    private EstadoControlerImpl controladorEstado;
    private OrdenControlerImpl controladorOrden;
    private ClienteControlerImpl controladorCliente;

    public RequerimientoView() {

    }

    @PostConstruct
    public void init() {
        objeto = new Requerimiento();
        objetoSeleccionado = new Requerimiento();
        controlador = new RequerimientoControlerImpl();
        ciudad = new Ciudad();
        orden = new Orden();
        estado = new Estado();
        cliente = new Cliente();
        usuario = new Usuario();
        //
        fechaAsignacion = new Date();
        fechaVisita = new Date();
        listaUsuarios = new ArrayList<>();
        controladorUsuario = new UsuarioControlerImpl();
        controladorCiudad = new CiudadControlerImpl();
        controladorEstado = new EstadoControlerImpl();
        controladorOrden = new OrdenControlerImpl();
        controladorCliente = new ClienteControlerImpl();
        cargarListas();
    }

    //cargar lista de usuarios , ordenes
    public void cargarListas() {
        try {
            listaUsuarios = controladorUsuario.findAll();
            listaCiudades = controladorCiudad.findAll();
            listaEstados = controladorEstado.findAll();
            listaOrdenes = controladorOrden.findAll();
            listaClientes = controladorCliente.findAll();

        } catch (Exception ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Requerimiento> list() {

        try {
            return controlador.findAll();
        } catch (Exception ex) {
            Logger.getLogger(RequerimientoView.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }

    }

    public void insertar() {
        objeto.setId(-1l);
        objeto.setFechaAsignacion(new Date());
        objeto.setFechaVisita(new Date());
        objeto.setObservaciones(observaciones);
        objeto.setTelefonoContacto(telefonoContacto);
        objeto.setCliente(cliente);
        objeto.setUsuario(usuario);
        objeto.setEstado(estado);
        objeto.setOrden(orden);
        objeto.setCiudad(ciudad);

        try {
            controlador.insert(objeto);
            System.out.println("Sus datos fueron ingresados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void actualizar() {
        

        try {
            controlador.update(objetoSeleccionado);
            System.out.println("Sus datos fueron modiificados");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminar(Long code) {
      

        try {
            controlador.delete(code);
            System.out.println("Se elimino");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void seleccionar(Long code) {
        try {
            System.out.println("id seleccionado:" + code);
            objetoSeleccionado = controlador.findByid(code.intValue()).get(0);
            System.err.println("termino de convertir: " + objetoSeleccionado);
        } catch (Exception ex) {
            Logger.getLogger(OrdenView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Requerimiento getObjetoSeleccionado() {
        return objetoSeleccionado;
    }

    public void setObjetoSeleccionado(Requerimiento objetoSeleccionado) {
        this.objetoSeleccionado = objetoSeleccionado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
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

    public Requerimiento getObjeto() {
        return objeto;
    }

    public void setObjeto(Requerimiento objeto) {
        this.objeto = objeto;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(List<Ciudad> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public List<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

}
