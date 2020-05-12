package br.com.fragments.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import br.com.fragments.R;
import br.com.fragments.fragment.ContatosFragment;
import br.com.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //REMOVER SOMBRA DA ACTION BAR
    getSupportActionBar().setElevation(0);

    final ConversasFragment conversaFragment = new ConversasFragment();
    final ContatosFragment contatoFragment = new ContatosFragment();
    Button btnConverssa = new Button(this);
    Button btnContato = new Button(this);

    btnContato = findViewById(R.id.btnContato);
    btnConverssa = findViewById(R.id.btnConversa);

    // CONFIGURAR OBJETO PARA O FRAGMENT
    getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.frameConteudo, conversaFragment)
            .commit();

    btnContato.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameConteudo, contatoFragment)
                .commit();
      }
    });

    btnConverssa.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameConteudo, conversaFragment)
                .commit();
      }
    });
  }
}
