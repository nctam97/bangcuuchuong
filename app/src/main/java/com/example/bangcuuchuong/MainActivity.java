package com.example.bangcuuchuong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSo;
    Button btnIn;
    TextView textkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSo=(EditText)findViewById(R.id.editText_so);
        btnIn=(Button) findViewById(R.id.button_in);
        textkq=(TextView) findViewById(R.id.textView_kq);
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi="";
                String nhap=editSo.getText().toString();
                int So=Integer.parseInt(nhap);
                for(int i=1; i<=10; i++){
                    chuoi+=So+" x "+i+" = ";
                    chuoi+=String.valueOf(So*i)+"\n";
                }
                textkq.setText("Bảng cửu chương:" +"\n"+ String.valueOf(chuoi));

            }
        });
    }
}
