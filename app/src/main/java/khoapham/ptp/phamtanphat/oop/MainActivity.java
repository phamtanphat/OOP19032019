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
        nguyenvana.ten = "Nguyen Van A";
        nguyenvana.tuoi = 20;
        nguyenvana.cachdichuyen("Đi bộ");
        Log.d("BBB",nguyenvana.Phuongtien);

        Person nguyenvanb = new Person();
        nguyenvanb.ten = "Nguyen Van B";
        nguyenvanb.tuoi = 30;
    }
}
