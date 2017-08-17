package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import robbydeveloper.taukahanda.R;

public class Quiz9Activity extends AppCompatActivity {
    EditText etBeijing;
    Button btnNext;
    int total, score8, score9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz9);
        etBeijing = (EditText) findViewById(R.id.etBeijing);
        btnNext = (Button)findViewById(R.id.btnNext);
        score8 = getIntent().getIntExtra("score8", 0);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans9 = etBeijing.getText().toString();
                if (ans9.equalsIgnoreCase("varanus komodoensis")){
                    score9 = 10;
                    total = score8 + score9;
                } else {
                    score9 = 0;
                    total = score8 + score9;
                }
                Intent intent = new Intent(getApplicationContext(), Quiz10Activity.class);
                intent.putExtra("score9",  total);
                startActivity(intent);
            }
        });

    }
}
