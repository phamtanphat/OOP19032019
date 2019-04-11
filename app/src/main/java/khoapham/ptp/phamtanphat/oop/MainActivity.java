package khoapham.ptp.phamtanphat.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person nguyenvana = new Person();
        nguyenvana.setTen("Nguyen Van A");
        nguyenvana.setTuoi(20);
        nguyenvana.setPhuongtien("Đi bộ");
        Log.d("BBB",nguyenvana.getTen() + "");

        Person nguyenvanb = new Person();
        nguyenvanb.setTen("Nguyen Van B");
        nguyenvanb.setTuoi(25);
        nguyenvanb.setPhuongtien("Đi xe đạp");
    }
}
