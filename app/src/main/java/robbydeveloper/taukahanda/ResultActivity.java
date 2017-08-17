package robbydeveloper.taukahanda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tvHasil, tvNama;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvHasil = (TextView)findViewById(R.id.tvRes);
        tvNama = (TextView) findViewById(R.id.txNama2);



        int total = getIntent().getIntExtra("score10",0);
        tvHasil.setText(""+total);
        if (total >=70){
            tvNama.setText("Selamat Anda Lulus");
        } else {
            tvNama.setText("Maaf anda Tidak LULUS");
        }

        btnReset = (Button)findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MenuActivity.class));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }
        if (item.getItemId() == R.id.exit) {
            System.exit(0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
