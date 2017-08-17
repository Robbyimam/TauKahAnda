package robbydeveloper.taukahanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText editNama;
    Button btnLog;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNama = (EditText) findViewById(R.id.namaText);
        btnLog = (Button)findViewById(R.id.logButton);

        btnLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s=editNama.getText().toString();

                Intent ii=new Intent(MainActivity.this, MenuActivity.class);
                Intent iii=new Intent(MainActivity.this, ResultActivity.class);
                ii.putExtra("nama", s);
                iii.putExtra("nama", s);
                startActivity(ii);

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
