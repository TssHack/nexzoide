package ir.ehsancoder.nexzoide;

import ir.ehsancoder.nexzoide.services.DownloadService;
import ir.ehsancoder.nexzoide.utils.Utils;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StopServiceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Utils.isMyServiceRunning(context, DownloadService.class)) {
            DownloadService.downloadAllowed = false;
            context.stopService(new Intent(context, DownloadService.class));
        }
    }
}
