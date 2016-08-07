package tomer.edu.spinnerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by stud27 on 07/08/16.
 */
public class CityAdapter extends BaseAdapter implements AdapterView.OnItemSelectedListener {
    ArrayList<City> cities = new ArrayList<>();
    Context context;

    public CityAdapter(Context context) {
        this.context = context;
        cities.add(new City("Ashdod"));
        cities.add(new City("Beer Sheva"));
        cities.add(new City("JAFFA"));
        cities.add(new City("Tel Aviv"));
        cities.add(new City("Rishon Lezion"));
        cities.add(new City("Netanya"));
        cities.add(new City("Yarka"));
        cities.add(new City("AKKO"));
    }

    @Override
    public int getCount() {
        return cities.size();
    }

    @Override
    public Object getItem(int i) {
        return cities.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        City city = cities.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(R.layout.city_item, parent, false);

        //
        TextView tvCityName = (TextView) v.findViewById(R.id.tvCityName);

        //
        tvCityName.setText(city.getCityName());

        return v;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        City c = cities.get(position);
        Toast.makeText(context, c.getCityName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
