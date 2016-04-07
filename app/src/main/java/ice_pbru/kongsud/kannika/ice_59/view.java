package ice_pbru.kongsud.kannika.ice_59;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

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
            return null;
        }
    }
