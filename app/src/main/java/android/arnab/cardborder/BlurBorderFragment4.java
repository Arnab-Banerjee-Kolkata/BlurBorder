package android.arnab.cardborder;

import android.app.Fragment;
import android.content.ClipData;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.jgabrielfreitas.core.BlurImageView;

public class BlurBorderFragment4 extends Fragment
{

    private Button nxt;
    private int BLUR_PERCENT=25;


    static int PAGE_IMAGE;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        BlurImageView blurImageView=(BlurImageView)view.findViewById(R.id.backgroundImg);
        blurImageView.setScaleType(BlurImageView.ScaleType.FIT_XY);
        blurImageView.setImageResource(PAGE_IMAGE);
        blurImageView.setBlur(BLUR_PERCENT);

        ImageView imageView=(ImageView)view.findViewById(R.id.testImage);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        imageView.setImageResource(PAGE_IMAGE);
        nxt=(Button) view.findViewById(R.id.next);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BorderImageSetterClass.setBorderImage(R.drawable.images5);
                getActivity().setContentView(R.layout.blur_border_layout5);
            }
        });




    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        PAGE_IMAGE=BorderImageSetterClass.BORDER;       // GETTING BORDER IMAGE
        View view = inflater.inflate(R.layout.card_border_layout, container, false);


        return view;


    }

}
