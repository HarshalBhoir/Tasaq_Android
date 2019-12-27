package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class SearchDialogActivityBinding extends ViewDataBinding {
  @NonNull
  public final ImageView back;

  @NonNull
  public final LinearLayout brandContainer;

  @NonNull
  public final RecyclerView brandList;

  @NonNull
  public final LinearLayout categoryContainer;

  @NonNull
  public final RecyclerView categoryProduct;

  @NonNull
  public final LinearLayout dialog;

  @NonNull
  public final ImageView emptySearch;

  @NonNull
  public final RecyclerView latestProduct;

  @NonNull
  public final LinearLayout latestProductContainer;

  @NonNull
  public final ImageView mlkit;

  @NonNull
  public final RecyclerView recentSearch;

  @NonNull
  public final LinearLayout recentSearchContainer;

  @NonNull
  public final RecyclerView recentViewed;

  @NonNull
  public final LinearLayout recentViewedContainer;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final NestedScrollView scrollView2;

  @NonNull
  public final AutoCompleteTextView searchEdt;

  @NonNull
  public final RecyclerView searchList;

  @NonNull
  public final TextView tvBrand;

  @NonNull
  public final TextView tvCategoryProduct;

  @NonNull
  public final TextView tvLatestProduct;

  @NonNull
  public final TextView tvSearch;

  @NonNull
  public final TextView tvView;

  protected SearchDialogActivityBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView back, LinearLayout brandContainer, RecyclerView brandList,
      LinearLayout categoryContainer, RecyclerView categoryProduct, LinearLayout dialog,
      ImageView emptySearch, RecyclerView latestProduct, LinearLayout latestProductContainer,
      ImageView mlkit, RecyclerView recentSearch, LinearLayout recentSearchContainer,
      RecyclerView recentViewed, LinearLayout recentViewedContainer, NestedScrollView scrollView,
      NestedScrollView scrollView2, AutoCompleteTextView searchEdt, RecyclerView searchList,
      TextView tvBrand, TextView tvCategoryProduct, TextView tvLatestProduct, TextView tvSearch,
      TextView tvView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.brandContainer = brandContainer;
    this.brandList = brandList;
    this.categoryContainer = categoryContainer;
    this.categoryProduct = categoryProduct;
    this.dialog = dialog;
    this.emptySearch = emptySearch;
    this.latestProduct = latestProduct;
    this.latestProductContainer = latestProductContainer;
    this.mlkit = mlkit;
    this.recentSearch = recentSearch;
    this.recentSearchContainer = recentSearchContainer;
    this.recentViewed = recentViewed;
    this.recentViewedContainer = recentViewedContainer;
    this.scrollView = scrollView;
    this.scrollView2 = scrollView2;
    this.searchEdt = searchEdt;
    this.searchList = searchList;
    this.tvBrand = tvBrand;
    this.tvCategoryProduct = tvCategoryProduct;
    this.tvLatestProduct = tvLatestProduct;
    this.tvSearch = tvSearch;
    this.tvView = tvView;
  }

  @NonNull
  public static SearchDialogActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchDialogActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchDialogActivityBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_dialog_activity, root, attachToRoot, component);
  }

  @NonNull
  public static SearchDialogActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchDialogActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchDialogActivityBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_dialog_activity, null, false, component);
  }

  public static SearchDialogActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchDialogActivityBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchDialogActivityBinding)bind(component, view, webkul.opencart.mobikul.R.layout.search_dialog_activity);
  }
}
