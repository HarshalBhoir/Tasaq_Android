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
import webkul.opencart.mobikul.handlers.SubCategoryGridHandler;
import webkul.opencart.mobikul.model.subcategoryModel.Category;

public abstract class SubCategoryGridBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout rlParent;

  @NonNull
  public final CardView shimmerViewContainer;

  @NonNull
  public final ImageView subCategoryImage;

  @NonNull
  public final LinearLayout subcategoryLayout;

  @NonNull
  public final TextView subcategoryTxt;

  @Bindable
  protected Category mData;

  @Bindable
  protected SubCategoryGridHandler mHandler;

  protected SubCategoryGridBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout rlParent, CardView shimmerViewContainer,
      ImageView subCategoryImage, LinearLayout subcategoryLayout, TextView subcategoryTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rlParent = rlParent;
    this.shimmerViewContainer = shimmerViewContainer;
    this.subCategoryImage = subCategoryImage;
    this.subcategoryLayout = subcategoryLayout;
    this.subcategoryTxt = subcategoryTxt;
  }

  public abstract void setData(@Nullable Category data);

  @Nullable
  public Category getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable SubCategoryGridHandler handler);

  @Nullable
  public SubCategoryGridHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static SubCategoryGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubCategoryGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubCategoryGridBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.sub_category_grid, root, attachToRoot, component);
  }

  @NonNull
  public static SubCategoryGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubCategoryGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubCategoryGridBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.sub_category_grid, null, false, component);
  }

  public static SubCategoryGridBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SubCategoryGridBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SubCategoryGridBinding)bind(component, view, webkul.opencart.mobikul.R.layout.sub_category_grid);
  }
}
