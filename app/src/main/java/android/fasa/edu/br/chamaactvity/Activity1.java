package android.fasa.edu.br.chamaactvity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    }

    public void chamaActivity(View v){
        Intent it = new Intent(getApplicationContext(),
                Activity2.class);

        //startActivity(it);
        Bundle b = new Bundle();
        b.putInt("Numero", 100);

        it.putExtras(b);

        startActivityForResult(it, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        txt = (TextView) findViewById(R.id.txt);

        txt.setText(String.valueOf(resultCode));


    }


}
