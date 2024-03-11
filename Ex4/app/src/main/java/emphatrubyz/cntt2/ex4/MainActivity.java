package emphatrubyz.cntt2.ex4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Xử lý inset cho edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            int systemBarsTop = insets.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            v.setPadding(0, systemBarsTop, 0, 0);
            return insets;
        });
    }

    // Phương thức xử lý khi nhấn nút cộng
    public void add(View view) {
        // Tìm và tham chiếu đến các EditText trong layout XML
        EditText editTextSoA = findViewById(R.id.edt1);
        EditText editTextSoB = findViewById(R.id.edt2);
        EditText editTextKetQua = findViewById(R.id.edtkq);

        // Lấy dữ liệu từ các EditText
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        // Chuyển đổi dữ liệu từ chuỗi sang số nguyên
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        // Thực hiện phép tính cộng
        int tong = soA + soB;

        // Hiển thị kết quả trên EditTextKetQua
        editTextKetQua.setText(String.valueOf(tong));
    }

    // Phương thức xử lý khi nhấn nút trừ
    public void sub(View view) {
        EditText editTextSoA = findViewById(R.id.edt1);
        EditText editTextSoB = findViewById(R.id.edt2);
        EditText editTextKetQua = findViewById(R.id.edtkq);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        int hieu = soA - soB;

        editTextKetQua.setText(String.valueOf(hieu));
    }

    // Phương thức xử lý khi nhấn nút nhân
    public void mul(View view) {
        EditText editTextSoA = findViewById(R.id.edt1);
        EditText editTextSoB = findViewById(R.id.edt2);
        EditText editTextKetQua = findViewById(R.id.edtkq);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        int tich = soA * soB;

        editTextKetQua.setText(String.valueOf(tich));
    }

    // Phương thức xử lý khi nhấn nút chia
    public void div(View view) {
        EditText editTextSoA = findViewById(R.id.edt1);
        EditText editTextSoB = findViewById(R.id.edt2);
        EditText editTextKetQua = findViewById(R.id.edtkq);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        if (soB != 0) {
            float thuong = (float) soA / soB;
            editTextKetQua.setText(String.valueOf(thuong));
        } else {
            editTextKetQua.setText("Không thể chia cho 0");
        }
    }
}
