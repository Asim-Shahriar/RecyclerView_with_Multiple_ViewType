package com.example.recyclerviewwithmultipleviewtype.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithmultipleviewtype.R;
import com.example.recyclerviewwithmultipleviewtype.models.Ads;
import com.example.recyclerviewwithmultipleviewtype.models.News;
import com.example.recyclerviewwithmultipleviewtype.models.Trip;

public class TripsAdapter {


   static  class TripViewHolder extends RecyclerView.ViewHolder{

       private ImageView imageTrip;
       private TextView textTripTitle,textTrip;

       public TripViewHolder(@NonNull View itemView) {
           super(itemView);
           imageTrip=itemView.findViewById(R.id.imageTrip);
           textTripTitle=itemView.findViewById(R.id.textTripTitle);
           textTrip=itemView.findViewById(R.id.textTrip);
       }

       void setTripDate(Trip trip){

         imageTrip.setImageResource(trip.getTripImage());
         textTripTitle.setText(trip.getTripTitle());
         textTrip.setText(trip.getTrip());
       }
   }

   static  class AdsViewHolder extends RecyclerView.ViewHolder{

       private TextView textAdsTitle,textAds;

       public AdsViewHolder(@NonNull View itemView) {
           super(itemView);

           textAdsTitle=itemView.findViewById(R.id.textAdsTitle);
           textAds=itemView.findViewById(R.id.textAds);

       }

       void  setAdsData(Ads ads){

          textAdsTitle.setText(ads.getAdsTitle());
          textAds.setText(ads.getAds());
       }
   }

   static  class NewsViewHolder extends RecyclerView.ViewHolder{

       private TextView textNewsTitle, textNews;

       public NewsViewHolder(@NonNull View itemView) {
           super(itemView);
           textNewsTitle=itemView.findViewById(R.id.textNewsTitle);
           textNews=itemView.findViewById(R.id.textNews);
       }

       void setNewsData(News news){
          textNewsTitle.setText(news.getNewsTitle());
          textNews.setText(news.getNews());
       }
   }
}
