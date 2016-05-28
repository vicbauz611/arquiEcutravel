/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ecutravel.asoaerolineas.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vicho
 */
@Entity
@Table(name = "transaccion_aerolinea")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransaccionAerolinea.findAll", query = "SELECT t FROM TransaccionAerolinea t"),
    @NamedQuery(name = "TransaccionAerolinea.findByTraCodigo", query = "SELECT t FROM TransaccionAerolinea t WHERE t.traCodigo = :traCodigo"),
    @NamedQuery(name = "TransaccionAerolinea.findByVuelo", query = "SELECT t FROM TransaccionAerolinea t WHERE t.vuelo = :vuelo"),
    @NamedQuery(name = "TransaccionAerolinea.findByNumeroAsiento", query = "SELECT t FROM TransaccionAerolinea t WHERE t.numeroAsiento = :numeroAsiento"),
    @NamedQuery(name = "TransaccionAerolinea.findByPersona", query = "SELECT t FROM TransaccionAerolinea t WHERE t.persona = :persona"),
    @NamedQuery(name = "TransaccionAerolinea.findByPaquete", query = "SELECT t FROM TransaccionAerolinea t WHERE t.paquete = :paquete")})
public class TransaccionAerolinea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tra_codigo")
    private String traCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "vuelo")
    private String vuelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_asiento")
    private int numeroAsiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "persona")
    private String persona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "paquete")
    private String paquete;
    @JoinColumn(name = "aer_codigo", referencedColumnName = "aer_codigo")
    @ManyToOne
    private Aerolinea aerCodigo;

    public TransaccionAerolinea() {
    }

    public TransaccionAerolinea(String traCodigo) {
        this.traCodigo = traCodigo;
    }

    public TransaccionAerolinea(String traCodigo, String vuelo, int numeroAsiento, String persona, String paquete) {
        this.traCodigo = traCodigo;
        this.vuelo = vuelo;
        this.numeroAsiento = numeroAsiento;
        this.persona = persona;
        this.paquete = paquete;
    }

    public String getTraCodigo() {
        return traCodigo;
    }

    public void setTraCodigo(String traCodigo) {
        this.traCodigo = traCodigo;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public Aerolinea getAerCodigo() {
        return aerCodigo;
    }

    public void setAerCodigo(Aerolinea aerCodigo) {
        this.aerCodigo = aerCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traCodigo != null ? traCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransaccionAerolinea)) {
            return false;
        }
        TransaccionAerolinea other = (TransaccionAerolinea) object;
        if ((this.traCodigo == null && other.traCodigo != null) || (this.traCodigo != null && !this.traCodigo.equals(other.traCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TransaccionAerolinea[ traCodigo=" + traCodigo + " ]";
    }
    
}
