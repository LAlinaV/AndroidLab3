package com.example.dialog;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class MainActivity extends Activity implements OnClickListener {
    private Button bgButton;
    public RelativeLayout relativeLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = (Button) findViewById(R.id.background_button);
        bgButton.setOnClickListener(this);
        context = MainActivity.this;
        relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);
    }

}
