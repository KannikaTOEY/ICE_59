package ice_pbru.kongsud.kannika.ice_59;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ICE_PBRU on 4/7/2016.
 */
public class view extends BaseAdapter{
    private Context context;
    private int[] iconInt;
    private String [] titleStrings, detailStrings;

    public view(Context context, int[] iconInt, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.iconInt = iconInt;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInt.length;
    }

    @Override
    public Object getItem(int position) {
        return iconInt.length;
    }

    @Override
    public long getItemId(int position) {
        return iconInt.length;
}
        @Override
        public View getView ( int i,View view,ViewGroup viewGroup){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view1= layoutInflater.inflate(R.layout.list_view, viewGroup, false);
//for icon
            ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
            iconImageView.setImageResource(iconInt[i]);
//for title
            TextView titTextView = (TextView) view1.findViewById(R.id.textView2);
            titTextView.setText(titleStrings[i]);
//for detail
            TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
            detailTextView.setText(detailStrings[i]);
            return view1;
        }
    }
