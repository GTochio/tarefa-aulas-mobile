package br.com.passardadosjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

//  private TextView nome, idade;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_segunda);

    TextView nome = findViewById(R.id.txtNome);
    TextView idade = findViewById(R.id.txtIdade);
    TextView email = findViewById(R.id.txtEmail);

    Bundle dados = getIntent().getExtras();
    String txtNome = dados.getString("nome");
    Integer txtIdade = dados.getInt("idade");
    Usuario user = (Usuario) dados.getSerializable("usuario");

    nome.setText(user.getNome());
    idade.setText(user.getIdade().toString());
    email.setText(user.getEmail());
  }
}
