package com.mywebsite.database;

import com.mywebsite.database.Akun;
import com.mywebsite.database.Produk;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-09T16:25:02")
@StaticMetamodel(Keranjang.class)
public class Keranjang_ { 

    public static volatile SingularAttribute<Keranjang, Produk> idProduk;
    public static volatile SingularAttribute<Keranjang, Akun> idUser;
    public static volatile SingularAttribute<Keranjang, Integer> jumlah;
    public static volatile SingularAttribute<Keranjang, Integer> idKeranjang;
    public static volatile SingularAttribute<Keranjang, String> tanggal;

}