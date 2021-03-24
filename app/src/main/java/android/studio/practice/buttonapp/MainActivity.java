package android.studio.practice.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mTextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mButton1 = (Button)findViewById(R.id.button1);
    mTextView1 = (TextView)findViewById(R.id.textView1);

    mButton1.setOnClickListener(new MyOnClickListener(this));
    }

}