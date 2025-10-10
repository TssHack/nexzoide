package ir.ehsancoder.nexzoide.activities;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ir.ehsancoder.nexzoide.R;
import ir.ehsancoder.nexzoide.RequestNetwork;
import ir.ehsancoder.nexzoide.RequestNetworkController;
import ir.ehsancoder.nexzoide.adapter.DevAd;
import ir.ehsancoder.nexzoide.glidecompat.GlideCompat;

public class AboutActivity extends BaseCompat {

    private static final String TAG = "AboutActivity";
    private static final String API_URL = "https://api.github.com/users/tsshack";
    private static final String DEV_LIST_URL = "https://api.github.com/repos/tsshack/nexzoide/contributors";

    private TextView tvName, tvBio;
    private ImageView appIcon;
    private RecyclerView rvDevelopers;
    private DevAd devAdapter;
    private List<HashMap<String, Object>> devList = new ArrayList<>();

    private RequestNetwork userRequest, devRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        initViews();
        setupListeners();
        setupSocialLinks(); // 🔹 اضافه شده
        loadData();
    }

    private void initViews() {
        appIcon = findViewById(R.id.icon_glide_about);
        tvName = findViewById(R.id.tv_about_name);
        tvBio = findViewById(R.id.tv_about_bio);
        rvDevelopers = findViewById(R.id.rv_about_dev);

        GlideCompat.GlideNormal(appIcon, R.mipmap.nexzoicon);
        rvDevelopers.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void setupListeners() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                finish();
                Log.i(TAG, "Back pressed");
            }
        });
    }

    // 🟢 تنظیم کلیک برای لینک‌های تلگرام و سایت
    private void setupSocialLinks() {
        findViewById(R.id.link_telegram).setOnClickListener(v -> {
            openUrl("https://t.me/nexzoteam");
        });

        findViewById(R.id.link_website).setOnClickListener(v -> {
            openUrl("https://nexzo.ir");
        });
    }

    private void loadData() {
        userRequest = new RequestNetwork(this);
        devRequest = new RequestNetwork(this);

        userRequest.startRequestNetwork(RequestNetworkController.GET, API_URL, "user_info", userCallback);
        devRequest.startRequestNetwork(RequestNetworkController.GET, DEV_LIST_URL, "dev_list", devCallback);
    }

    private final RequestNetwork.RequestListener devCallback = new RequestNetwork.RequestListener() {
        @Override
        public void onResponse(String tag, String response, HashMap<String, Object> params) {
            devList = new Gson().fromJson(response, new TypeToken<List<HashMap<String, Object>>>(){}.getType());
            devAdapter = new DevAd(devList, (v, c) -> {});
            rvDevelopers.setAdapter(devAdapter);
        }

        @Override
        public void onErrorResponse(String tag, String message) {}
    };

    private final RequestNetwork.RequestListener userCallback = new RequestNetwork.RequestListener() {
        @Override
        public void onResponse(String tag, String response, HashMap<String, Object> params) {
            updateUserInfo(response);
        }

        @Override
        public void onErrorResponse(String tag, String message) {}
    };

    private void updateUserInfo(String json) {
        try {
            JSONObject user = new JSONObject(json);
            String avatarUrl = user.getString("avatar_url");
            String username = user.getString("login");
            String bio = user.optString("bio", "Developer of Nexzo IDE");

            // Load image (circle)
            Glide.with(this)
                    .load(Uri.parse(avatarUrl))
                    .circleCrop()
                    .into(appIcon);

            // Animate name fade-in
            tvName.setText(username);
            animateFade(tvName);

            // Animate bio
            tvBio.setText(bio);
            animateFade(tvBio);

        } catch (Exception e) {
            Log.e(TAG, "Error parsing user info: " + e.getMessage());
        }
    }

    private void animateFade(TextView view) {
        view.setAlpha(0f);
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f);
        fadeIn.setDuration(700);
        fadeIn.setInterpolator(new DecelerateInterpolator());
        fadeIn.start();
    }

    private void openUrl(String link) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));
    }
}
