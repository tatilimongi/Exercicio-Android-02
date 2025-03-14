package com.example.exercicio_android_02;

import android.util.Log;

public class Computador extends Dispositivo{
    private String processador;
    private boolean monitor;

    public Computador(String nome, String marca, String modelo, String cor, boolean ligado, boolean volume, String processador, boolean monitor) {
        super(nome, marca, modelo, cor, ligado, volume);
        this.processador = processador;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + getProcessador() + '\'' +
                ", monitor=" + getMonitor() +
                ", nome='" + getNome() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", ligado=" + getLigado() +
                ", volume=" + getVolume() +
                '}';
    }

    public void ligar(){
        if(!ligado){
            ligado = true;
            Log.i("ComputadorDesligado", "Computador inicializando...");
        }else{
            Log.i("ComputadorLigado", "Computador já ligado");
        }
    }

    public void desligar(){
        if(ligado){
            ligado = false;
            Log.i("ComputadorDesligado", "Desligando o computador...");
        } else {
            Log.i("ComputadorDesligado", "Computador já desligado");
        }
    }

    public void volumeUp(){
        if(!volume){
            volume = true;
            Log.i("ComputadorVolumeUp", "Aumentando o volume...");
        }else{
            Log.i("ComputadorVolumeDown", "Volume já está no mínimo.");
        }
    }

    public void volumeDown() {
        if (volume) {
            volume = false;
            Log.i("ComputadorVolumeDown", "Diminuindo o volume...");
        } else {
            Log.i("ComputadorVolumeUp", "Volume já está no máximo.");
        }
    }

    public void ligarMonitor(){
        if(!monitor){
            monitor = true;
            Log.i("ComputadorMonitorLigado", "Ligando o monitor...");
        }else {
            Log.i("ComputadorMonitorLigadoErro", "Monitor já ligado");
        }
    }

    public void desligarMonitor() {
        if (monitor) {
            monitor = false;
            Log.i("ComputadorMonitorDesligado", "Desligando o monitor...");
        } else {
            Log.i("ComputadorMonitorDesligadoErro", "Monitor já desligado");
        }
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public boolean getMonitor() {
        return monitor;
    }

    public void setMonitor(boolean monitor) {
        this.monitor = monitor;
    }
}
