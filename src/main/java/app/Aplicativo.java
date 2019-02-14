///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package app;
//
//import com.requerimientos.requerimientospro.entidades.Cliente;
//import com.requerimientos.requerimientospro.entidades.Estado;
//import static com.requerimientos.requerimientospro.entidades.Requerimiento_.cliente;
//import com.requerimientos.requerimientospro.entidades.Usuario;
//import com.uisrael.proyecto_clases.controlador.controladorImpl.ClienteControlerImpl;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
///**
// *
// * @author Eddy
// */
//public class Aplicativo {
//
//    public static void main(String args[]) {
//
//    }
//
//    public static String initdb() {/*
//        try {
//            EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU");
//            EntityManager manager = objFactory.createEntityManager();
//            ClienteJpaController jpaController = new ClienteJpaController(objFactory);
//            Cliente cliente = new Cliente();
//            cliente.setName("juan");
//            cliente.setId(-1l);
//            jpaController.create(cliente);
//            List<Cliente> list = jpaController.findClienteEntities();
//            String result = "";
//            for (Cliente cliente1 : list) {
//                result += cliente1.toString();
//
//            }
//            return result;
//        } catch (Exception ex) {
//            Logger.getLogger(Aplicativo.class.getName()).log(Level.SEVERE, null, ex);
//            return "listavacia";
//        }*/
//        return "";
//
//    }
//
//    public static String conectar() {
//        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU");
//        EntityManager em = objFactory.createEntityManager();
//
//        Estado classtypeItem = new Estado();
//        //  classtypeItem.setId(1l);
//        classtypeItem.setDescripcion("inactivo4");
//        System.out.println("despues de crear entity");
//
//        em.getTransaction().begin();
//        em.persist(classtypeItem);
//
//        em.getTransaction().commit();
//        // em.flush();
//        System.out.println("ENTIDAD: " + classtypeItem.toString());
//        em.close();
//        return "succes: " + classtypeItem.toString();
//
//    }
//
//    public static String poblarDB() {
//        Usuario usuario = new Usuario();
//        usuario.setId(1L);
//        usuario.setUsername("edi");
//        usuario.setPassword("edi");
//        usuario.setNombres("edi");
//        usuario.setApellidos("edi");
//        usuario.setCedula("1234");
//        usuario.setDireccion("direcioion");
//        usuario.setTelefono("06545");
//
//        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("com.requerimientos_requerimientospro_war_1.0-SNAPSHOTPU");
//        EntityManager em = objFactory.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(usuario);
//        em.getTransaction().commit();
//        em.close();
//
//        ///------------------clientes
//        /* Cliente cliente = new Cliente();
//        cliente.setId(1l);
//        cliente.setName("edison");
//        cliente.setApellidos("gudino");
//        cliente.setCedula("1724157522");
//        cliente.setCorreo("edi@gmail.com");
//        cliente.setDireccion("ruminahui");
//        cliente.setMovil("00221245542");
//        cliente.setTelefono("213456789");
//        cliente.setUsuario(usuario);
//        ClienteControlerImpl clientecontroler = new ClienteControlerImpl();
//        clientecontroler.insertCliente(cliente);*/
//        return "success";
//    }
//
//}
