package com.nogal.nogal.Solicitudes.Modelos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solicitud")
public class Solicitud{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_solicitud")
    private long id;

    @Column(name="id_tecnico")
    private long tecnico;

    @Column(name="id_usuario", updatable=false)
    private long cliente;

    @Column(name="monto")
    private long monto;

    @Column(name="direccion", updatable=false)
    private String direccion;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name="latitud", updatable=false)
    private float latitud;

    @Column(name="longitud", updatable=false)
    private float longitud;

    @Column(name="asunto", updatable=false)
    private String asunto;

    @Column(name="categoria", updatable=false)
    private String categoria;

    @Column(name="descripcion", updatable=false)
    private String descripcion;
    
    @Column(name="aceptada_cli")
    private boolean aceptada_cli = false;

    @Column(name="aceptada_fecha")
    private boolean aceptada_fecha = false;

    @Column(name = "aceptada_adm")
    private boolean aceptadaAdm = false;

    @Column(name = "aceptada_tec")
    private boolean aceptada_tec = false;

    public Solicitud() {

    }

    public Solicitud(long id, long tecnico, long cliente, long monto, String direccion, Date fecha, String asunto, String categoria, 
            String descripcion, float latitud, float longitud,
            boolean aceptada_cli, boolean aceptada_fecha, boolean aceptadaAdm, boolean aceptada_tec) {
        this.id = id;
        this.tecnico = tecnico;
        this.cliente = cliente;
        this.monto = monto;
        this.direccion = direccion;
        this.fecha = fecha;
        this.latitud = latitud;
        this.longitud = longitud;
        this.asunto = asunto;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.aceptada_cli = aceptada_cli;
        this.aceptada_fecha = aceptada_fecha;
        this.aceptadaAdm = aceptadaAdm;
        this.aceptada_tec = aceptada_tec;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(long tecnico) {
        this.tecnico = tecnico;
    }

    public long getCliente() {
        return this.cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public boolean isAceptada_cli() {
        return aceptada_cli;
    }

    public void setAceptada_cli(boolean aceptada_cli){
        this.aceptada_cli = aceptada_cli;
    }

    public boolean isAceptada_fecha() {
        return this.aceptada_fecha;
    }

    public void setAceptada_fecha(boolean aceptada_fecha) {
        this.aceptada_fecha = aceptada_fecha;
    }
    
    public boolean isAceptadaAdm() {
        return aceptadaAdm;
    }

    public void setAceptada_adm(boolean aceptadaAdm){
        this.aceptadaAdm= aceptadaAdm;
    }

    public boolean isAceptada_tec() {
		return aceptada_tec;
    }

    public void setAceptada_tec(boolean aceptada_tec){
        this.aceptada_tec = aceptada_tec;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

