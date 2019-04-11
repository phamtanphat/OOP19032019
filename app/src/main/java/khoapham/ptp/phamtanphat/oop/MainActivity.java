package khoapham.ptp.phamtanphat.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Person nguyenvana = new Person("Nguyen Van A",20 , "Đi bộ");
//        nguyenvana.setTen("Nguyen Van A");
//        nguyenvana.setTuoi(20);
//        nguyenvana.setPhuongtien("Đi bộ");

//        Log.d("BBB",nguyenvana.getTen() + "");

//        Person nguyenvanb = new Person("Nguyen Van B" , 25 , "Đi xe");
//        nguyenvanb.setTen();
//        nguyenvanb.setTuoi(25);
//        nguyenvanb.setPhuongtien("Đi xe đạp");
//        Person nguyenvana = new Person();
//        nguyenvana.ten = " Nguyen Van a";
//        Animal cat = new Animal();
//        cat.ten = "cat";
        ShowTen(20);
    }

    //OVERload : phuong thuc nap chong
    public void ShowTen(String ten){
        Toast.makeText(this, ten, Toast.LENGTH_SHORT).show();
    }
    public void ShowTen(Integer number){
        Toast.makeText(this, number + "", Toast.LENGTH_SHORT).show();

    }
}
