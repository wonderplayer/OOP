package com.example.coffeemachine;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] izvelne = {"Sprite", "Senču kvass", "Brojomi", "Somersby", "Hennesy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initiate();
    }
    private void Initiate(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < izvelne.length; i++){
            sb.append(String.format("%d. %s\n",(i + 1),izvelne[i]));
        }
        TextView tekstaLauks = findViewById(R.id.dzerieni);
        tekstaLauks.setText(sb.toString());
    }
    public void onClickOk(View view) {
        final EditText inputField = findViewById(R.id.izvele);
        final int input = Integer.parseInt(inputField.getText().toString());
        String output;
        if(input > 0 && input < 6){
            output = String.format("Jūs izvēlējāties '%s' dzērienu.",izvelne[input - 1]);
        }
        else {
            output = String.format("Jūs izvēlējāties nepareizo dzērienu!");
        }
        TextView outputField = findViewById(R.id.izveletaisVariants);
        outputField.setText(output);
    }
}
