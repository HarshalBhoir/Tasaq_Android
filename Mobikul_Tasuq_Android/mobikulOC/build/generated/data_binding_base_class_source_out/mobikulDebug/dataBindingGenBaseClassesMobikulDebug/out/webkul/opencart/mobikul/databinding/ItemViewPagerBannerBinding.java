package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import webkul.opencart.mobikul.adapterModel.HomePageBannerAdapterModel;
import webkul.opencart.mobikul.handlers.HomePagePagerHandler;

public abstract class ItemViewPagerBannerBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @Bindable
  protected HomePageBannerAdapterModel mData;

  @Bindable
  protected HomePagePagerHandler mHandler;

  protected ItemViewPagerBannerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
  }

  public abstract void setData(@Nullable HomePageBannerAdapterModel data);

  @Nullable
  public HomePageBannerAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable HomePagePagerHandler handler);

  @Nullable
  public HomePagePagerHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ItemViewPagerBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemViewPagerBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemViewPagerBannerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_view_pager_banner, root, attachToRoot, component);
  }

  @NonNull
  public static ItemViewPagerBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemViewPagerBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemViewPagerBannerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_view_pager_banner, null, false, component);
  }

  public static ItemViewPagerBannerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemViewPagerBannerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemViewPagerBannerBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_view_pager_banner);
  }
}
