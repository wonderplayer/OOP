package com.example.u227;

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

    private String[] pilsetas = new String[0];
    private int[][] attalumi = new int[0][0];

    public void onClickJPOK(View view){
        final EditText jp1 = (EditText)findViewById(R.id.jp1);
        final EditText jp2 = (EditText)findViewById(R.id.jp2);
        final String jp1Txt = jp1.getText().toString();
        final String jp2Txt = jp2.getText().toString();
        int jp1IDX = Contains(pilsetas, jp1Txt);
        int jp2IDX = Contains(pilsetas, jp2Txt);
        if(jp1IDX == -1){
            jp1IDX = pilsetas.length;
            CopyArrays();
            pilsetas[jp1IDX] = jp1Txt;
        }
        if(jp2IDX == -1){
            jp2IDX = pilsetas.length;
            CopyArrays();
            pilsetas[jp2IDX] = jp2Txt;
        }
        final EditText jpa = (EditText)findViewById(R.id.jpa);
        attalumi[jp1IDX][jp2IDX] = attalumi[jp2IDX][jp1IDX] = Integer.parseInt(jpa.getText().toString());
    }

    public void onClickAPOK(View view){
        final EditText ap1 = (EditText)findViewById(R.id.ap1);
        final EditText ap2 = (EditText)findViewById(R.id.ap2);
        int ap1IDX = Contains(pilsetas, ap1.getText().toString());
        int ap2IDX = Contains(pilsetas, ap2.getText().toString());
        TextView tw = (TextView)findViewById(R.id.apTxt);
        tw.setText(String.format("Attālums ir - %d",attalumi[ap1IDX][ap2IDX]));
    }

    public void onClickTPOK(View view){
        final EditText tp = (EditText)findViewById(R.id.tp);
        int tpIDX = Contains(pilsetas, tp.getText().toString());
        int current, currentIDX = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < pilsetas.length; i++){
            current = attalumi[tpIDX][i];
            if(current != 0 && min > current){
                min = current;
                currentIDX = i;
            }
        }
        TextView tw = (TextView)findViewById(R.id.tpTxt);
        tw.setText(String.format("Tuvāka pilsēta ir - %s", pilsetas[currentIDX]));
    }

    private void CopyArrays(){
        String[] temp = new String[pilsetas.length + 1];
        for(int i = 0; i < pilsetas.length; i++){
            temp[i] = pilsetas[i];
        }
        pilsetas = temp;
        int[][] temp2 = new int[attalumi.length + 1][attalumi.length + 1];
        for (int i = 0; i < attalumi.length; i++){
            for (int j = 0; j < attalumi.length; j++){
                temp2[i][j] = attalumi[i][j];
            }
        }
        attalumi = temp2;
    }

    private int Contains(String[] arr, String value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(value)) return i;
        }
        return -1;
    }
}
