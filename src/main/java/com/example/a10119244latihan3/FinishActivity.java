package com.example.a10119244latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/* Tanggal Pengerjaan  : 26 April 2022
 * NIM                 : 10119244
 * Nama                : Mya Hauliyah
 * Kelas               : IF-6
 */

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        String nickName = getIntent().getStringExtra(PersonalFormActivity.INPUT_NICKNAME);

        TextView textView = findViewById(R.id.finishTextMessage);
        String replace = textView.getText().toString().replace("kamu",nickName).replace("mu",nickName);
        textView.setText(String.valueOf(replace));
    }

    public void actFinish(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}
