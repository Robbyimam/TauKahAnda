package robbydeveloper.taukahanda.Quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import robbydeveloper.taukahanda.R;
import robbydeveloper.taukahanda.ResultActivity;

public class Quiz2Activity extends AppCompatActivity {

    MediaPlayer audioBackground;
    ToggleButton myToggle;
    EditText etKualaLumpur;
    Button btnNext;
    int total, score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        myToggle = (ToggleButton) findViewById(R.id.toggleSound);
        audioBackground = MediaPlayer.create(this, R.raw.goo);
        audioBackground.setLooping(true);
        audioBackground.setVolume(1,1);
        audioBackground.start();
        etKualaLumpur = (EditText) findViewById(R.id.etKualaLumpur);
        score1 = getIntent().getIntExtra("score1",0);

        btnNext = (Button)findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans2 = etKualaLumpur.getText().toString();
                if (ans2.equalsIgnoreCase("indonesia raya")){
                    score2 = 10;
                    total = score1 + score2;
                } else{
                    score2 = 0;
                    total = score1 + score2;
                }
                Intent intent = new Intent(getApplicationContext(), Quiz3Activity.class);
                intent.putExtra("score2",  total);
                startActivity(intent);
                audioBackground.stop();
            }

        });
    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
			/*Mematikan suara audio*/
            audioBackground.setVolume(0, 0);
        } else {
			/*Menghidupkan kembali audio background*/
            audioBackground.setVolume(1, 1);
        }
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        audioBackground.stop();
        finish();
    }
}
