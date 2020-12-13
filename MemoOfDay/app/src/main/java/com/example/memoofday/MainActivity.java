/**
 * @author      Jiho Yoo
 * @email       jihoyoo5@gmail.com
 * @createDate  2020-12-07
 * @version     0.1
 */
package com.example.memoofday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

import it.emperor.animatedcheckbox.AnimatedCheckBox;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    private EditText et_email;
    private EditText et_pwd;
    private AnimatedCheckBox ck_save_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
    }
}