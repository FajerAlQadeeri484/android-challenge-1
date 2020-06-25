package com.example.xo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean Xturn = true;
    TextView turn;
    int[] Xarray = new int[9];
    int[] Oarray = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button zero = findViewById(R.id.button0);
        final Button one = findViewById(R.id.button1);
        final Button two = findViewById(R.id.button2);
        final Button three = findViewById(R.id.button3);
        final Button four = findViewById(R.id.button4);
        final Button five = findViewById(R.id.button5);
        final Button six = findViewById(R.id.button6);
        final Button seven = findViewById(R.id.button7);
        final Button eight = findViewById(R.id.button8);
        turn = findViewById(R.id.textView);
        Button reset = findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zero.setText("");
                one.setText("");
                two.setText("");
                three.setText("");
                four.setText("");
                five.setText("");
                six.setText("");
                seven.setText("");
                eight.setText("");
                turn.setText("");
                zero.setBackgroundColor(Color.parseColor("#FFD291BC"));
                one.setBackgroundColor(Color.parseColor("#FFD291BC"));
                two.setBackgroundColor(Color.parseColor("#FFD291BC"));
                three.setBackgroundColor(Color.parseColor("#FFD291BC"));
                four.setBackgroundColor(Color.parseColor("#FFD291BC"));
                five.setBackgroundColor(Color.parseColor("#FFD291BC"));
                six.setBackgroundColor(Color.parseColor("#FFD291BC"));
                seven.setBackgroundColor(Color.parseColor("#FFD291BC"));
                eight.setBackgroundColor(Color.parseColor("#FFD291BC"));

                for(int i=0;i<Xarray.length;i++){
                    Xarray[i]=0;
                }
                for(int i=0;i<Oarray.length;i++){
                    Oarray[i]=0;
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[0]=1;
                    checkXwin();
                    zero.setBackgroundColor(Color.parseColor("#679b9b"));
                    zero.setText("X");
                }
                else{
                    Oarray[0]=1;
                    checkOwin();
                    zero.setBackgroundColor(Color.parseColor("#aacfcf"));
                    zero.setText("O");
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[1]=1;
                    checkXwin();
                    one.setBackgroundColor(Color.parseColor("#679b9b"));
                    one.setText("X");
                }
                else{
                    Oarray[1]=1;
                    checkOwin();
                    one.setBackgroundColor(Color.parseColor("#aacfcf"));
                    one.setText("O");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[2]=1;
                    checkXwin();
                    two.setBackgroundColor(Color.parseColor("#679b9b"));
                    two.setText("X");
                }
                else{
                    Oarray[2]=1;
                    checkOwin();
                    two.setBackgroundColor(Color.parseColor("#aacfcf"));
                    two.setText("O");
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[3]=1;
                    checkXwin();
                    three.setBackgroundColor(Color.parseColor("#679b9b"));
                    three.setText("X");
                }
                else{
                    Oarray[3]=1;
                    checkOwin();
                    three.setBackgroundColor(Color.parseColor("#aacfcf"));
                    three.setText("O");
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[4]=1;
                    checkXwin();
                    four.setBackgroundColor(Color.parseColor("#679b9b"));
                    four.setText("X");
                }
                else{
                    Oarray[4]=1;
                    checkOwin();
                    four.setBackgroundColor(Color.parseColor("#aacfcf"));
                    four.setText("O");
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[5]=1;
                    checkXwin();
                    five.setBackgroundColor(Color.parseColor("#679b9b"));
                    five.setText("X");
                }
                else{
                    Oarray[5]=1;
                    checkOwin();
                    five.setBackgroundColor(Color.parseColor("#aacfcf"));
                    five.setText("O");
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[6]=1;
                    checkXwin();
                    six.setBackgroundColor(Color.parseColor("#679b9b"));
                    six.setText("X");
                }
                else{
                    Oarray[6]=1;
                    checkOwin();
                    six.setBackgroundColor(Color.parseColor("#aacfcf"));
                    six.setText("O");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[7]=1;
                    checkXwin();
                    seven.setBackgroundColor(Color.parseColor("#679b9b"));
                    seven.setText("X");
                }
                else{
                    Oarray[7]=1;
                    checkOwin();
                    seven.setBackgroundColor(Color.parseColor("#aacfcf"));
                    seven.setText("O");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Xturn){
                    Xarray[8]=1;
                    checkXwin();
                    eight.setBackgroundColor(Color.parseColor("#679b9b"));
                    eight.setText("X");
                }
                else{
                    Oarray[8]=1;
                    checkOwin();
                    eight.setBackgroundColor(Color.parseColor("#aacfcf"));
                    eight.setText("O");
                }
            }
        });
    }


    public void checkXwin(){
        Xturn=false;
        turn.setText("O Turn");
        if(Xarray[0]==1 && Xarray[1]==1 && Xarray[2]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
        else if(Xarray[3]==1 && Xarray[4]==1 && Xarray[5]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
        else if(Xarray[6]==1 && Xarray[7]==1 && Xarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
        else if(Xarray[0]==1 && Xarray[3]==1 && Xarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
        else if(Xarray[1]==1 && Xarray[4]==1 && Xarray[7]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
        else if(Xarray[2]==1 && Xarray[5]==1 && Xarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
        else if(Xarray[0]==1 && Xarray[4]==1 && Xarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
        else if(Xarray[2]==1 && Xarray[4]==1 && Xarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"X Won!",Toast.LENGTH_LONG).show();
        }
    }

    public void checkOwin(){
        Xturn=true;
        turn.setText("X Turn");
        if(Oarray[0]==1 && Oarray[1]==1 && Oarray[2]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_SHORT).show();
        }
        else if(Oarray[3]==1 && Oarray[4]==1 && Oarray[5]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_LONG).show();
        }
        else if(Oarray[6]==1 && Oarray[7]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_LONG).show();
        }
        else if(Oarray[0]==1 && Oarray[3]==1 && Oarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_LONG).show();
        }
        else if(Oarray[1]==1 && Oarray[4]==1 && Oarray[7]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_LONG).show();
        }
        else if(Oarray[2]==1 && Oarray[5]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_LONG).show();
        }
        else if(Oarray[0]==1 && Oarray[4]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_LONG).show();
        }
        else if(Oarray[2]==1 && Oarray[4]==1 && Oarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"O Won!",Toast.LENGTH_LONG).show();
        }
    }
}