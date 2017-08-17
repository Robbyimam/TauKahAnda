package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


import robbydeveloper.taukahanda.R;
import robbydeveloper.taukahanda.ResultActivity;


public class Quiz1Activity extends AppCompatActivity {

    RadioButton rbJakarta;
    Button btnNext;
    int score1,total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        btnNext = (Button)findViewById(R.id.btnNext);
        rbJakarta =(RadioButton)findViewById(R.id.rbJakarta);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean answer1;

                answer1 = rbJakarta.isChecked();
                if (answer1) {
                    score1= 10;
                    total = score1;
                } else {
                    score1 = 0;
                    total = score1;
                }

                Intent intent = new Intent(getApplicationContext(), Quiz2Activity.class);
                intent.putExtra("score1", total);
                startActivity(intent);

            }
        });
    }






    }








