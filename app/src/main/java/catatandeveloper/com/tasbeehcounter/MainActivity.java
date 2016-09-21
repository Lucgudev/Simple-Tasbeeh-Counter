package catatandeveloper.com.tasbeehcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private TextView tvCount;
    private Button btCount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //panggil fungsi
        initTasbeeh();

        // listener untuk penekanan tombol
        btCount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (counter < 33)
                {
                    //jika hitungan counter kurang dari 33 maka counter akan terus ditambah
                    counter = counter + 1;
                    //text akan di set sesuai dengan jumlah counter
                    tvCount.setText(counter + "");
                }else
                {
                    //jika hitungan counter lebih dari 33 maka counter akan di reset menjadi 1
                    counter = 1;
                    //text akan di set sesuai dengan jumlah counter
                    tvCount.setText(counter + "");
                }
            }
        });
    }

    public void initTasbeeh()
    {
        // mengintegrasikan widget pada xml dengan object pada java
        tvCount = (TextView) findViewById(R.id.tv_counter);
        btCount = (Button) findViewById(R.id.bt_count);
        counter = 1;
    }
}
