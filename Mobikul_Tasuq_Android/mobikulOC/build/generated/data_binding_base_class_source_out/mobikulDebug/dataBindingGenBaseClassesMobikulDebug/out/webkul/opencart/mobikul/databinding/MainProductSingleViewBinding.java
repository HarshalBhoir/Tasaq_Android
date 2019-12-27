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
import webkul.opencart.mobikul.HomeFeatureStatus;
import webkul.opencart.mobikul.adapterModel.HomePageAdapteModel;
import webkul.opencart.mobikul.handlers.MainActivityHandler;

public abstract class MainProductSingleViewBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llMain;

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
  protected HomeFeatureStatus mStatus;

  @Bindable
  protected MainActivityHandler mHandler;

  protected MainProductSingleViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout llMain, LinearLayout llParent, CardView productCardv,
      ImageView productImage, RelativeLayout productLayout, TextView productname,
      TextView productprice, TextView specialProductPrice, ImageView wishlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llMain = llMain;
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

  public abstract void setStatus(@Nullable HomeFeatureStatus status);

  @Nullable
  public HomeFeatureStatus getStatus() {
    return mStatus;
  }

  public abstract void setHandler(@Nullable MainActivityHandler handler);

  @Nullable
  public MainActivityHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static MainProductSingleViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MainProductSingleViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MainProductSingleViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.main_product_single_view, root, attachToRoot, component);
  }

  @NonNull
  public static MainProductSingleViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MainProductSingleViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MainProductSingleViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.main_product_single_view, null, false, component);
  }

  public static MainProductSingleViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static MainProductSingleViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (MainProductSingleViewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.main_product_single_view);
  }
}
