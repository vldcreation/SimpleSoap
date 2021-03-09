/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebsite.database;

import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.registry.infomodel.User;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "akun")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Akun.findAll", query = "SELECT a FROM Akun a")
    , @NamedQuery(name = "Akun.findByIdUser", query = "SELECT a FROM Akun a WHERE a.idUser = :idUser")
    , @NamedQuery(name = "Akun.findByNamalengkap", query = "SELECT a FROM Akun a WHERE a.namalengkap = :namalengkap")
    , @NamedQuery(name = "Akun.findByUsername", query = "SELECT a FROM Akun a WHERE a.username = :username")
    , @NamedQuery(name = "Akun.findByPassword", query = "SELECT a FROM Akun a WHERE a.password = :password")})
public class Akun implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "namalengkap")
    private String namalengkap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "password")
    private String password;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private Collection<Keranjang> keranjangCollection;

    public Akun() {
    }

    public Akun(Integer idUser) {
        this.idUser = idUser;
    }

    public Akun(Integer idUser, String namalengkap, String username, String password) {
        this.idUser = idUser;
        this.namalengkap = namalengkap;
        this.username = username;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }


    @XmlTransient
    public Collection<Keranjang> getKeranjangCollection() {
        return keranjangCollection;
    }

    public void setKeranjangCollection(Collection<Keranjang> keranjangCollection) {
        this.keranjangCollection = keranjangCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Akun)) {
            return false;
        }
        Akun other = (Akun) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mywebsite.database.Akun[ idUser=" + idUser + " ]";
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
