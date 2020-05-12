package br.com.passardadosjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private Button button;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    button = findViewById(R.id.btnEnviar);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

        Usuario user = new Usuario ();

        user.setNome("Bruno Papait");
        user.setEmail("brunohpapait@gmail.com");
        user.setIdade(23);

        intent.putExtra("usuario", user);
        startActivity(intent);
      }
    });
  }
}
