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
public class AddActivity extends Activity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    Button button1;
    Button button2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        editText1=(EditText)findViewById(R.id.editText1);
        editText1=(EditText)findViewById(R.id.editText2);
        editText1=(EditText)findViewById(R.id.editText3);
        button1=(Button)findViewById(R.id.button2);
        button2=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String message=editText1.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2,intent);
                finish();//finishing activity
            }
        });
    }
}
