package com.mywebsite.database;

import com.mywebsite.database.Akun;
import com.mywebsite.database.Produk;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-06T17:48:58")
@StaticMetamodel(Keranjang.class)
public class Keranjang_ { 

    public static volatile SingularAttribute<Keranjang, Produk> idProduk;
    public static volatile SingularAttribute<Keranjang, Akun> idUser;
    public static volatile SingularAttribute<Keranjang, Integer> idKeranjang;
    public static volatile SingularAttribute<Keranjang, Date> tanggal;

}