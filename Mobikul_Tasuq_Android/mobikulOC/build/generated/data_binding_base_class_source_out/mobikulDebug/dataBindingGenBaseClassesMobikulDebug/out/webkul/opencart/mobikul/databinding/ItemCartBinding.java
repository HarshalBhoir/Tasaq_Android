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
import webkul.opencart.mobikul.adapterModel.CartAdapterModel;
import webkul.opencart.mobikul.handlers.CartHandler;

public abstract class ItemCartBinding extends ViewDataBinding {
  @NonNull
  public final ImageView addQty;

  @NonNull
  public final RelativeLayout cartLayout;

  @NonNull
  public final TextView delete;

  @NonNull
  public final ImageView deleteBtn;

  @NonNull
  public final LinearLayout errorLL;

  @NonNull
  public final LinearLayout layoutContainer;

  @NonNull
  public final ImageView moveTOWishList;

  @NonNull
  public final LinearLayout optionsLL;

  @NonNull
  public final TextView productCustomOptions;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  @NonNull
  public final TextView qty;

  @NonNull
  public final LinearLayout qtyLayout;

  @NonNull
  public final TextView qtyTV;

  @NonNull
  public final TextView sellerStringTV;

  @NonNull
  public final ImageView subQty;

  @NonNull
  public final TextView subTotal;

  @NonNull
  public final CardView viewgap;

  @NonNull
  public final TextView wishlist;

  @Bindable
  protected CartAdapterModel mData;

  @Bindable
  protected CartHandler mHandler;

  protected ItemCartBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView addQty, RelativeLayout cartLayout, TextView delete,
      ImageView deleteBtn, LinearLayout errorLL, LinearLayout layoutContainer,
      ImageView moveTOWishList, LinearLayout optionsLL, TextView productCustomOptions,
      ImageView productImage, TextView productName, TextView productPrice, TextView qty,
      LinearLayout qtyLayout, TextView qtyTV, TextView sellerStringTV, ImageView subQty,
      TextView subTotal, CardView viewgap, TextView wishlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addQty = addQty;
    this.cartLayout = cartLayout;
    this.delete = delete;
    this.deleteBtn = deleteBtn;
    this.errorLL = errorLL;
    this.layoutContainer = layoutContainer;
    this.moveTOWishList = moveTOWishList;
    this.optionsLL = optionsLL;
    this.productCustomOptions = productCustomOptions;
    this.productImage = productImage;
    this.productName = productName;
    this.productPrice = productPrice;
    this.qty = qty;
    this.qtyLayout = qtyLayout;
    this.qtyTV = qtyTV;
    this.sellerStringTV = sellerStringTV;
    this.subQty = subQty;
    this.subTotal = subTotal;
    this.viewgap = viewgap;
    this.wishlist = wishlist;
  }

  public abstract void setData(@Nullable CartAdapterModel data);

  @Nullable
  public CartAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable CartHandler handler);

  @Nullable
  public CartHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCartBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_cart, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCartBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_cart, null, false, component);
  }

  public static ItemCartBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemCartBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ItemCartBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_cart);
  }
}
