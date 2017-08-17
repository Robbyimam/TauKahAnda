package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import robbydeveloper.taukahanda.R;
import robbydeveloper.taukahanda.ResultActivity;

public class Quiz4Activity extends AppCompatActivity {
    CheckBox cbBsb, cbDili, cbLarry,cbSteve;
    Button btnNext;
    int total, score3, score4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        score3 = getIntent().getIntExtra("score3", 0);


        cbBsb = (CheckBox) findViewById(R.id.cbBsb);
        cbDili = (CheckBox) findViewById(R.id.cbDili);
        cbLarry = (CheckBox) findViewById(R.id.cbLarry);
        cbSteve = (CheckBox) findViewById(R.id.cbSteve);
        btnNext = (Button)findViewById(R.id.btnNext);

        }

    private  int countScore (boolean dili, boolean Larry){
        if (dili){
            score4 = score4 + 5;
            total = score3 + score4;
        }
        if (Larry){
            score4 = score4 + 5;
            total = score3 + score4;
        }
        return total;
    }

    public void next3 (View v){
        boolean dili = cbDili.isChecked();
        boolean Larry = cbLarry.isChecked();
        int total = countScore(dili, Larry);
        Intent intent = new Intent(getApplicationContext(), Quiz5Activity.class);
        intent.putExtra("score4", total);
        startActivity(intent);
    }
}
