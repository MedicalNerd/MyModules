package sg.edu.rp.c346.id22021421.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvDisplay;
    TextView tvDisplay1;
    TextView tvDisplay2;
    TextView tvDisplay3;
    TextView tvDisplay4;
    TextView tvDisplay5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvDisplay=findViewById(R.id.textViewModule);
        tvDisplay1=findViewById(R.id.textViewModule2);
        tvDisplay2=findViewById(R.id.textViewModule3);
        tvDisplay3=findViewById(R.id.textViewModule4);
        tvDisplay4=findViewById(R.id.textViewModule5);
        tvDisplay5=findViewById(R.id.textViewModule6);
        String module = getIntent().getStringExtra("Module");
        if (module.equals("C203")){
            tvDisplay.setText("Module Code: " +module);
            tvDisplay1.setText("Module Name: Web Appln Development in php");
            tvDisplay2.setText("Academic Year: 2023");
            tvDisplay3.setText("Semester: 2");
            tvDisplay4.setText("Module Credit: 5");
            tvDisplay5.setText("Venue: W65C");
        }
        else if (module.equals("C206")) {
            tvDisplay.setText("Module Code: " +module);
            tvDisplay1.setText("Module Name: Software Development Process");
            tvDisplay2.setText("Academic Year: 2023");
            tvDisplay3.setText("Semester: 2");
            tvDisplay4.setText("Module Credit: 5");
            tvDisplay5.setText("Venue: W65C");
        } else if (module.equals("C218")) {
            tvDisplay.setText("Module Code: " +module);
            tvDisplay1.setText("Module Name: UI/UX Design for Apps");
            tvDisplay2.setText("Academic Year: 2023");
            tvDisplay3.setText("Semester: 2");
            tvDisplay4.setText("Module Credit: 5");
            tvDisplay5.setText("Venue: W65C");
        } else if (module.equals("C235")) {
            tvDisplay.setText("Module Code: " +module);
            tvDisplay1.setText("Module Name: IT Security and Management");
            tvDisplay2.setText("Academic Year: 2023");
            tvDisplay3.setText("Semester: 2");
            tvDisplay4.setText("Module Credit: 5");
            tvDisplay5.setText("Venue: W65C");
        } else if (module.equals("C346")) {
            tvDisplay.setText("Module Code: " +module);
            tvDisplay1.setText("Module Name: Mobile App Development");
            tvDisplay2.setText("Academic Year: 2023");
            tvDisplay3.setText("Semester: 2");
            tvDisplay4.setText("Module Credit: 5");
            tvDisplay5.setText("Venue: E63A");

        } else if (module.equals("G953")) {
            tvDisplay.setText("Module Code: " +module);
            tvDisplay1.setText("Module Name: Life Skills III");
            tvDisplay2.setText("Academic Year: 2023");
            tvDisplay3.setText("Semester: 2");
            tvDisplay4.setText("Module Credit: 5");
            tvDisplay5.setText("Venue: HB02");
        } else {
            tvDisplay.setText("Invalid Module Code");
            tvDisplay1.setText("");
        }

    }
}