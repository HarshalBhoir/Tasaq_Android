package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import webkul.opencart.mobikul.loginlistener.LoginChecker;

public abstract class ActivitySplashscreenBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatRadioButton arabicRb;

  @NonNull
  public final ImageView backgroundImage;

  @NonNull
  public final MaterialButton continueBtn;

  @NonNull
  public final AppCompatRadioButton englishRb;

  @NonNull
  public final LinearLayout llLangauge;

  @NonNull
  public final ProgressBar progressBar2;

  @Bindable
  protected LoginChecker mData;

  @Bindable
  protected Boolean mIsLoading;

  protected ActivitySplashscreenBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatRadioButton arabicRb, ImageView backgroundImage,
      MaterialButton continueBtn, AppCompatRadioButton englishRb, LinearLayout llLangauge,
      ProgressBar progressBar2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.arabicRb = arabicRb;
    this.backgroundImage = backgroundImage;
    this.continueBtn = continueBtn;
    this.englishRb = englishRb;
    this.llLangauge = llLangauge;
    this.progressBar2 = progressBar2;
  }

  public abstract void setData(@Nullable LoginChecker data);

  @Nullable
  public LoginChecker getData() {
    return mData;
  }

  public abstract void setIsLoading(@Nullable Boolean isLoading);

  @Nullable
  public Boolean getIsLoading() {
    return mIsLoading;
  }

  @NonNull
  public static ActivitySplashscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySplashscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySplashscreenBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_splashscreen, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySplashscreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySplashscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySplashscreenBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_splashscreen, null, false, component);
  }

  public static ActivitySplashscreenBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivitySplashscreenBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySplashscreenBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_splashscreen);
  }
}
