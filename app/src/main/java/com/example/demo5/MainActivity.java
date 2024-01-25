package com.example.demo5;

import androidx.appcompat.app.AppCompatActivity;

import android.health.connect.datatypes.units.Length;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = (EditText) findViewById(R.id.editTextText);
        passwordEditText = (EditText) findViewById(R.id.editTextText2);
        Button LoginButton = findViewById(R.id.button);

    }

    public void sendMessage(View view) {

        Log.i("tagNuevo", "Hola Mundo");
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (!username.isEmpty() && !password.isEmpty()) {
            Intent intent = new Intent(MainActivity.this, SecondActivity2.class);
            intent.putExtra("USERNAME", username);
            startActivity(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume en MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause en MainActivity", Toast.LENGTH_SHORT).show();
    }
}