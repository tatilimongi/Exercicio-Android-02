package com.example.exercicio_android_02;

import android.util.Log;

public class Smartphone extends Dispositivo {
    private String sistemaOperativo;
    private boolean gpsAtivo;

    public Smartphone(String nome, String marca, String modelo, String cor, boolean ligado, boolean volume, String sistemaOperativo, boolean gpsAtivo) {
        super(nome, marca, modelo, cor, ligado, volume);
        this.sistemaOperativo = sistemaOperativo;
        this.gpsAtivo = gpsAtivo;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "gpsAtivo=" + getGpsAtivo() +
                ", nome='" + getNome() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", ligado=" + getLigado() +
                ", volume=" + getVolume() +
                ", sistemaOperativo='" + getSistemaOperativo() + '\'' +
                '}';
    }

    public void ligar() {
        if(!ligado){
            ligado = true;
            Log.i("SmartphoneLigado", "Ligando...");
        }else{
            Log.i("SmartphoneLigadoErro", "Smartphone já ligado.");
        }
    }

    public void desligar(){
        if(ligado){
            ligado = false;
            Log.i("SmartphoneDesligado", "Desligando o smartphone...");
        }else {
            Log.i("SmartphoneDesligadoErro", "Smartphone já desligado.");
        }
    }

    public void volumeUp(){
        if(!volume){
            volume = true;
            Log.i("SmartphoneVolumeUp", "Aumentando o volume...");
        }else{
            Log.i("SmartphoneVolumeDown", "Volume já está no mínimo.");
        }
    }

    public void volumeDown() {
        if (volume) {
            volume = false;
            Log.i("SmartphoneVolumeDown", "Diminuindo o volume...");
        } else {
            Log.i("SmartphoneVolumeUp", "Volume já está no máximo.");
        }
    }

    public void verificarSistemaOperativo(){
        Log.i("Smartphone", "Sistema Operativo: " + sistemaOperativo);
    }

    public void verificarGpsAtivo() {
        if (gpsAtivo) {
            Log.i("SmartphoneAtivado", "GPS ativado.");
        } else {
            Log.i("SmartphoneDesativado", "GPS desativado.");
        }
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean getGpsAtivo() {
        return gpsAtivo;
    }

    public void setGpsAtivo(boolean gpsAtivo) {
        this.gpsAtivo = gpsAtivo;
    }
}
