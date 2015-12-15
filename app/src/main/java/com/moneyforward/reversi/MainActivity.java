package com.moneyforward.reversi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.v_line)
    EditText vLine;
    @InjectView(R.id.h_line)
    EditText hLine;
    @InjectView(R.id.submit)
    Button submit;
    @InjectView(R.id.result)
    TextView result;

    boolean isBlack = true;
    private Ban ban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        this.ban = new Ban();
    }

    @OnClick(R.id.submit)
    void onClickResult() {
        if (TextUtils.isEmpty(vLine.getText()) || TextUtils.isEmpty(hLine.getText())) {
            return;
        }
        int v, h;
        try {
            v = Integer.valueOf(vLine.getText().toString();
            h = Integer.valueOf(hLine.getText().toString());
        } catch (Exception e) {
            return;
        }
        Koma koma = new Koma(v, h, isBlack);
        this.ban.add(koma);
        if (ban.isFinish()) {
            result.setText("終了");
        } else {
            vLine.setText("");
            hLine.setText("");
            result.setText(ban.getResult());
        }
        isBlack = !isBlack;
    }

    @OnClick(R.id.clear)
    void onClickClear() {
        this.isBlack = true;
        this.ban.clear();
    }
}
