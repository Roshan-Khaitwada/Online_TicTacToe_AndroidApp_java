package com.example.onlineusertictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PlayerName extends AppCompatActivity {
    private EditText code;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);
        code = findViewById(R.id.code);
        next = findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String enteredcode=code.getText().toString().trim();

                if(enteredcode.isEmpty())
                {
                    Toast.makeText(PlayerName.this, "Enter code here", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(PlayerName.this, MainActivity.class);
                    intent.putExtra("code",enteredcode);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}