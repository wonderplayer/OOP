package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PiegadesCategoryActivity extends Activity {
    public static final String TEKSTS = "Adrese: Miķeļa iela 1, Rīga.\nZvaniet pa telefonu 256354781.\nPiegādes darba laiks \n P-P: 10:00-18:00 \n Se-Sv: Nepiegādā";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piegades);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(TEKSTS);

    }
}
