package voca.xvocaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ADDNewDomain extends AppCompatActivity {

    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnew_domain);

        token = getIntent().getExtras().getString("token");
    }
}
