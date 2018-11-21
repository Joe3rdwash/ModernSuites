package FinalProj.ModernSuites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {


    private ImageView startaction;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);


        startaction =(ImageView)findViewById(R.id.btnStart);




        startaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(WelcomeActivity.this, DetailActivty.class);
                startActivity(it);
            }
        });





    }
}
