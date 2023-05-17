package sg.edu.rp.c346.id22021421.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView C203View;
    TextView C206View;
    TextView C218View;
    TextView C235View;
    TextView C346View;
    TextView G953View;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C203View = findViewById(R.id.textView1);
        C206View = findViewById(R.id.textView2);
        C218View = findViewById(R.id.textView3);
        C235View = findViewById(R.id.textView4);
        C346View = findViewById(R.id.textView5);
        G953View = findViewById(R.id.textView6);
        C203View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Module","C203");
                startActivity(intent);
            }
        });
        C206View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Module","C206");
                startActivity(intent);
            }
        });
        C218View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Module","C218");
                startActivity(intent);
            }
        });
        C235View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Module","C235");
                startActivity(intent);
            }
        });
        C346View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Module","C346");
                startActivity(intent);
            }
        });
        G953View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Module","G953");
                startActivity(intent);
            }
        });
    }
}