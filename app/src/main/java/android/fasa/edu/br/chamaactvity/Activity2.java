package android.fasa.edu.br.chamaactvity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent it;
        Bundle b;

        it = getIntent();
        b = it.getExtras();


        setResult(b.getInt("Numero"));

    }
}
