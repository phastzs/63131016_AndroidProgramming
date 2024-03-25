package sv_63131016.NguyenHungPhat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView noteListView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> notesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khoi tao views
        noteListView = findViewById(R.id.note_list);
        Button addButton = findViewById(R.id.buttonAddNote);

        // Khoi tao ArrayList cho ghi chu
        notesList = new ArrayList<>();

        // Khoi tao adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, notesList);
        noteListView.setAdapter(adapter);

        // Su kien click nut Them ghi chu
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddNoteDialog();
            }
        });
    }

    // Phuong thuc hien thi hop thoai de them ghi chu moi
    private void showAddNoteDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Them Ghi Chu Moi");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("Them", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String noteText = input.getText().toString();
                if (!noteText.isEmpty()) {
                    notesList.add(noteText);
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Ghi chu khong duoc de trong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        builder.setNegativeButton("Huy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        builder.show();
    }
}