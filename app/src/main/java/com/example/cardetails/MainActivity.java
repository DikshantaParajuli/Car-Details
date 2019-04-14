package com.example.cardetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView txtScrollable;
    private EditText txtMake,txtYear,txtColor,txtPurchasePrice,txtEngineSize;
    private Button btnCreateCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
    }
    private void initItems(){
        txtMake = findViewById(R.id.txta);
        txtYear = findViewById(R.id.txtb);
        txtColor = findViewById(R.id.txtc);
        txtPurchasePrice = findViewById(R.id.txtp);
        txtEngineSize = findViewById(R.id.txte);

        txtScrollable = findViewById(R.id.txts);
        txtScrollable.setMovementMethod(new ScrollingMovementMethod());

        btnCreateCar = findViewById(R.id.btnCreateCar);
        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performAction();
            }
        });
    }
    private void performAction(){
        String data = "\r\n" +"Make:"+txtMake.getText().toString()+"."+"\r\n"+ "Year:"+txtYear.getText().toString()
                +"."+"\r\n"+ "Color:"+txtColor.getText().toString()+"."+"\r\n"
                + "Purchase Price:"+txtPurchasePrice.getText().toString()
                +"."+"\r\n"+ "Engine Size:"+txtEngineSize.getText().toString();
        txtScrollable.setText(txtScrollable.getText().toString()+"\r\n"+data);
    }
}
