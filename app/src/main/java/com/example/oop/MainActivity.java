package com.example.oop;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final Manager manager = new Manager("Julius", "MGR-001", 1500000, 500000);
    private final Cashier cashier = new Cashier("Asha", "CSH-001", 800000, 20, 5000);
    private Employee active;

    private TextView tvInfo, tvMessage;
    private EditText etSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo    = findViewById(R.id.tvInfo);
        tvMessage = findViewById(R.id.tvMessage);
        etSalary  = findViewById(R.id.etSalary);

        active = manager;
        updateInfo();

        RadioGroup rg = findViewById(R.id.rgRole);
        rg.setOnCheckedChangeListener((group, id) -> {
            active = (id == R.id.rbManager) ? manager : cashier;
            tvMessage.setText("");
            updateInfo();
        });

        findViewById(R.id.btnSetSalary).setOnClickListener(v -> {
            String input = etSalary.getText().toString().trim();
            if (input.isEmpty()) {
                Toast.makeText(this, "Enter a salary amount", Toast.LENGTH_SHORT).show();
                return;
            }
            double amount = Double.parseDouble(input);
            tvMessage.setText(active.setBaseSalary(amount));
            updateInfo();
        });
    }

    private void updateInfo() {
        tvInfo.setText(
            "Role   : " + active.getRole() + "\n" +
            "Name   : " + active.getName() + "\n" +
            "ID     : " + active.getId() + "\n" +
            "Base   : TZS " + active.getBaseSalary() + "\n" +
            "Total  : TZS " + active.calculatePay()
        );
    }
}
