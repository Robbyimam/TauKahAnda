package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import robbydeveloper.taukahanda.R;


public class Quiz5Activity extends AppCompatActivity {
    EditText etAmerika;
    Button btnNext;
    int total, score4, score5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        etAmerika = (EditText) findViewById(R.id.etAmerika);
        btnNext = (Button)findViewById(R.id.btnNext);
        score4 = getIntent().getIntExtra("score4", 0);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans5 = etAmerika.getText().toString();
                if (ans5.equalsIgnoreCase("washington dc")){
                    score5 = 10;
                    total = score4 + score5;
                }else{
                    score5 = 0;
                    total = score4 + score5;
                }
                Intent intent = new Intent(getApplicationContext(), Quiz6Activity.class);
                intent.putExtra("score5",  total);
                startActivity(intent);
            }
        });
    }
}
