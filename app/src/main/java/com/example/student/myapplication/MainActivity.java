package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText soa,sob,soc;
TextView ketqua;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soa = findViewById(R.id.so_a);
        sob = findViewById(R.id.so_b);
        soc = findViewById(R.id.so_c);
        bt = findViewById(R.id.button2);
        ketqua = findViewById(R.id.ketqua);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(soa.getText().toString());
                int b = Integer.parseInt(sob.getText().toString());
                int c = Integer.parseInt(soc.getText().toString());
                String kq="";
                if(a==0){
                    Toast.makeText(MainActivity.this,"a phai khac 0",Toast.LENGTH_SHORT).show();
                }else {
                    double delta=(b*b-4*a*c);
                    if(delta<0){
                        kq="phuowng trinh vo nghiem";
                    }
                    else if (delta==0){
                        kq="phuong trinhg cos nghiem : x1=x2="+ -b/(2*a);
                    }
                    else if (delta>0){
                        kq="phuowng trinh cos nghiem x1 = "+ (-b+Math.sqrt(delta))/2*a + "x2 ="+ (-b-Math.sqrt(delta))/2*a;
                    }
                }
                ketqua.setText(kq);
            }
        });
    }
}
