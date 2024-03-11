package emphatrubyz.cntt2.appcong;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Gắn layout tương ứng file này
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //đây là bộ xử lý lắng nghe sự kiện lên nút tính tổng
    public void Plus(View view) {
        //Tìm , tham chiếu đến bộ điều khiển trên tệp xml
        EditText editTextSoA = findViewById(R.id.oa);
        EditText editTextSoB = findViewById(R.id.ob);
        EditText editTextKetQua = findViewById(R.id.okq);
        //lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();
        //
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        //Tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong); // chuyển sang dạng chuỗi
        //Hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}
