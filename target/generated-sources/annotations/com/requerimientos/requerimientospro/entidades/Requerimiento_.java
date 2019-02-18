package com.requerimientos.requerimientospro.entidades;

import com.requerimientos.requerimientospro.entidades.Ciudad;
import com.requerimientos.requerimientospro.entidades.Cliente;
import com.requerimientos.requerimientospro.entidades.Estado;
import com.requerimientos.requerimientospro.entidades.Orden;
import com.requerimientos.requerimientospro.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-18T06:54:51")
@StaticMetamodel(Requerimiento.class)
public class Requerimiento_ { 

    public static volatile SingularAttribute<Requerimiento, Cliente> cliente;
    public static volatile SingularAttribute<Requerimiento, Estado> estado;
    public static volatile SingularAttribute<Requerimiento, Date> fechaAsignacion;
    public static volatile SingularAttribute<Requerimiento, Ciudad> ciudad;
    public static volatile SingularAttribute<Requerimiento, Date> fechaVisita;
    public static volatile SingularAttribute<Requerimiento, String> observaciones;
    public static volatile SingularAttribute<Requerimiento, Usuario> usuario;
    public static volatile SingularAttribute<Requerimiento, Long> id;
    public static volatile SingularAttribute<Requerimiento, Orden> orden;
    public static volatile SingularAttribute<Requerimiento, String> telefonoContacto;

}