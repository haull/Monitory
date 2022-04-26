package com.example.a10119244latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/* Tanggal Pengerjaan  : 26 April 2022
 * NIM                 : 10119244
 * Nama                : Mya Hauliyah
 * Kelas               : IF-6
 */

public class PersonalFormActivity extends AppCompatActivity {

    public static final String INPUT_NICKNAME = "dev.stdev.10119244Latihan3.INPUT_NICKNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_form);
    }

    public void actNext(View view) {
        EditText nickName = (EditText) findViewById(R.id.fieldNickName);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, FinishActivity.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);
    }
}
