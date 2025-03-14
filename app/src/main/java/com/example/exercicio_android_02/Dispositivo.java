package com.example.exercicio_android_02;

public abstract class Dispositivo {
    protected String nome;
    protected String marca;
    protected String modelo;
    protected String cor;
    protected boolean ligado;
    protected boolean volume;

    public Dispositivo(String nome, String marca, String modelo, String cor, boolean ligado, boolean volume) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = ligado;
        this.volume = volume;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void volumeUp();
    public abstract void volumeDown();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getVolume() {
        return volume;
    }

    public void setVolume(boolean volume) {
        this.volume = volume;
    }

}
