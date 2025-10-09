package ir.ehsancoder.nexzoide.glidecompat.pdfglide;

import android.content.Context;
import android.graphics.Bitmap;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.sdsmdg.harjot.vectormaster.*;
import ir.ehsancoder.nexzoide.glidecompat.glideapk.ApkIconLoaderModel;
import android.graphics.drawable.Drawable;
import ir.ehsancoder.nexzoide.glidecompat.glideapk.ApkIconModelLoader;
import ir.ehsancoder.nexzoide.glidecompat.glidejavaparser.CustomImageLoader;
import ir.ehsancoder.nexzoide.glidecompat.glidejavaparser.CustomImageRequest;
import ir.ehsancoder.nexzoide.glidecompat.glideres.IconRes;
import ir.ehsancoder.nexzoide.glidecompat.glideres.IconModelLoaderFactory;
import ir.ehsancoder.nexzoide.glidecompat.glidezip.ZipEntryModel;
import ir.ehsancoder.nexzoide.glidecompat.glidezip.ZipEntryModelLoaderFactory;
import ir.ehsancoder.nexzoide.glidecompat.musicglide.Mp3CoverLoaderFactory;
import ir.ehsancoder.nexzoide.glidecompat.musicglide.Mp3CoverModel;
import java.io.InputStream;
import com.caverock.androidsvg.SVG;
import ir.ehsancoder.nexzoide.glidecompat.glidesvg.SvgDecoder;
import android.graphics.drawable.PictureDrawable;
import ir.ehsancoder.nexzoide.glidecompat.glidesvg.SvgDrawableTranscoder;

@GlideModule
public class AppModule extends AppGlideModule {
  @Override
  public void registerComponents(
      @NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
    // register your Builder in Module
    // String.class is input and Bitmap.class is the output of ThumbnailBuilder
    registry.prepend(PdfModelView.class, Bitmap.class, new ThumbnailBuilderFactory(context));
    registry.append(Mp3CoverModel.class, Bitmap.class, new Mp3CoverLoaderFactory());
    registry
        .register(SVG.class, PictureDrawable.class, new SvgDrawableTranscoder())
        .append(InputStream.class, SVG.class, new SvgDecoder());
    registry.append(
        ApkIconLoaderModel.class, Drawable.class, new ApkIconModelLoader.Factory(context));
    registry.prepend(IconRes.class, Drawable.class, new IconModelLoaderFactory(context));

    registry.prepend(
        CustomImageRequest.class, Drawable.class, new CustomImageLoader.Factory(context));
    registry.append(VectorModel.class, Drawable.class, new VectorModelLoaderFactory(context));
    registry.append(ZipEntryModel.class, InputStream.class, new ZipEntryModelLoaderFactory()); 
  }
}
