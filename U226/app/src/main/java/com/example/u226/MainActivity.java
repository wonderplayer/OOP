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
        final EditText text = (EditText)findViewById(R.id.vards);
        final String myText = text.getText().toString();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int value;
        char currentCharacter;
        int characterCount = 0;
        for (int i = 0; i < myText.length(); i++) {
            currentCharacter = myText.charAt(i);
            value = 1;
            characterCount++;
            if(map.containsKey(currentCharacter)){
                value = map.get(currentCharacter);
                value++;
                characterCount--;
            }
            map.put(currentCharacter,value);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            sb.append(String.format("%c-%d, ",pair.getKey(),pair.getValue()));
        }
        TextView tw = (TextView)findViewById(R.id.textView);
        tw.setText(sb.toString());
    }
}
