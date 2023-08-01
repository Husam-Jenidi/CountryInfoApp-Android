package com.example.flagselector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickFlag(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.longtext);
        String longtext_spain= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas nec pretium velit. Suspendisse potenti. Integer a mi in justo sollicitudin sollicitudin id vel dui. Nullam vitae condimentum enim. Cras eget purus nunc. Curabitur vel enim vitae elit pretium tristique. Sed at ullamcorper lectus, at lobortis sapien. Duis in lectus justo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Cras ullamcorper ante at dolor sagittis cursus. Morbi scelerisque, nibh et ultricies ultrices, ante dolor porta leo, a pulvinar felis ante nec sem. In egestas hendrerit aliquet. Mauris dapibus ultrices erat vitae efficitur. Suspendisse maximus lectus eu erat posuere, nec laoreet felis cursus. Fusce gravida facilisis nunc, et pulvinar orci gravida sed. Mauris eu lacinia orci.";
        String longtext_italy= "piscing elit. Maecenas nec pretium velit. Suspendisse potenti. Integer a mi in justo sollicitudin sollicitudin id vel dui. Nullam vitae condimentum enim. Cras eget purus nunc. Curabitur vel enim vitae elit pretium tristique. Sed at ullamcorper lectus, at lobortis sapien. Duis in lectus justo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Cras ullamcorper ante at dolor sagittis cursus. Morbi scelerisque, nibh et ultricies ultrices, ante dolor porta leo, a pulvinar felis ante nec sem. In egestas hendrerit aliquet. Mauris dapibus ultrices erat vitae efficitur. Suspendisse maximus lectus eu erat posuere, nec laoreet felis cursus. Fusce gravida facilisis nunc, et pulvinar orci gravida sed. Mauris eu lacinia orci.";
        String longtext_uk= " Suspendisse potenti. Integer a mi in justo sollicitudin sollicitudin id vel dui. Nullam vitae condimentum enim. Cras eget purus nunc. Curabitur vel enim vitae elit pretium tristique. Sed at ullamcorper lectus, at lobortis sapien. Duis in lectus justo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Cras ullamcorper ante at dolor sagittis cursus. Morbi scelerisque, nibh et ultricies ultrices, ante dolor porta leo, a pulvinar felis ante nec sem. In egestas hendrerit aliquet. Mauris dapibus ultrices erat vitae efficitur. Suspendisse maximus lectus eu erat posuere, nec laoreet felis cursus. Fusce gravida facilisis nunc, et pulvinar orci gravida sed. Mauris eu lacinia orci.";
        String longtext_france= "151515151515Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas nec pretium velit. Suspendisse potenti. Integer a mi in justo sollicitudin sollicitudin id vel dui. Nullam vitae condimentum enim. Cras eget purus nunc. Curabitur vel enim vitae elit pretium tristique. Sed at ullamcorper lectus, at lobortis sapien. Duis in lectus justo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Cras ullamcorper ante at dolor sagittis cursus. Morbi scelerisque, nibh et ultricies ultrices, ante dolor porta leo, a pulvinar felis ante nec sem. In egestas hendrerit aliquet. Mauris dapibus ultrices erat vitae efficitur. Suspendisse maximus lectus eu erat posuere, nec laoreet felis cursus. Fusce gravida facilisis nunc, et pulvinar orci gravida sed. Mauris eu lacinia orci.";

        switch (view.getId()){
            case R.id.FR:
                imageView.setImageResource(R.drawable.fr);
                textView.setText(longtext_france);
                break;
            case R.id.IT:
                imageView.setImageResource(R.drawable.it);
                textView.setText(longtext_italy);
                break;
            case R.id.SP:
                imageView.setImageResource(R.drawable.sp);
                textView.setText(longtext_spain);
                break;
            case R.id.UK:
                imageView.setImageResource(R.drawable.uk);
                textView.setText(longtext_uk);
                break;
        }
}}


