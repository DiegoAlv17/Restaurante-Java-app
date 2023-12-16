/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ACER
 */
public class FacDeta {
    private String id_facdeta;
    private String idp;
    private String np;
    private int ct;
    private Double prec;
    private String tp;

    
    public String getIdp() {
        return idp;
    }
    public void setIdp(String idp) {
        this.idp = idp;
    }
    public String getNp() {
        return np;
    }
    public void setNp(String np) {
        this.np = np;
    }
    public int getCt() {
        return ct;
    }
    public void setCt(int ct) {
        this.ct = ct;
    }
    public String getTp() {
        return tp;
    }
    public void setTp(String tp) {
        this.tp = tp;
    }

    /**
     * @return the prec
     */
    public Double getPrec() {
        return prec;
    }

    /**
     * @param prec the prec to set
     */
    public void setPrec(Double prec) {
        this.prec = prec;
    }

    /**
     * @return the id_facdeta
     */
    public String getId_facdeta() {
        return id_facdeta;
    }

    /**
     * @param id_facdeta the id_facdeta to set
     */
    public void setId_facdeta(String id_facdeta) {
        this.id_facdeta = id_facdeta;
    }
    
    
}
