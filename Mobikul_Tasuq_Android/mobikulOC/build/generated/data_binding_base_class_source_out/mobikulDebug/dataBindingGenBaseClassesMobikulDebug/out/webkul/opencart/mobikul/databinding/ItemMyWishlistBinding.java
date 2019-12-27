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
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.GetWishlistAdapterModel;
import webkul.opencart.mobikul.handlers.GetWishlistHandler;

public abstract class ItemMyWishlistBinding extends ViewDataBinding {
  @NonNull
  public final TextView addToCart;

  @NonNull
  public final TextView delete;

  @NonNull
  public final TextView name;

  @NonNull
  public final CardView newAddrContainer;

  @NonNull
  public final TextView newPrice;

  @NonNull
  public final LinearLayout newThemeLayout;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView sku;

  @NonNull
  public final TextView special;

  @NonNull
  public final LinearLayout wishlistItemDetailLayout;

  @Bindable
  protected GetWishlistHandler mHandler;

  @Bindable
  protected GetWishlistAdapterModel mData;

  protected ItemMyWishlistBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView addToCart, TextView delete, TextView name,
      CardView newAddrContainer, TextView newPrice, LinearLayout newThemeLayout,
      ImageView productImage, TextView sku, TextView special,
      LinearLayout wishlistItemDetailLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToCart = addToCart;
    this.delete = delete;
    this.name = name;
    this.newAddrContainer = newAddrContainer;
    this.newPrice = newPrice;
    this.newThemeLayout = newThemeLayout;
    this.productImage = productImage;
    this.sku = sku;
    this.special = special;
    this.wishlistItemDetailLayout = wishlistItemDetailLayout;
  }

  public abstract void setHandler(@Nullable GetWishlistHandler handler);

  @Nullable
  public GetWishlistHandler getHandler() {
    return mHandler;
  }

  public abstract void setData(@Nullable GetWishlistAdapterModel data);

  @Nullable
  public GetWishlistAdapterModel getData() {
    return mData;
  }

  @NonNull
  public static ItemMyWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMyWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMyWishlistBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_my_wishlist, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMyWishlistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMyWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMyWishlistBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_my_wishlist, null, false, component);
  }

  public static ItemMyWishlistBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemMyWishlistBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemMyWishlistBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_my_wishlist);
  }
}
