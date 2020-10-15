package com.example.indp_lab04;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class AddActivity extends Activity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    Button button1;
    Button button2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        editText1=(EditText)findViewById(R.id.editTextNumber2);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        button1=(Button)findViewById(R.id.button2);
        button2=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {


                String message1=editText1.getText().toString();
                String message2=editText2.getText().toString();
                String message3=editText3.getText().toString();
                if(message1.equals("")||message2.equals("") || message3.equals("")) {
                    Toast.makeText(getBaseContext(),"Rellene los datos",Toast.LENGTH_SHORT).show();
                }else {
                    int message1int=Integer.parseInt(message1);
                    Intent intent = new Intent();
                    intent.putExtra("CUI", message1int);
                    intent.putExtra("APELLIDOS", message2);
                    intent.putExtra("NOMBRES", message3);

                    setResult(2, intent);
                    finish();//finishing activity
                }
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent=new Intent();
                setResult(3,intent);
                finish();//finishing activity
            }
        });
    }
}
