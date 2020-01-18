package com.example.u226;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

import org.w3c.dom.Text;

import java.util.Map;
import java.util.Iterator;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOk(View view) {
        final EditText tekstaLauks = (EditText)findViewById(R.id.vards);
        final String teksts = tekstaLauks.getText().toString();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int vertiba;
        char tekosaisSimbols;
        int skaits = 0;
        for (int i = 0; i < teksts.length(); i++) {
            tekosaisSimbols = teksts.charAt(i);
            vertiba = 1;
            skaits++;
            if(map.containsKey(tekosaisSimbols)){
                vertiba = map.get(tekosaisSimbols);
                vertiba++;
            }
            map.put(tekosaisSimbols,vertiba);
        }
        StringBuilder izvads = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        int biezums = 0;
        double peldosaisPunkts = 0.0;
        int paraVertiba;
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            paraVertiba = (int)pair.getValue();
            peldosaisPunkts = (double)((double)paraVertiba/skaits);
            biezums = (int)(peldosaisPunkts*100);
            izvads.append(String.format("%c-%d%%, ",pair.getKey(),biezums));
        }
        TextView izvadaLauks = (TextView)findViewById(R.id.textView);
        izvadaLauks.setText(izvads.toString());
    }
}
