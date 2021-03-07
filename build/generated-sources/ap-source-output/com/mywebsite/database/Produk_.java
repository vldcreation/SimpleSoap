package com.mywebsite.database;

import com.mywebsite.database.Keranjang;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-06T17:48:58")
@StaticMetamodel(Produk.class)
public class Produk_ { 

    public static volatile SingularAttribute<Produk, Integer> idProduk;
    public static volatile CollectionAttribute<Produk, Keranjang> keranjangCollection;
    public static volatile SingularAttribute<Produk, String> namaProduk;
    public static volatile SingularAttribute<Produk, Integer> harga;
    public static volatile SingularAttribute<Produk, String> deskripsi;
    public static volatile SingularAttribute<Produk, Integer> jumlahProduk;

}