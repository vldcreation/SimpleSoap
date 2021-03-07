/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebsite.database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "keranjang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Keranjang.findAll", query = "SELECT k FROM Keranjang k")
    , @NamedQuery(name = "Keranjang.findByIdKeranjang", query = "SELECT k FROM Keranjang k WHERE k.idKeranjang = :idKeranjang")
    , @NamedQuery(name = "Keranjang.findByTanggal", query = "SELECT k FROM Keranjang k WHERE k.tanggal = :tanggal")})
public class Keranjang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_keranjang")
    private Integer idKeranjang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @JoinColumn(name = "id_produk", referencedColumnName = "id_produk")
    @ManyToOne(optional = false)
    private Produk idProduk;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private Akun idUser;

    public Keranjang() {
    }

    public Keranjang(Integer idKeranjang) {
        this.idKeranjang = idKeranjang;
    }

    public Keranjang(Integer idKeranjang, Date tanggal) {
        this.idKeranjang = idKeranjang;
        this.tanggal = tanggal;
    }

    public Integer getIdKeranjang() {
        return idKeranjang;
    }

    public void setIdKeranjang(Integer idKeranjang) {
        this.idKeranjang = idKeranjang;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Produk getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(Produk idProduk) {
        this.idProduk = idProduk;
    }

    public Akun getIdUser() {
        return idUser;
    }

    public void setIdUser(Akun idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKeranjang != null ? idKeranjang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Keranjang)) {
            return false;
        }
        Keranjang other = (Keranjang) object;
        if ((this.idKeranjang == null && other.idKeranjang != null) || (this.idKeranjang != null && !this.idKeranjang.equals(other.idKeranjang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mywebsite.database.Keranjang[ idKeranjang=" + idKeranjang + " ]";
    }
    
}
