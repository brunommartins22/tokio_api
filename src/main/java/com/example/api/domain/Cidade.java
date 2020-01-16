package com.example.api.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Bruno Martins
 */
@Entity
public class Cidade implements Serializable {

    @Id   
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cMun")
    private Long id;
    
    @NotNull
    private String xmun;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Estado cuF;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.eurus.erp.padrao.models.Cidade[ id=" + getId() + " ]";
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the xmun
     */
    public String getXmun() {
        return xmun;
    }

    /**
     * @param xmun the xmun to set
     */
    public void setXmun(String xmun) {
        this.xmun = xmun;
    }

    /**
     * @return the cuF
     */
    public Estado getCuF() {
        return cuF;
    }

    /**
     * @param cuF the cuF to set
     */
    public void setCuF(Estado cuF) {
        this.cuF = cuF;
    }


}
