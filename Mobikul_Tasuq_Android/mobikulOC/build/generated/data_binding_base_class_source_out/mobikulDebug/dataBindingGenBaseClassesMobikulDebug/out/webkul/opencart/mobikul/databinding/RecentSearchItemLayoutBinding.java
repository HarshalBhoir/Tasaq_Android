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
import android.widget.LinearLayout;
import webkul.opencart.mobikul.handlers.RecentSearchHandler;
import webkul.opencart.mobikul.roomdatabase.RecentSearchTable;

public abstract class RecentSearchItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout mainLayout;

  @Bindable
  protected RecentSearchTable mData;

  @Bindable
  protected RecentSearchHandler mHandler;

  protected RecentSearchItemLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView imageView, LinearLayout mainLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.mainLayout = mainLayout;
  }

  public abstract void setData(@Nullable RecentSearchTable data);

  @Nullable
  public RecentSearchTable getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable RecentSearchHandler handler);

  @Nullable
  public RecentSearchHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static RecentSearchItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RecentSearchItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RecentSearchItemLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.recent_search_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static RecentSearchItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RecentSearchItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RecentSearchItemLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.recent_search_item_layout, null, false, component);
  }

  public static RecentSearchItemLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RecentSearchItemLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RecentSearchItemLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.recent_search_item_layout);
  }
}
