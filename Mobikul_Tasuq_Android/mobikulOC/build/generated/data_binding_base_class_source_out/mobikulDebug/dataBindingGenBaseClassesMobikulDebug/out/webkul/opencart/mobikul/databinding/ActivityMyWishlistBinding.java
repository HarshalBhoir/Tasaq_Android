package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public abstract class ActivityMyWishlistBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout emptyLayout;

  @NonNull
  public final TextView emptyText;

  @NonNull
  public final RelativeLayout mostParenLayout;

  @NonNull
  public final MaterialButton movetohomepage;

  @NonNull
  public final LinearLayout mywishlistContainer;

  @NonNull
  public final LinearLayout mywishlistLayout;

  @NonNull
  public final TextView mywishlistheading;

  @NonNull
  public final ProgressBar mywishlistprogress;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final View toolbar;

  @NonNull
  public final RecyclerView wishlistRecyclerview;

  protected ActivityMyWishlistBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, LinearLayout emptyLayout, TextView emptyText,
      RelativeLayout mostParenLayout, MaterialButton movetohomepage,
      LinearLayout mywishlistContainer, LinearLayout mywishlistLayout, TextView mywishlistheading,
      ProgressBar mywishlistprogress, ScrollView scrollView, View toolbar,
      RecyclerView wishlistRecyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.emptyLayout = emptyLayout;
    this.emptyText = emptyText;
    this.mostParenLayout = mostParenLayout;
    this.movetohomepage = movetohomepage;
    this.mywishlistContainer = mywishlistContainer;
    this.mywishlistLayout = mywishlistLayout;
    this.mywishlistheading = mywishlistheading;
    this.mywishlistprogress = mywishlistprogress;
    this.scrollView = scrollView;
    this.toolbar = toolbar;
    this.wishlistRecyclerview = wishlistRecyclerview;
  }

  @NonNull
  public static ActivityMyWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyWishlistBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_my_wishlist, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyWishlistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMyWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMyWishlistBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_my_wishlist, null, false, component);
  }

  public static ActivityMyWishlistBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMyWishlistBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMyWishlistBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_my_wishlist);
  }
}
