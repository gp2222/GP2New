package com.example.ali.lsss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Toolbar toolbar;

    private EditText FirstName, lastName, password, Email;
    private Button regButton;
    //private TextView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle( "إضافة ورشة العمل");
        setSupportActionBar(toolbar);

        setupUIViews();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();

            }
        });
    }


//public void bun_register(View v){
//    Intent intent=new Intent(register.this,admin_leader.class);
    //  startActivity(intent);
//}

    private void setupUIViews(){

        FirstName=(EditText)findViewById(R.id.firstName);
        lastName=(EditText)findViewById(R.id.editText10);
        password=(EditText)findViewById(R.id.editText14);
        Email=(EditText)findViewById(R.id.editText15);
        regButton=(Button)findViewById(R.id.button3);

    }
// validate is enter all the details

    private Boolean validate(){

        Boolean result= false;

        String firstName= FirstName.getText().toString();
        String LastName= lastName.getText().toString();
        String Password= password.getText().toString();
        String email=Email.getText().toString();


        if(firstName.isEmpty()&& LastName.isEmpty()&& Password.isEmpty()&& email.isEmpty()){
            Toast.makeText(this,"الرجاء إدخال جميع البيانات", Toast.LENGTH_SHORT).show();
        }else{
            result= true;
        }
        return result;

    }
}
