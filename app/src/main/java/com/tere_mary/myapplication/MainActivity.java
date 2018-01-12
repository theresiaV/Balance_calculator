package com.tere_mary.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button hapus;
    private Button backspace;
    private FloatingActionButton balance_result;
    private TextView income;
    private TextView outcome;
    private TextView balance;

    int num1,num2;
    int a,b;
    String temp = "1",str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //function untuk ambil button, textview, floatbutton
        SetupUIViews();

        //set onTouch ke income
        income.setInputType(InputType.TYPE_NULL);

        //setOnclick untuk textviewIncome
        income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = income.getText().toString().trim().length();

                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "1");
                        }
                    }
                });

                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "2");
                        }
                    }
                });

                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "3");
                        }
                    }
                });

                four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "4");
                        }
                    }
                });

                five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "5");
                        }
                    }
                });

                six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "6");
                        }
                    }
                });

                seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "7");
                        }
                    }
                });

                eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "8");
                        }
                    }
                });

                nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "1" && a == 0){
                            income.setText(income.getText().toString() + "9");
                        }
                    }
                });
            }
        });

        outcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b = outcome.getText().toString().trim().length();

                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "1");
                        }
                    }
                });

                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "2");
                        }
                    }
                });

                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "3");
                        }
                    }
                });

                four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "4");
                        }
                    }
                });

                five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "5");
                        }
                    }
                });

                six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "6");
                        }
                    }
                });

                seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "7");
                        }
                    }
                });

                eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "8");
                        }
                    }
                });

                nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if ( temp == "2" && a == 0){
                            outcome.setText(outcome.getText().toString() + "9");
                        }
                    }
                });
            }
        });

        balance_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (income.getText().toString().length() == 0 || outcome.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "Income or Outcome is Blank", Toast.LENGTH_SHORT).show();
                }
                else {
                    num1 = Integer.parseInt(income.getText().toString());
                    num2 = Integer.parseInt(outcome.getText().toString());

                    if (num1 == num2) {
                        balance.setText("Result balance");
                    } else {
                        balance.setText("Result not balance");
                    }
                }
            }
        });

        //untuk mengisi temp untuk mengetahui apakah income sedang active
        income.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                temp = "1";
                income.setInputType(InputType.TYPE_NULL);
                return false;
            }
        });

        //untuk mengisi temp untuk mengetahui apakah outcome sedang active
        outcome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                temp = "2";
                outcome.setInputType(InputType.TYPE_NULL);
                return false;
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                income.setText("");
                outcome.setText("");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp == "1") {
                    int displayLength = income.length();
                    if (displayLength > 0) {
                        income.setText(income.getText().toString().substring(0, displayLength - 1));
                    }
                } else if (temp == "2") {
                    int displayLength = outcome.length();
                    if (displayLength > 0) {
                        outcome.setText(outcome.getText().toString().substring(0, displayLength - 1));
                    }
                }
            }

        });
    }

    private void SetupUIViews(){
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        income = (TextView)findViewById(R.id.income);
        outcome = (TextView)findViewById(R.id.outcome);
        balance = (TextView)findViewById(R.id.balance);
        hapus = (Button)findViewById(R.id.btn_clear);
        backspace = (Button)findViewById(R.id.btn_backspace);
        balance_result = (FloatingActionButton)findViewById(R.id.btn_result);
    }
}
