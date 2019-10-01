package wlfrotaneto.studio.com.dadosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random;
    Integer numero_dado;

    Button button_girar;
    ImageView image_dado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        button_girar = findViewById(R.id.button_girar);
        image_dado = findViewById(R.id.image_dado);

        button_girar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero_dado = random.nextInt(6) + 1;
                switch (numero_dado){
                    case 1:
                        image_dado.setImageResource(R.drawable.a);
                        break;
                    case 2:
                        image_dado.setImageResource(R.drawable.b);
                        break;
                    case 3:
                        image_dado.setImageResource(R.drawable.c);
                        break;
                    case 4:
                        image_dado.setImageResource(R.drawable.d);
                        break;
                    case 5:
                        image_dado.setImageResource(R.drawable.e);
                        break;
                    case 6:
                        image_dado.setImageResource(R.drawable.f);
                        break;
                }

            }
        });

    }
}
