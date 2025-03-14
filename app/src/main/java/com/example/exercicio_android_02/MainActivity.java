package com.example.exercicio_android_02;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Smartphone smartphone = new Smartphone("Celular", "Samsung", "Galaxy S21", "Roxo", true, false, "Android", false);
        Computador computador = new Computador("Notebook", "Dell", "Latitude 5420", "Preto", true, true, "Windows 10", true);

        smartphone.ligar();
        computador.ligar();

        smartphone.desligar();
        computador.desligar();

        smartphone.volumeUp();
        computador.volumeUp();

        smartphone.volumeDown();
        computador.volumeDown();

        smartphone.verificarSistemaOperativo();
        smartphone.verificarGpsAtivo();

        computador.ligarMonitor();
        computador.desligarMonitor();

        Log.i("SmartphoneInfo", smartphone.toString());
        Log.i("ComputadorInfo", computador.toString());

    }
}