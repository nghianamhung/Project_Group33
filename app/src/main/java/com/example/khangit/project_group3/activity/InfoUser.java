package com.example.khangit.project_group3.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.khangit.project_group3.R;
import com.example.khangit.project_group3.model.KhachHang;
public class InfoUser extends AppCompatActivity {

    private TextView txtEmail;
    private TextView txtHoten;
    private TextView txtPhone;
    private TextView txtNgaysinh;
    private TextView txtDiachi;

    private KhachHang khachHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_login);
        Intent intent = getIntent();
        khachHang = new KhachHang();
        khachHang = (KhachHang) intent.getSerializableExtra("login");
        addControl();
    }

    private void addControl() {
        txtHoten = (TextView) findViewById(R.id.txtHoten);
        txtPhone = (TextView) findViewById(R.id.txtPhone);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtDiachi = (TextView) findViewById(R.id.txtDiachi);
        txtNgaysinh = (TextView) findViewById(R.id.txtNgaysinh);

        /**Set value*/
        txtHoten.setText(khachHang.getHoten());
        txtEmail.setText(khachHang.getEmail());
        txtPhone.setText(khachHang.getPhone());
        txtNgaysinh.setText(khachHang.getNgaysinh());
        txtDiachi.setText(khachHang.getDiachi());

    }
}