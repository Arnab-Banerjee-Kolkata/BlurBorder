package android.arnab.cardborder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bdrBtn=(Button)findViewById(R.id.borderBurtton);
        bdrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BorderImageSetterClass.setBorderImage(R.drawable.images);       //SETTING BORDER IMAGE
                setContentView(R.layout.blur_border_layout);
            }
        });
    }
}
