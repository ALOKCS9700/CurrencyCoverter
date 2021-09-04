package com.example.currencycoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,candollar,ausdollar,dinar,dollar,yen,bitcoin,rubel,pound;
    EditText editText;
    TextView textView,Headerinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.euro);
        dinar=findViewById(R.id.dinar);
        dollar=findViewById(R.id.dollar);
        ausdollar=findViewById(R.id.ausdollar);
        pound=findViewById(R.id.pound);
        bitcoin=findViewById(R.id.bitcoin);
        yen=findViewById(R.id.yan);
        candollar=findViewById(R.id.candodallar);
        rubel=findViewById(R.id.rubel);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        Headerinfo=findViewById(R.id.textView2);





        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Euro");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*0.012;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));


                }
            }
        });



        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Russian Dinar");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*0.0041;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Dollar");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*0.014;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });


        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To  Australian Dollar");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*0.019;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Pounds");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*0.0099;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });


        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Bitcoin");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*0.000000278;
                    DecimalFormat numberformate=new DecimalFormat("#.0000");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Japanese Yen");

                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*1.49;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Canadian Dollar ");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*0.017;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=editText.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    editText.setError("Empty User Input");
                }else{
                    Headerinfo.setText("Indian To Russian Ruble  ");
                    double value,ero;
                    value=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    ero=value*1.00098;
                    DecimalFormat numberformate=new DecimalFormat("#.00");
                    textView.setText("" +numberformate.format(ero));

                }
            }
        });
    }
}