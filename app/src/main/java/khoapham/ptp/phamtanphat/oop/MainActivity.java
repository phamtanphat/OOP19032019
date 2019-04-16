package khoapham.ptp.phamtanphat.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        insochan();
//        insole();
//        insochia3du1();
//        insochinhphuong();
//        inso(1 , 3);
        inso(new Xuly() {
            @Override
            public boolean checkdk(int i) {
                if(i % 3 == 1){
                    return true;
                }else{
                    return false;
                }
            }
        });
    }

    private void inso(Xuly xuly ) {
        for (int i = 0 ; i <= 100 ; i++){
            boolean dk = xuly.checkdk(i);
            if( dk ) Log.d("BBB", i + "");
        }
    }

    private void insochinhphuong() {
        for (int i = 0 ; i <= 100 ; i++){
            if( Math.sqrt(i) % 1 == 0) Log.d("BBB", i + "");
        }
    }

    private void insochia3du1() {
        for (int i = 0 ; i <= 100 ; i++){
            if( i % 3 == 1) Log.d("BBB", i + "");
        }
    }

    private void insole() {
        for (int i = 0 ; i <= 100 ; i++){
            if( i % 2 == 1) Log.d("BBB", i + "");
        }
    }

    private void insochan(){
        for (int i = 0 ; i <= 100 ; i++){
            if( i % 2 == 0) Log.d("BBB", i + "");
        }
    }

}
