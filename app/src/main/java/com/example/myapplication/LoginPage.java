package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity implements View.OnClickListener {
    Button login;
    EditText un,pw;
    TextView labeltext;
    String username= "admin";
    String password = "1515";
    int clickcount = 3;
    RadioButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        login = (Button) findViewById(R.id.btn);
        un    = (EditText)findViewById(R.id.username);
        pw    = (EditText)findViewById(R.id.Password);
        labeltext = (TextView)findViewById(R.id.textView);

        //1 USING ANONYMOUS INNER CLASS ********
   /*     login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Page3.class);
                startActivity(i);

            }
        });
    }
}

    */
        //2 USING XML ****
/*    public void login(View view){
        Handler obj = new Handler();
        obj.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),Page3.class);
                startActivity(intent);
            }
        },2000);
    }
}

 */
//3 IMPLEMENTING LISTENER***********
login.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        String uname = un.getText().toString();
        String pword = pw.getText().toString();

        if (username.equals(uname) && password.equals(pword))
        {
            Intent intent = new Intent(getApplicationContext(),Page3.class);
            //passing username to page3 through intent
            intent.putExtra("user",uname);
            intent.putExtra("password",pword);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "invalid username/password", Toast.LENGTH_LONG).show();
            clickcount--;
            if (clickcount == 0)
            {

                login.setEnabled(false);
                labeltext.setText("Login Blocked");
                labeltext.setTextColor(Color.RED);
            }


        }

        }

    public void register(View view) {
        Intent in = new Intent(getApplicationContext(),Registerpage.class);
        startActivity(in);
    }
}