/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebsite.database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "produk3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produk.findAll", query = "SELECT p FROM Produk p")
    , @NamedQuery(name = "Produk.findByIdProduk", query = "SELECT p FROM Produk p WHERE p.idProduk = :idProduk")
    , @NamedQuery(name = "Produk.findByNamaProduk", query = "SELECT p FROM Produk p WHERE p.namaProduk = :namaProduk")
    , @NamedQuery(name = "Produk.findByJumlahProduk", query = "SELECT p FROM Produk p WHERE p.jumlahProduk = :jumlahProduk")
    , @NamedQuery(name = "Produk.findByHarga", query = "SELECT p FROM Produk p WHERE p.harga = :harga")})
public class Produk implements Serializable {

    @Size(max = 256)
    @Column(name = "nama_produk")
    private String namaProduk;
    @Lob
    @Size(max = 65535)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Column(name = "harga")
    private Integer harga;
    @Column(name = "jumlah_Produk")
    private Integer jumlahProduk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduk")
    private Collection<Keranjang> keranjangCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produk")
    private Integer idProduk;

    public Produk() {
    }

    public Produk(Integer idProduk) {
        this.idProduk = idProduk;
    }

    public Produk(Integer idProduk, String namaProduk, Integer harga) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public Integer getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(Integer idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public Integer getJumlahProduk() {
        return jumlahProduk;
    }

    public void setJumlahProduk(Integer jumlahProduk) {
        this.jumlahProduk = jumlahProduk;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduk != null ? idProduk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produk)) {
            return false;
        }
        Produk other = (Produk) object;
        if ((this.idProduk == null && other.idProduk != null) || (this.idProduk != null && !this.idProduk.equals(other.idProduk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mywebsite.database.Produk[ idProduk=" + idProduk + " ]";
    }


    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }



    @XmlTransient
    public Collection<Keranjang> getKeranjangCollection() {
        return keranjangCollection;
    }

    public void setKeranjangCollection(Collection<Keranjang> keranjangCollection) {
        this.keranjangCollection = keranjangCollection;
    }


    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
}
