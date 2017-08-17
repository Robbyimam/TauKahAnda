package robbydeveloper.taukahanda;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;

/**
 * Created by User on 14/08/2017.
 */

public class AboutActivity extends AppCompatActivity{
    private TextView tvLinkify;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Tentang");
        }
        tvLinkify = (TextView) findViewById(R.id.tv_Linkify);
        tvLinkify.setText("robbyimam31@gmail.com\n");
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
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
