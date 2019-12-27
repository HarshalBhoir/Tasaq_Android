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
import webkul.opencart.mobikul.adapterModel.HomePageAdapteModel;
import webkul.opencart.mobikul.handlers.RecentViewedHandler;

public abstract class RecentViewProductLayoutBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout container;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView productprice;

  @NonNull
  public final TextView specialProductPrice;

  @NonNull
  public final ImageView wishlist;

  @Bindable
  protected HomePageAdapteModel mData;

  @Bindable
  protected RecentViewedHandler mHandler;

  protected RecentViewProductLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout container, ImageView image, TextView productprice,
      TextView specialProductPrice, ImageView wishlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.image = image;
    this.productprice = productprice;
    this.specialProductPrice = specialProductPrice;
    this.wishlist = wishlist;
  }

  public abstract void setData(@Nullable HomePageAdapteModel data);

  @Nullable
  public HomePageAdapteModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable RecentViewedHandler handler);

  @Nullable
  public RecentViewedHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static RecentViewProductLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RecentViewProductLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RecentViewProductLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.recent_view_product_layout, root, attachToRoot, component);
  }

  @NonNull
  public static RecentViewProductLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RecentViewProductLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RecentViewProductLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.recent_view_product_layout, null, false, component);
  }

  public static RecentViewProductLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RecentViewProductLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RecentViewProductLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.recent_view_product_layout);
  }
}
