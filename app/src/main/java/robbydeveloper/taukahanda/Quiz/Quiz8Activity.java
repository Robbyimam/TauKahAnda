package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import robbydeveloper.taukahanda.R;

public class Quiz8Activity extends AppCompatActivity {
    RadioButton rbHCM, rbKSR, rbPhomPenh;
    Button btnNext;
    int total, score7, score8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz8);

        score7 = getIntent().getIntExtra("score7", 0);

        rbHCM = (RadioButton)findViewById(R.id.rbHCM);
        rbKSR = (RadioButton)findViewById(R.id.rbKSR);
        rbPhomPenh = (RadioButton)findViewById(R.id.rbPhomPenh);

        btnNext = (Button)findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean answer1;

                answer1 = rbPhomPenh.isChecked();
                if (answer1) {
                    score8= 10;
                    total = score7+score8;
                } else {
                    score7 = 0;
                    total = score7+score8;
                }
                rbPhomPenh.isChecked();
                Intent intent = new Intent(getApplicationContext(),Quiz9Activity.class);
                intent.putExtra("score8", total);
                startActivity(intent);
            }
        });
    }
}
