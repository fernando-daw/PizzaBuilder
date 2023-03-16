package com.cod;

public class Pizzas {

    private int tipoMasa;
    private int size;
    private boolean rellena;
    private boolean jamonyork;
    private boolean cebolla;
    private boolean sinGluten;
    private int recojida;
    private boolean salsa;

    // tipo de masa
    public static final int FINA = 0;
    public static final int PAN = 1;

    // tamaño de la pizza
    public static final int peque = 0;
    public static final int mediana = 2;
    public static final int grande = 3;

    // recojida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas(){
        this.cebolla = false;
        this.recojida = TIENDA;
        this.rellena = false;
        this.sinGluten = false;
        this.size = mediana;
        this.tipoMasa = FINA;
        this.salsa=true;
        this.jamonyork=true;
    }

    /**
     * Constructor con todoa los parametros
     * @param tipoMasa espesor de la masa
     * @param size tamaño de la pizza
     * @param rellena si el borde esta relleno de queso
     * @param cebolla lleva o no lleva
     * @param sinGluten para celíacos
     * @param recojida como lo va a recoger el cliente
     */
    public Pizzas(int tipoMasa, int size, boolean rellena, boolean cebolla, boolean sinGluten, int recojida) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.recojida = recojida;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }

    public boolean isSalsa() {return salsa;}

    public void setSalsa(boolean salsa) {this.salsa = salsa;}

    public boolean isJamonyork() {
        return jamonyork;
    }

    public void setJamonyork(boolean jamonyork) {
        this.jamonyork = jamonyork;
    }
}
