/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author emers
 */
@Entity
@Table(name = "invitados")
@NamedQueries({
    @NamedQuery(name = "Invitado.findAll", query = "SELECT i FROM Invitado i"),
    @NamedQuery(name = "Invitado.findByInvRut", query = "SELECT i FROM Invitado i WHERE i.invRut = :invRut"),
    @NamedQuery(name = "Invitado.findByInvNombre", query = "SELECT i FROM Invitado i WHERE i.invNombre = :invNombre"),
    @NamedQuery(name = "Invitado.findByInvApellido1", query = "SELECT i FROM Invitado i WHERE i.invApellido1 = :invApellido1"),
    @NamedQuery(name = "Invitado.findByInvApellido2", query = "SELECT i FROM Invitado i WHERE i.invApellido2 = :invApellido2"),
    @NamedQuery(name = "Invitado.findByInvfechaNacimiento", query = "SELECT i FROM Invitado i WHERE i.invfechaNacimiento = :invfechaNacimiento")})
public class Invitado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "inv_rut")
    private String invRut;
    @Size(max = 2147483647)
    @Column(name = "inv_nombre")
    private String invNombre;
    @Size(max = 2147483647)
    @Column(name = "inv_apellido1")
    private String invApellido1;
    @Size(max = 2147483647)
    @Column(name = "inv_apellido2")
    private String invApellido2;
    @Column(name = "inv_fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date invfechaNacimiento;

    public Invitado() {
    }

    public Invitado(String invRut) {
        this.invRut = invRut;
    }

    public String getInvRut() {
        return invRut;
    }

    public void setInvRut(String invRut) {
        this.invRut = invRut;
    }

    public String getInvNombre() {
        return invNombre;
    }

    public void setInvNombre(String invNombre) {
        this.invNombre = invNombre;
    }

    public String getInvApellido1() {
        return invApellido1;
    }

    public void setInvApellido1(String invApellido1) {
        this.invApellido1 = invApellido1;
    }

    public String getInvApellido2() {
        return invApellido2;
    }

    public void setInvApellido2(String invApellido2) {
        this.invApellido2 = invApellido2;
    }

    public Date getInvfechaNacimiento() {
        return invfechaNacimiento;
    }

    public void setInvfechaNacimiento(Date invfechaNacimiento) {
        this.invfechaNacimiento = invfechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invRut != null ? invRut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invitado)) {
            return false;
        }
        Invitado other = (Invitado) object;
        if ((this.invRut == null && other.invRut != null) || (this.invRut != null && !this.invRut.equals(other.invRut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Invitado[ invRut=" + invRut + " ]";
    }
    
}
