package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.HomePageAdapteModel;
import webkul.opencart.mobikul.handlers.ViewMoreHandler;

public abstract class ViewMoreItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llParent;

  @NonNull
  public final CardView productCardv;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final RelativeLayout productLayout;

  @NonNull
  public final TextView productname;

  @NonNull
  public final TextView productprice;

  @NonNull
  public final TextView specialProductPrice;

  @NonNull
  public final ImageView wishlist;

  @Bindable
  protected HomePageAdapteModel mData;

  @Bindable
  protected ViewMoreHandler mHandler;

  protected ViewMoreItemLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout llParent, CardView productCardv, ImageView productImage,
      RelativeLayout productLayout, TextView productname, TextView productprice,
      TextView specialProductPrice, ImageView wishlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llParent = llParent;
    this.productCardv = productCardv;
    this.productImage = productImage;
    this.productLayout = productLayout;
    this.productname = productname;
    this.productprice = productprice;
    this.specialProductPrice = specialProductPrice;
    this.wishlist = wishlist;
  }

  public abstract void setData(@Nullable HomePageAdapteModel data);

  @Nullable
  public HomePageAdapteModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable ViewMoreHandler handler);

  @Nullable
  public ViewMoreHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ViewMoreItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewMoreItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewMoreItemLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.view_more_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ViewMoreItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewMoreItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewMoreItemLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.view_more_item_layout, null, false, component);
  }

  public static ViewMoreItemLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ViewMoreItemLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ViewMoreItemLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.view_more_item_layout);
  }
}
