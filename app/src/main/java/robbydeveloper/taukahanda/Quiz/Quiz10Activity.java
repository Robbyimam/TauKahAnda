package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import robbydeveloper.taukahanda.R;
import robbydeveloper.taukahanda.ResultActivity;

public class Quiz10Activity extends AppCompatActivity {
    CheckBox cbNewDelhi, cbKathmandu, cbDhaka;
    Button btnSubmit;
    int total, score9, score10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz10);
        btnSubmit = (Button) findViewById(R.id.btnNext);
        cbNewDelhi = (CheckBox) findViewById(R.id.cbNewDelhi);
        cbKathmandu = (CheckBox) findViewById(R.id.cbKathmandu);
        cbDhaka = (CheckBox) findViewById(R.id.cbDhaka);

        score9 = getIntent().getIntExtra("score9", 0);


    }
    private  int countScore (boolean newdelhi, boolean dhaka){
        if (newdelhi){
            score10 = score10 + 5;
            total = score9 + score10;
        }
        if (dhaka){
            score10 = score10 + 5;
            total = score9 + score10;
        }
        return total;
    }

    public void next10 (View v){
        boolean newdelhi = cbNewDelhi.isChecked();
        boolean dhaka = cbDhaka.isChecked();
        int total = countScore(newdelhi, dhaka);
        Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
        intent.putExtra("score10", total);
        startActivity(intent);
    }
}
