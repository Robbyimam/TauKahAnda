package robbydeveloper.taukahanda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import br.com.bloder.magic.view.MagicButton;
import robbydeveloper.taukahanda.Quiz.Quiz1Activity;


/**
 * Created by User on 15/08/2017.
 */

public class MenuActivity extends AppCompatActivity {

    TextView txNama;
    MagicButton btnMateri, btnTest, btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        txNama = (TextView)findViewById(R.id.txNama);
        btnMateri = (MagicButton)findViewById(R.id.magic_button);
        btnTest = (MagicButton)findViewById(R.id.magic_button2);
        btnAbout = (MagicButton)findViewById(R.id.magic_button3);


        Intent iiin= getIntent();
        Bundle bundle = iiin.getExtras();


        if(bundle!=null)
        {
            String j =(String) bundle.get("nama");
            txNama.setText("Hai! "+ j);

        }

        btnMateri.setMagicButtonClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MenuActivity.this, MateriActivity.class);
                startActivity(ii);

            }

        });

        btnTest.setMagicButtonClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MenuActivity.this, Quiz1Activity.class);
                startActivity(ii);
            }

        });


        btnAbout.setMagicButtonClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Intent ii=new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(ii);

            }

        });

    }


}
