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
import android.widget.TextView;
import webkul.opencart.mobikul.handlers.RecentSearchHandler;
import webkul.opencart.mobikul.model.RecentSearchModel;

public abstract class RecentSearchLayoutBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout mainLinear;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView search;

  @Bindable
  protected RecentSearchModel mData;

  @Bindable
  protected RecentSearchHandler mHandler;

  protected RecentSearchLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout mainLinear, ImageView productImage, TextView search) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mainLinear = mainLinear;
    this.productImage = productImage;
    this.search = search;
  }

  public abstract void setData(@Nullable RecentSearchModel data);

  @Nullable
  public RecentSearchModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable RecentSearchHandler handler);

  @Nullable
  public RecentSearchHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static RecentSearchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RecentSearchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RecentSearchLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.recent_search_layout, root, attachToRoot, component);
  }

  @NonNull
  public static RecentSearchLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RecentSearchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RecentSearchLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.recent_search_layout, null, false, component);
  }

  public static RecentSearchLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RecentSearchLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RecentSearchLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.recent_search_layout);
  }
}
