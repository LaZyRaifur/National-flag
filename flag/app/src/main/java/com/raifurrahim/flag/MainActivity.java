package com.raifurrahim.flag;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.raifurrahim.flag.Adapter.ListViewAdapter;
import com.raifurrahim.flag.Model.Flag;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String []title;
    String[]description;
    String []population;
    String[]currency;

    int[]icon;
    ArrayList<Flag>arrayList = new ArrayList<Flag>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Item List");

        title = new String[]{
                "Abkhazia","Afghanistan","Albania","Algeria","Angola",
                "Argentina","Armenia","Aruba","Australia","Austria",
                "Azerbaijan","Bahrain","Bangladesh","Barbados","Belarus",
                "Belgium","Bhutan","Bolivia","Bosnia & Herzegovina",
                "Botswana","Brazil","Brunei","Bulgaria","Burundi",
        "Cambodia","Cameroon","Canada","Chile","China",
        "Colombia","Comoros","Croatia","Cuba","Cyprus",
        "Czech Republic","Denmark","Dominica","Ecuador","Egypt","England",
                "Estonia","Ethiopia","Fiji","Finland","France","Gambia","Germany","Ghana","Greece"
        ,"Greenland","Grenada","Guatemala","Guyana","Haiti","Hawaii","Honduras",
        "Hong kong","Hungary","Iceland","India","Indonesia","Iran","Iraq",
        "Ireland","Italy","Ivory Coast","Jamaica","Japan","Jordan","kenya",
        "kiribati","kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Liberia","Libya","Lithuania",
        "Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Mexico","Monaco",
        "Mongolia","Morocco","Myanmar",
                "Namibia","Nepal","Netherlands","New Zealand","Niger","Nigeria","North Korea","Norway",
        "Oman","Ossetia","Pakistan","Palau","Palestine","Panama","Paraguay","Peru","Philippines","Portugal","Qatar",
        "Romania","Russia","Rwanda","Salvador","Samoa","Saudi Arabia","Scotland","Senegal","Serbia","Seychelles","Singapore","Slovakia","Slovenia","Somalia",
        "South Africa","South Korea","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria","Taiwan",
        "Tajikistan","Tanzania","Thailand","Togo","Tonga","Tunisia","Turkey","Turkmenistan","Uganda","Ukraine","United Arab Emirates","United Kingdom",
        "United States America","Uruguay","Uzbekistan","Venezuela","Vietnam","Wales","Yemen","Zimbabwe"};


        description = new String[]{"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka",
                 "Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka","Dhaka"
                ,"Dhaka","Dhaka","Dhaka","Dhaka"};

        population = new String[]{"Population : 1200000","Population : 32100","Population : 32100","Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100","Population : 32100","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 123564","Population : 123564","Population : 123564","Population : 123564"
                ,"Population : 123564","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"
                ,"Population : 32100","Population : 32100","Population : 32100"};

        currency = new String[]{"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000"
                ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000"
                ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000"
                ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000" ,"currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
                ,"currency : 1200000","currency : 1200000","currency : 1200000"
        };

        icon = new int[]{R.drawable.abkhazia,R.drawable.afghanistan,R.drawable.albania,R.drawable.algeria
                ,R.drawable.angola,R.drawable.argentina,R.drawable.armenia,R.drawable.aruba
                ,R.drawable.australia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.bahrain
                ,R.drawable.bangladesh,R.drawable.barbados,R.drawable.belarus,R.drawable.belgium
                ,R.drawable.bhutan,R.drawable.bolivia,R.drawable.bosnia,R.drawable.botswana
                ,R.drawable.brazil,R.drawable.brunei,R.drawable.bulgaria,R.drawable.burundi,
        R.drawable.cambodia,R.drawable.cameroon,R.drawable.canada,R.drawable.chile,R.drawable.china,
        R.drawable.colombia,R.drawable.comoros,R.drawable.croatia,R.drawable.cuba,R.drawable.cyprus,
        R.drawable.czech_republic,R.drawable.denmark,R.drawable.dominica,R.drawable.ecuador,R.drawable.egypt,
                R.drawable.england,R.drawable.estonia,R.drawable.ethiopia,R.drawable.fiji,R.drawable.finland,R.drawable.france
        ,R.drawable.gambia,R.drawable.germany,R.drawable.ghana,R.drawable.greece,R.drawable.greenland,
        R.drawable.grenada,R.drawable.guatemala,R.drawable.guyana,R.drawable.haiti,
        R.drawable.hawaii,R.drawable.honduras,R.drawable.hong_kong,R.drawable.hungary,R.drawable.iceland,
        R.drawable.india,R.drawable.indonesia,R.drawable.iran,R.drawable.iraq,
        R.drawable.ireland,R.drawable.italy,R.drawable.ivory_coast,R.drawable.jamaica
        ,R.drawable.japan,R.drawable.jordan,R.drawable.kenya,R.drawable.kiribati,
        R.drawable.kuwait,R.drawable.kyrgyzstan,R.drawable.laos,R.drawable.latvia,R.drawable.lebanon
        ,R.drawable.liberia,R.drawable.libya,R.drawable.lithuania,R.drawable.madagascar,
        R.drawable.malawi,R.drawable.malaysia,R.drawable.maldives,R.drawable.mali,
        R.drawable.malta,R.drawable.mexico,R.drawable.monaco,R.drawable.mongoli,R.drawable.morocco,
        R.drawable.myanmar,R.drawable.namibia,R.drawable.nepal,R.drawable.netherlands,
        R.drawable.new_zealand,R.drawable.niger,R.drawable.nigeria,
        R.drawable.north_korea,R.drawable.norway,R.drawable.oman,
        R.drawable.ossetia,R.drawable.pakistan,R.drawable.palau,
        R.drawable.palestine,R.drawable.panama,R.drawable.paraguay,
        R.drawable.peru,R.drawable.philippines,R.drawable.portugal,
        R.drawable.qatar,R.drawable.romaniaa,R.drawable.russia,
        R.drawable.rwanda,R.drawable.salvador,R.drawable.samoa,
        R.drawable.saudi_arabia,R.drawable.scotland,R.drawable.senegal,
        R.drawable.serbia,R.drawable.seychelles,R.drawable.singapore,
        R.drawable.slovakia,R.drawable.slovenia,R.drawable.somalia,
        R.drawable.south_africa,R.drawable.south_korea,R.drawable.south_sudan,
        R.drawable.spain,R.drawable.sri_lanka,R.drawable.sudan,R.drawable.surinamee,
        R.drawable.swaziland,R.drawable.sweden,R.drawable.switzerland,
        R.drawable.syria,R.drawable.taiwan,R.drawable.tajikistan,
        R.drawable.tanzania,R.drawable.thailand,R.drawable.togo,
        R.drawable.tonga,R.drawable.tunisia,R.drawable.turkey,
        R.drawable.turkmenistan,R.drawable.uganda,R.drawable.ukraine,
        R.drawable.united_arab_emirates,R.drawable.united_kingdom,
        R.drawable.united_states_america,R.drawable.uruguay,R.drawable.uzbekistan,
        R.drawable.venezuela,R.drawable.vietnam,R.drawable.wales,
        R.drawable.yemen,R.drawable.zimbabwe};


        listView = findViewById(R.id.listView);

        for (int i=0;i<title.length;i++){
            Flag flag = new Flag(title[i],description[i],population[i],currency[i],icon[i]);
            //bind all strings in an array
            arrayList.add(flag);
        }

        //press the result to list view adapter class
        adapter = new ListViewAdapter(this,arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem mActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)mActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

            if (TextUtils.isEmpty(s)){
                adapter.filter("");
                listView.clearTextFilter();
            }else {
                adapter.filter(s);
            }
            return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.action_settings){
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
