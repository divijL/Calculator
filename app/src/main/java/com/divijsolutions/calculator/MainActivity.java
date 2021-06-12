package com.divijsolutions.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button button1,button2,button3,button4,button5,button6,button7,button9,button10,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21;
   EditText ed1;
   int c=0;
   float Res1,Res2;
   boolean Add,Subt,Div,Mul,Percent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);

        button10 = (Button) findViewById(R.id.button10);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        ed1 = (EditText) findViewById(R.id.editText);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                }
else
                {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Add=true;
                    ed1.setText(null);

                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    Subt=true;
                    ed1.setText(null);

                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                }
                else
                {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(null);

                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                }
                else
                {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText(null);

                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                }
                else
                {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Percent=true;
                    ed1.setText(null);

                }
            }
        });
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Res2=Float.parseFloat(ed1.getText()+"");
            if(Add)
            {  ed1.setText(Res1+Res2+"");
        Add=false;
        }
      if(Subt)

        {
            ed1.setText(Res1 - Res2 + "");
            Subt = false;
        }
            if(Mul) {
                ed1.setText(Res1 * Res2 + "");
                Mul = false;
            }
            if(Div)

            {
                ed1.setText(Res1/Res2 + "");
                Div = false;
            }

            }});
    button7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed1.setText("");
        }
    });
    button21.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed1.setText("");
        }
    });}}