package study.vv.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by student2 on 02.03.18.
 */

public class CountryAdapter extends ArrayAdapter {


    public CountryAdapter(@NonNull Context context,@NonNull Object[] textViewResourceId) {
        super(context,R.layout.listadapterview, textViewResourceId);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null)
        convertView= (View)LayoutInflater.from(getContext()).inflate(R.layout.listadapterview,null);
        TextView num=(TextView)convertView.findViewById(R.id.number);
        num.setText(position+")");
        if(position % 2==0){
            convertView.setBackgroundColor(Color.BLUE);
        }else convertView.setBackgroundColor(Color.WHITE);
        TextView name=(TextView)convertView.findViewById(R.id.country_name);
        name.setText((String)getItem(position));
        return convertView;
    }
}
