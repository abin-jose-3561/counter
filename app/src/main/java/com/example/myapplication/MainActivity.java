package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     int c = 0;
    TextView tcount, treset;
    Button btplus, btminus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tcount = findViewById(R.id.txcount);
        treset = findViewById(R.id.txreset);
        btplus = findViewById(R.id.txb2);
        btminus = findViewById(R.id.txb1);

          btminus.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(c!=0) {
                      c = c - 1;
                      tcount.setText(c + "");
                  }
                  }

              });

           btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            c=c+1;
            tcount.setText(c+"");
            }
          });

           treset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            c=0;
            tcount.setText(c+"");
            }
        });
    }
}