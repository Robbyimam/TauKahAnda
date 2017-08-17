package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import robbydeveloper.taukahanda.R;
import robbydeveloper.taukahanda.ResultActivity;

public class Quiz3Activity extends AppCompatActivity {
    RadioButton rbJerudong, rbKpBerukong, rbBSB;
    Button btnNext;
    int total, score2, score3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        score2 = getIntent().getIntExtra("score2", 0);


        rbBSB = (RadioButton)findViewById(R.id.rbBSB);
        btnNext = (Button)findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean answer1;

                answer1 = rbBSB.isChecked();
                if (answer1) {
                    score3= 10;
                    total = score2+score3;
                } else {
                    score3 = 0;
                    total = score2+score3;
                }
                Intent intent = new Intent(getApplicationContext(),Quiz4Activity.class);
                intent.putExtra("score3", total);
                startActivity(intent);
            }
        });
    }
}
