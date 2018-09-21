package com.minhquandkott.socissevent;

import android.arch.lifecycle.AndroidViewModel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnKQ(View view) {
        EditText editA = (EditText)
                findViewById(R.id.editA);
        int a = Integer.parseInt(editA.getText() + "");

        EditText editB = (EditText)
                findViewById(R.id.editB);
        int b = Integer.parseInt(editB.getText() + "");

        TextView textKQ = (TextView)
                findViewById(R.id.textKQ);
        textKQ.setText((a + b) + "");
    }
}
