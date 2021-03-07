package com.mywebsite.database;

import com.mywebsite.database.Keranjang;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-06T17:48:58")
@StaticMetamodel(Akun.class)
public class Akun_ { 

    public static volatile SingularAttribute<Akun, Integer> idUser;
    public static volatile CollectionAttribute<Akun, Keranjang> keranjangCollection;
    public static volatile SingularAttribute<Akun, String> password;
    public static volatile SingularAttribute<Akun, String> namalengkap;
    public static volatile SingularAttribute<Akun, String> username;

}