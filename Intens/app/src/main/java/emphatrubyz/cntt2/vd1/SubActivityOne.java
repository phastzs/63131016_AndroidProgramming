package emphatrubyz.cntt2.vd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivityOne extends AppCompatActivity {
    Button btn_sub1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
        btn_sub1 = findViewById(R.id.btn_sub_one);
        btn_sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMain = new Intent(SubActivityOne.this, MainActivity.class);
                startActivity(iMain);
            }
        });
    }
}