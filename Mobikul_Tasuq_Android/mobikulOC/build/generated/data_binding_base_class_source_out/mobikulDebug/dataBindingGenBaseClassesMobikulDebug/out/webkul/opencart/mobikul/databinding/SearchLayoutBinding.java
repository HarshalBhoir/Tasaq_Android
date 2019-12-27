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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public abstract class SearchLayoutBinding extends ViewDataBinding {
  @NonNull
  public final Button back;

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
  public final ScrollView scrollView2;

  @NonNull
  public final AutoCompleteTextView searchEdt;

  @NonNull
  public final LinearLayout searchList;

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

  protected SearchLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button back, LinearLayout brandContainer, RecyclerView brandList,
      LinearLayout categoryContainer, RecyclerView categoryProduct, LinearLayout dialog,
      ImageView emptySearch, RecyclerView latestProduct, LinearLayout latestProductContainer,
      RecyclerView recentSearch, LinearLayout recentSearchContainer, RecyclerView recentViewed,
      LinearLayout recentViewedContainer, NestedScrollView scrollView, ScrollView scrollView2,
      AutoCompleteTextView searchEdt, LinearLayout searchList, TextView tvBrand,
      TextView tvCategoryProduct, TextView tvLatestProduct, TextView tvSearch, TextView tvView) {
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
  public static SearchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SearchLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_layout, null, false, component);
  }

  public static SearchLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.search_layout);
  }
}
