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
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.HomePageAdapteModel;

public abstract class GridhomeBinding extends ViewDataBinding {
  @NonNull
  public final ImageView addToCart;

  @NonNull
  public final ImageView addToCartPop;

  @NonNull
  public final LinearLayout btnLayout;

  @NonNull
  public final CardView cardViewNewsletter;

  @NonNull
  public final TextView model;

  @NonNull
  public final TextView newPrice;

  @NonNull
  public final TextView outOfStock;

  @NonNull
  public final TextView price;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final RelativeLayout productImageLayout;

  @NonNull
  public final LinearLayout productInfoLayout;

  @NonNull
  public final LinearLayout productInfoLayoutInner;

  @NonNull
  public final LinearLayout productInfoLayoutPrice;

  @NonNull
  public final TextView productName;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final RelativeLayout relative;

  @NonNull
  public final TextView sale;

  @NonNull
  public final TextView sellerStringTV;

  @NonNull
  public final LinearLayout trans;

  @NonNull
  public final ImageView wishlist;

  @Bindable
  protected HomePageAdapteModel mData;

  protected GridhomeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView addToCart, ImageView addToCartPop, LinearLayout btnLayout,
      CardView cardViewNewsletter, TextView model, TextView newPrice, TextView outOfStock,
      TextView price, ImageView productImage, RelativeLayout productImageLayout,
      LinearLayout productInfoLayout, LinearLayout productInfoLayoutInner,
      LinearLayout productInfoLayoutPrice, TextView productName, RatingBar ratingBar,
      RelativeLayout relative, TextView sale, TextView sellerStringTV, LinearLayout trans,
      ImageView wishlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToCart = addToCart;
    this.addToCartPop = addToCartPop;
    this.btnLayout = btnLayout;
    this.cardViewNewsletter = cardViewNewsletter;
    this.model = model;
    this.newPrice = newPrice;
    this.outOfStock = outOfStock;
    this.price = price;
    this.productImage = productImage;
    this.productImageLayout = productImageLayout;
    this.productInfoLayout = productInfoLayout;
    this.productInfoLayoutInner = productInfoLayoutInner;
    this.productInfoLayoutPrice = productInfoLayoutPrice;
    this.productName = productName;
    this.ratingBar = ratingBar;
    this.relative = relative;
    this.sale = sale;
    this.sellerStringTV = sellerStringTV;
    this.trans = trans;
    this.wishlist = wishlist;
  }

  public abstract void setData(@Nullable HomePageAdapteModel data);

  @Nullable
  public HomePageAdapteModel getData() {
    return mData;
  }

  @NonNull
  public static GridhomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static GridhomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<GridhomeBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.gridhome, root, attachToRoot, component);
  }

  @NonNull
  public static GridhomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static GridhomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<GridhomeBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.gridhome, null, false, component);
  }

  public static GridhomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static GridhomeBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (GridhomeBinding)bind(component, view, webkul.opencart.mobikul.R.layout.gridhome);
  }
}
