package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import robbydeveloper.taukahanda.R;

public class Quiz7Activity extends AppCompatActivity {
    CheckBox cbSingapore, cbPhomPenh, cbBangkok;
    Button btnNext;
    int total, score6, score7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);
        cbSingapore = (CheckBox) findViewById(R.id.cbSingapore);
        cbPhomPenh = (CheckBox) findViewById(R.id.cbPhomPenh);
        cbBangkok = (CheckBox) findViewById(R.id.cbBangkok);

        score6 = getIntent().getIntExtra("score6", 0);

        btnNext = (Button)findViewById(R.id.btnNext);

    }
    private  int countScore (boolean singapore, boolean bangkok){
        if (singapore){
            score7 = score7 + 5;
            total = score6 + score7;
        }
        if (bangkok){
            score7 = score7 + 5;
            total = score6 + score7;
        }

        return total;
    }

    public void next7 (View v){
        boolean singapore = cbSingapore.isChecked();
        boolean bangkok = cbBangkok.isChecked();
        int total = countScore(singapore, bangkok);
        Intent intent = new Intent(getApplicationContext(),Quiz8Activity.class);
        intent.putExtra("score7", total);
        startActivity(intent);
    }
}
