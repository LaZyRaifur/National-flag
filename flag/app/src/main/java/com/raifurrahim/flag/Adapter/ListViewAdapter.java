package com.raifurrahim.flag.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.raifurrahim.flag.Activity_new;
import com.raifurrahim.flag.Model.Flag;
import com.raifurrahim.flag.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //variable
    Context mContext;
    LayoutInflater inflater;
    List<Flag>flagList;
    ArrayList<Flag>arrayList;

    //constructor


    public ListViewAdapter(Context context, List<Flag> flagList) {
        mContext = context;
        this.flagList = flagList;

        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Flag>();
        this.arrayList.addAll(flagList);
    }


    public class ViewHolder{
        TextView mNameTV,mDescTV,mPopulationTV,mCurrencyTV;
        ImageView mIconIV;
    }

    @Override
    public int getCount() {
        return flagList.size();
    }

    @Override
    public Object getItem(int i) {
        return flagList.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        ViewHolder holder;

        if (view == null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row,null);

            //locate the views in row.xml

            holder.mNameTV = view.findViewById(R.id.mainTitle);
            holder.mDescTV = view.findViewById(R.id.mainDesc);
            holder.mPopulationTV = view.findViewById(R.id.mPouplation);
            holder.mCurrencyTV = view.findViewById(R.id.mCurrency);
            holder.mIconIV = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }

        else {
            holder = (ViewHolder)view.getTag();
        }

        //set the result in text view
            holder.mNameTV.setText(flagList.get(position).getName());
        holder.mDescTV.setText(flagList.get(position).getDescription());
        holder.mPopulationTV.setText(flagList.get(position).getPopulation());
        holder.mCurrencyTV.setText(flagList.get(position).getCurrency());

        //set the result in image
        holder.mIconIV.setImageResource(flagList.get(position).getIcon());

        //list item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later

                if (flagList.get(position).getName().equals("Abkhazia")){
                    //start New activity with title for actionbar and text for
//                    Intent intent = new Intent(mContext,Activity_new.class);
//                    intent.putExtra("actionBarTitle","Abkhazia");
//                    intent.putExtra("contentTv","This is Abkhazia Details");
//                    mContext.startActivity(intent);
//


                    String url = "https://en.wikipedia.org/wiki/Abkhazia";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    mContext.startActivity(i);
                }
                if (flagList.get(position).getName().equals("Afghanistan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Afghanistan");
                    intent.putExtra("contentTv","This is Aba Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Albania")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Albania");
                    intent.putExtra("contentTv","This is Albania Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Algeria")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Algeria");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Angola")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Angola");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Argentina")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Argentina");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Armenia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Armenia");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Aruba")){

                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Aruba");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Australia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Australia");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Austria")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Austria");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Azerbaijan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Azerbaijan");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Bahrain")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Bahrain");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Bangladesh")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Bangladesh");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Barbados")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Barbados");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Belarus")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Belarus");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Belgium")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Belgium");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Bhutan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Bhutan");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Bolivia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Bolivia");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Bosnia & Herzegovina")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Bosnia & Herzegovina");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Botswana")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Botswana");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Brazil")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Brazil");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Brunei")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Brunei");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Bulgaria")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Bulgaria");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Burundi")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Cambodia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Cambodia");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Cameroon")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Canada")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }

                //28

                if (flagList.get(position).getName().equals("Chile")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("China")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Colombia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Comoros")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Croatia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Cuba")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Cyprus")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Czech Republic")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Denmark")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Dominica")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Ecuador")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Egypt")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("England")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Estonia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Ethiopia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Fiji")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Finland")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("France")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Gambia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Germany")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Ghana")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Greece")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Greenland")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Grenada")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Guatemala")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Guyana")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Haiti")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Hawaii")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Honduras")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Hong Kong")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Hungary")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Iceland")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("India")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Indonesia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Iran")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Iraq")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Ireland")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Italy")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Ivory Coast")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Jamaica")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Japan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Jordan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Kenya")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Kiribati")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Kuwait")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Kyrgyzstan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Laos")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Latvia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Lebanon")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Liberia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Libya")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Lithuania")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Madagascar")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Malawi")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Malaysia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Maldives")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Mali")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Malta")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Mexico")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Monaco")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Mongolia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Morocco")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Myanmar")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Namibia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Nepal")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Netherlands")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("New Zealand")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Niger")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Nigeria")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("North Korea")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Norway")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Oman")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Ossetia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Pakistan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Palau")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Palestine")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Panama")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Paraguay")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Peru")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Philippines")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Portugal")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Qatar")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Romania")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Russia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Rwanda")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Salvador")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Samoa")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Saudi Arabia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Scotland")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Senegal")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Serbia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Seychelles")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Singapore")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Slovakia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Slovenia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Somalia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("South Africa")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("South Korea")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("South Sudan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Spain")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Sri Lanka")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Sudan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Suriname")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Swaziland")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Sweden")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Switzerland")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Syria")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Taiwan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Tajikistan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Tanzania")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Thailand")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Togo")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Tonga")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Tunisia")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Turkey")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Turkmenistan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Uganda")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Ukraine")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("United Arab Emirates")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("United Kingdom")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("United States America")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Uruguay")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Uzbekistan")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Venezuela")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Vietnam")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Wales")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Yemen")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }
                if (flagList.get(position).getName().equals("Zimbabwe")){
                    //start New activity with title for actionbar and text for
                    Intent intent = new Intent(mContext,Activity_new.class);
                    intent.putExtra("actionBarTitle","Burundi");
                    intent.putExtra("contentTv","This is Abkhazia Details");
                    mContext.startActivity(intent);
                }

            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        flagList.clear();
        if (charText.length()==0){
            flagList.addAll(arrayList);
        }else {
            for (Flag flag : arrayList){
                if (flag.getName().toLowerCase(Locale.getDefault()).contains(charText)){
                    flagList.add(flag);
                }
            }
        }
        notifyDataSetChanged();
    }
}
