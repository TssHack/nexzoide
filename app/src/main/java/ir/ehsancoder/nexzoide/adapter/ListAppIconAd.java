package ir.ehsancoder.nexzoide.adapter;

import ir.ehsancoder.nexzoide.R;
import ir.ehsancoder.nexzoide.databinding.AppsBinding;
import android.view.LayoutInflater;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import java.util.HashMap;
import android.view.View;
import android.view.ViewGroup;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import java.util.List;

public class ListAppIconAd extends BaseAdapter implements Adapter {

  private List<HashMap<String, Object>> data;

  public ListAppIconAd(List<HashMap<String, Object>> data) {
    this.data = data;
  }

  @Override
  public int getCount() {
    return data.size();
  }

  @Override
  public HashMap<String, Object> getItem(int index) {
    return data.get(index);
  }

  @Override
  public long getItemId(int index) {
    return index;
  }

  @Override
  public View getView(int position, View v, ViewGroup container) {

    AppsBinding bin = AppsBinding.inflate(LayoutInflater.from(container.getContext()));
    ObjectAnimator animator =
        ObjectAnimator.ofFloat(bin.imageview1, "translationX", -10f, 10f, -5f, 5f, -2f, 2f, 0f);
    animator.setDuration(1000);
    animator.setInterpolator(new LinearInterpolator());
    animator.setRepeatCount(ObjectAnimator.INFINITE);

    animator.start();

    if (position == 0) {

      bin.textview1.setText("default");
      bin.imageview1.setImageResource(R.mipmap.nexzoicon);
    }
    if (position == 1) {
      bin.textview1.setText("blue");
      bin.imageview1.setImageResource(R.drawable.nexzoiconblue);
    }
    if (position == 2) {
      bin.textview1.setText("black");
      bin.imageview1.setImageResource(R.drawable.nexzoiconblack);
    }
    if (position == 3) {
      bin.textview1.setText("red");
      bin.imageview1.setImageResource(R.drawable.nexzoiconred);
    }
    if (position == 4) {
      bin.textview1.setText("yellow");
      bin.imageview1.setImageResource(R.drawable.nexzoiconyellow);
    }
    if (position == 5) {
      bin.textview1.setText("Jade purple");
      bin.imageview1.setImageResource(R.drawable.nexzoiconpapermod);
    }
    if (position == 6) {
      bin.textview1.setText("Slime green");
      bin.imageview1.setImageResource(R.drawable.nexzoicongreenhell);
    }
    if (position == 7) {
      bin.textview1.setText("Dark blue 2");
      bin.imageview1.setImageResource(R.drawable.nexzoiconbluemod);
    }
    if (position == 8) {
      bin.textview1.setText("nexzo");
      bin.imageview1.setImageResource(R.drawable.nexzoicons);
    }
    if(position == 9){
      bin.textview1.setText("Material Green");
      bin.imageview1.setImageResource(R.drawable.greendraw);
    }
    if(position == 10){
      bin.textview1.setText("Material Paper");
      bin.imageview1.setImageResource(R.drawable.paperdraw);
    }
    if(position == 11){
      bin.textview1.setText("Material Red");
      bin.imageview1.setImageResource(R.drawable.reddraw);
    }
    
    return bin.getRoot();
  }
}
