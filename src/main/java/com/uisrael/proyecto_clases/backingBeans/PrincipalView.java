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
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author esanchez
 */
@Named(value = "principalView")
@Dependent
public class PrincipalView {

    /**
     * Creates a new instance of ClienteManagedBean
     */
    public PrincipalView() {
    }

   

  

    public static String conectar() {
        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU2");
        EntityManager em = objFactory.createEntityManager();
        em.getTransaction().begin();
        //crear ESTADOS -------------
        Estado estado = new Estado();
        //  classtypeItem.setId(1l);
        estado.setDescripcion("activo");
        em.persist(estado);
        em.getTransaction().commit();//commit
        System.out.println("Despues de crear estados");
        System.out.println("ENTIDAD: " + estado.toString());

        //crear ORDENES-------------
        Orden orden = new Orden();
        //  classtypeItem.setId(1l);
        orden.setDescripcion("Orden de compra macbook pro");
        em.getTransaction().begin();
        em.persist(orden);
        em.getTransaction().commit();//commit
        System.out.println("Despues de crear ordenes");
        System.out.println("ENTIDAD: " + orden.toString());

        //crear CIUDADES-------------
        Ciudad ciudad = new Ciudad();
        //  classtypeItem.setId(1l);
        ciudad.setDescripcion("Quito");
        em.getTransaction().begin();
        em.persist(ciudad);
        em.getTransaction().commit();//commit

        Ciudad ciudad1 = new Ciudad();
        //  classtypeItem.setId(1l);
        ciudad1.setDescripcion("Guayaquil");
        em.getTransaction().begin();
        em.persist(ciudad1);
        em.getTransaction().commit();//commit
        System.out.println("Despues de crear ciudades");
        System.out.println("ENTIDAD: " + ciudad.toString());
        System.out.println("ENTIDAD: " + ciudad1.toString());

        //CREAR USUARIOS-------------
        Usuario usuario = new Usuario(1l, "usuario", "123", "usuario", "usuarioapellido", "centro", "2154", "17001");
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();//commit
        System.out.println("Despues de crear usuarios");
        System.out.println("ENTIDAD: " + usuario.toString());

        //crear clientes-------------
        Cliente cliente = new Cliente(1l, "juan", "perez", "real", "02225", "1725210001", "ed@gmail.com", "09999453", usuario);
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();//commit
        System.out.println("Despues de crear clientes");
        System.out.println("ENTIDAD: " + cliente.toString());

        //crear requerimiento ----------
        Requerimiento req = new Requerimiento();
        req.setId(1l);
        req.setFechaAsignacion(new Date());
        req.setFechaVisita(new Date());
        req.setObservaciones("No enciende");
        req.setTelefonoContacto("022557825");
        req.setCiudad(ciudad);
        req.setCliente(cliente);
        req.setEstado(estado);
        req.setOrden(orden);
        req.setUsuario(usuario);
        em.getTransaction().begin();
        em.persist(req);
        em.getTransaction().commit();//commit
        System.out.println("Despues de crear requerimientos");
        System.out.println("ENTIDAD: " + req.toString());

        // FIN DE LLENADO DE LA BASE DE DATOS
        System.out.println("Cerrando Entity Manager");

        em.close();
       // objFactory.close();
        return "succes: " + estado.toString();

    }
}
