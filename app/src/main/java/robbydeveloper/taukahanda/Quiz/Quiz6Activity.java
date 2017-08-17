package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import robbydeveloper.taukahanda.R;
import robbydeveloper.taukahanda.ResultActivity;

public class Quiz6Activity extends AppCompatActivity {
    CheckBox cbsurabaya, cbKudus, cbBeijing ;
    Button btnNext;
    int total, score5, score6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);
        cbsurabaya = (CheckBox)findViewById(R.id.cbSurabaya);
        cbKudus = (CheckBox)findViewById(R.id.cbKudus);
        cbBeijing = (CheckBox)findViewById(R.id.cbBandung);

        score5 = getIntent().getIntExtra("score5", 0);

        btnNext = (Button)findViewById(R.id.btnNext);

    }
    private  int countScore (boolean surabaya, boolean Kudus){
        if (surabaya){
            score6 = score6 + 5;
            total = score5 + score6;
        }
        if (Kudus){
            score6 = score6 + 5;
            total = score5 + score6;
        }
        return total;
    }

    public void next6 (View v){
        boolean surabaya = cbsurabaya.isChecked();
        boolean Kudus = cbKudus.isChecked();
        int total = countScore(surabaya, Kudus);
        Intent intent = new Intent(getApplicationContext(),Quiz7Activity.class);
        intent.putExtra("score6", total);
        startActivity(intent);
    }
}
