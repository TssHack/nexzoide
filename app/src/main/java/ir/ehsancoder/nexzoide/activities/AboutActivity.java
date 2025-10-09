package ir.ehsancoder.nexzoide.activities;

import ir.ehsancoder.nexzoide.R;
import ir.ehsancoder.nexzoide.RequestNetwork;
import ir.ehsancoder.nexzoide.RequestNetworkController;
import ir.ehsancoder.nexzoide.adapter.DevAd;
import ir.ehsancoder.nexzoide.glidecompat.GlideCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.activity.OnBackPressedCallback;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.*;

public class AboutActivity extends BaseCompat {

    // 🧱 UI Elements
    private TextView tvName, tvBio, tvVersion;
    private RecyclerView rvDevelopers;
    private ImageView appIcon;
    private ProgressBar progressBar;
    private LinearLayout linksLayout;

    // 🌐 Network
    private RequestNetwork mainRequest, contributorsRequest;
    private RequestNetwork.RequestListener mainListener, contributorsListener;
    private List<HashMap<String, Object>> contributors = new ArrayList<>();

    // ⚙️ API URLs
    private static final String API_USER = "https://api.github.com/users/tsshack";
    private static final String API_CONTRIB = "https://api.github.com/repos/tsshack/nexzoide/contributors";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        initViews();
        setupListeners();
        fetchData();
    }

    private void initViews() {
        appIcon = findViewById(R.id.icon_glide_about);
        tvName = findViewById(R.id.tv_about_name);
        tvBio = findViewById(R.id.tv_about_bio);
        tvVersion = findViewById(R.id.tv_about_version);
        rvDevelopers = findViewById(R.id.rv_about_dev);
        progressBar = findViewById(R.id.progress_about);
        linksLayout = findViewById(R.id.links_layout);

        GlideCompat.GlideNormal(appIcon, R.mipmap.nexzoicon);
        tvVersion.setText("Version " + getAppVersion());
    }

    private void setupListeners() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                finish();
                Log.i("AboutActivity", "Back pressed");
            }
        });

        // 📎 Developer Links
        findViewById(R.id.btn_github).setOnClickListener(v -> openUrl("https://github.com/tsshack/nexzoide"));
        findViewById(R.id.btn_telegram).setOnClickListener(v -> openUrl("https://t.me/tsshack"));
        findViewById(R.id.btn_email).setOnClickListener(v -> sendEmail("tsshack@gmail.com"));
        findViewById(R.id.btn_website).setOnClickListener(v -> openUrl("https://nexzoide.ir"));
    }

    private void fetchData() {
        showLoading(true);

        mainRequest = new RequestNetwork(this);
        contributorsRequest = new RequestNetwork(this);

        mainListener = new RequestNetwork.RequestListener() {
            @Override
            public void onResponse(String tag, String response, HashMap<String, Object> params) {
                showLoading(false);
                parseUserInfo(response);
            }

            @Override
            public void onErrorResponse(String tag, String message) {
                showLoading(false);
                showError("Failed to fetch developer info!");
            }
        };

        contributorsListener = new RequestNetwork.RequestListener() {
            @Override
            public void onResponse(String tag, String response, HashMap<String, Object> params) {
                contributors = new Gson().fromJson(response,
                        new TypeToken<List<HashMap<String, Object>>>(){}.getType());
                setupRecycler();
            }

            @Override
            public void onErrorResponse(String tag, String message) {
                showError("Failed to fetch contributors list!");
            }
        };

        mainRequest.startRequestNetwork(RequestNetworkController.GET, API_USER, "user", mainListener);
        contributorsRequest.startRequestNetwork(RequestNetworkController.GET, API_CONTRIB, "contributors", contributorsListener);
    }

    private void parseUserInfo(String input) {
        try {
            JSONObject user = new JSONObject(input);
            String avatar = user.getString("avatar_url");
            String name = user.optString("name", user.getString("login"));
            String bio = user.optString("bio", "Developer of Nexzoide 💻");

            Glide.with(getApplicationContext()).load(Uri.parse(avatar)).circleCrop().into(appIcon);
            tvName.setText(name);
            tvBio.setText(bio);

        } catch (JSONException e) {
            showError("Error parsing user data!");
        }
    }

    private void setupRecycler() {
        DevAd adapter = new DevAd(contributors, (v, c) -> {});
        rvDevelopers.setLayoutManager(new GridLayoutManager(this, 2));
        rvDevelopers.setAdapter(adapter);
    }

    private void openUrl(String link) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(i);
    }

    private void sendEmail(String email) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Contact Nexzoide Developer");
        startActivity(Intent.createChooser(intent, "Send email using..."));
    }

    private void showLoading(boolean show) {
        progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
        rvDevelopers.setVisibility(show ? View.GONE : View.VISIBLE);
    }

    private void showError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    private String getAppVersion() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (Exception e) {
            return "Unknown";
        }
    }
}
