package sg.edu.np.mad.mad_recyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import sg.edu.np.mad.mad_recyclerview.R;

public class BrandViewholder extends RecyclerView.ViewHolder{
    CheckBox checkbox;
    TextView textview;
    View view;

    public BrandViewholder(View itemView){
        super(itemView);
        checkbox = itemView.findViewById(R.id.checkBox5);
        textview = itemView.findViewById(R.id.textView);
        view = itemView;
    }
}
